package th.ac.kmitl.it.se.soa2018.group1.application.json;

import org.junit.Test;
import static  org.junit.Assert.assertEquals;
public class NoteJsonTest {
    private String subject;
    private String content;

    @Test
    public void shouldGetAllInfo() {
        NoteJson noteJson = NoteJson.builder()
                .content(this.content)
                .subject(this.subject)
                .build();

        assertEquals(this.content, noteJson.content);
        assertEquals(this.subject, noteJson.subject);
    }

}