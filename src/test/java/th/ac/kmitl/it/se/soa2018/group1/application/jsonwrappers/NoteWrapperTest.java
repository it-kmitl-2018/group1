package th.ac.kmitl.it.se.soa2018.group1.application.jsonwrappers;

import org.junit.Test;
import th.ac.kmitl.it.se.soa2018.group1.application.model.IncludedNote;
import static org.junit.Assert.assertEquals;

public class NoteWrapperTest {

    private String subject = "หมายเหตุ";
    private String content = "";
    private IncludedNote includedNote;

    @Test
    public void shouldGetAllInfo(){
        includedNote = new IncludedNote();
        includedNote.setContent(content);
        includedNote.setSubject(subject);
        NoteWrapper noteWrapper = new NoteWrapper(includedNote);

        assertEquals(this.includedNote, noteWrapper.includedNote);
    }

}