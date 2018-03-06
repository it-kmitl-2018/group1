package th.ac.kmitl.it.se.soa2018.group1.TaxInvoiceWebApplication.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IncludeNoteTest {

    private final String SUBJECT = "หมำยเหตุ";
    private final String CONTENT= "";

    @Test
    public void IncluseNoteTest(){
        IncludedNote incluseNote = new IncludedNote();
        incluseNote.setSubject(this.SUBJECT);
        incluseNote.setContent(this.CONTENT);

        assertEquals(SUBJECT, incluseNote.getSubject());
        assertEquals(CONTENT, incluseNote.getContent());
    }

}
