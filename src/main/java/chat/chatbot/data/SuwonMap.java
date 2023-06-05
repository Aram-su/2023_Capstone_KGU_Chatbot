package chat.chatbot.data;

import com.fasterxml.jackson.annotation.JsonInclude;

public class SuwonMap {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String code;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String location;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
