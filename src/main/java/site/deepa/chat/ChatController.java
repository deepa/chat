package site.deepa.chat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @RequestMapping("/")
    public String hello() {
        return "Hello world";
    }

}