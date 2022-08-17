package api.v1.service;

import api.v1.entity.Member;
import api.v1.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    public Member updateMember(long memberId, Member member) {
        Member findMember = memberRepository.findById(memberId).orElseThrow();

        Optional.ofNullable(member.getName())
                .ifPresent(findMember::setName);
        Optional.ofNullable(member.getPassword())
                .ifPresent(findMember::setPassword);
        Optional.ofNullable(member.getSex())
                .ifPresent(findMember::setSex);
        Optional.ofNullable(member.getCompanyLocation())
                .ifPresent(companyLocation -> findMember.setCompanyLocation(companyLocation));
        Optional.ofNullable(member.getCompanyType())
                .ifPresent(companyType -> findMember.setCompanyType(companyType));
        Optional.ofNullable(member.getCompanyName())
                .ifPresent(companyName -> findMember.setCompanyName(companyName));

        return memberRepository.save(findMember);
    }

    public Member findMember(long memberId) {
        return memberRepository.findById(memberId).orElseThrow();
    }

    @Transactional(readOnly = true)
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public void deleteMember(long memberId) {
        Member findMember = memberRepository.findById(memberId).orElseThrow();
        memberRepository.delete(findMember);
    }
}
