package chat.chatbot.controller;

import chat.chatbot.data.Professor;
import chat.chatbot.service.ChatbotClientService;
import chat.chatbot.service.ProfessorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class contactController {

    public String code;

    @PostMapping("/contacts")
    public Professor contactsData() {
        System.out.println( "contact" );
        System.out.println( ProfessorService.findProfessorByCode(code) );

        return ProfessorService.findProfessorByCode(code);
    }
}
