package chat.chatbot.controller;

import chat.chatbot.data.InputMessage;
import chat.chatbot.service.ChatbotClientService;
import chat.chatbot.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class messageController {

    private final contactController contactController;

    @Autowired
    public messageController(contactController contactController) {
        this.contactController = contactController;
    }

    @PostMapping("/messages")
    public <T> T messageData(@RequestBody InputMessage msg) throws IOException {
        System.out.println(msg.getMessage());

        String code = new ChatbotClientService().Client(msg.getMessage());

        if ( code.equals("050101") || code.equals("050201")){
            return (T) libraryController.librariesData();
        }

        if ( code.substring(0,2).equals("02")){
            contactController.code = code;
            return (T) contactController.contactsData();
        }
        return null;
    }
}
