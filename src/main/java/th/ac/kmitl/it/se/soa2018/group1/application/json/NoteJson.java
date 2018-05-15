package th.ac.kmitl.it.se.soa2018.group1.application.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class NoteJson {

    @JsonProperty("subject")
    public String subject;

    @JsonProperty("content")
    public String content;
}


