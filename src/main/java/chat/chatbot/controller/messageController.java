package chat.chatbot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class messageController {

    @PostMapping("/messages")
    public String messageData(String message) {
        System.out.println(message);

        // 응답 데이터를 생성하여 반환
        String response = "msg response";
        return response;
    }
}
