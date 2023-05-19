package chat.chatbot.menu;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;

@Table(name="professor") @Entity @JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Professor {

    @Id @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String code;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String name;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String department;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String phone;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String email;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
