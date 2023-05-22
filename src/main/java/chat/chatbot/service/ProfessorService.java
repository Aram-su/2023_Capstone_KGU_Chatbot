package chat.chatbot.service;

import chat.chatbot.data.Professor;
import chat.chatbot.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    private static ProfessorRepository professorRepository;

    @Autowired
    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public static Professor findProfessorByName(String name) {
        return professorRepository.findByName(name);
    }

    public static Professor findProfessorByCode(String code) {
        return professorRepository.findByCode(code);
    }
}
