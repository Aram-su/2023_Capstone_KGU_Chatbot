package chat.chatbot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class contactController {

    @PostMapping("/contacts")
    public String contactsData() {
        try {
            return "Contacts Data";
        } catch (Exception e) {
            return "Error occurred while converting data to JSON.";
        }
    }
}
