package api.v1.controller;

import api.v1.entity.Member;
import api.v1.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/members")
public class MemberController {

    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity postMember(@RequestBody Member member) {
        Member createdMember = memberService.createMember(member);
        return new ResponseEntity<>(createdMember, HttpStatus.CREATED);
    }

    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@PathVariable(value = "member-id") long memberId,
                                      @RequestBody Member member) {
        Member updatedMember = memberService.updateMember(memberId, member);
        return new ResponseEntity<>(updatedMember,HttpStatus.OK);
    }

    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable(value = "member-id") long memberId) {
        Member findMember = memberService.findMember(memberId);
        return new ResponseEntity<>(findMember, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getMembers() {
        List<Member> members = memberService.findMembers();
        return new ResponseEntity(members, HttpStatus.OK);
    }

    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable(value = "member-id") long memberId) {
        memberService.deleteMember(memberId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
