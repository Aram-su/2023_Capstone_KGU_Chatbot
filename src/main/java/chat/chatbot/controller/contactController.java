package chat.chatbot.controller;

import chat.chatbot.menu.Professor;
import chat.chatbot.service.ChatbotClientService;
import chat.chatbot.service.ProfessorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class contactController {

    @PostMapping("/contacts")
    public Professor contactsData() {

        ChatbotClientService ccs = new ChatbotClientService();
        String p_code = ccs.Client("김도훈 교수님");

        return ProfessorService.findProfessorByCode(p_code);
    }
}
