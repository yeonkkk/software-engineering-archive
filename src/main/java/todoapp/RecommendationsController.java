package todoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationsController {

    @GetMapping("/")
    public String startTodoTest() {
        return "To-do Application !";
    }
}
