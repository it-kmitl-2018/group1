package th.ac.kmitl.it.se.soa2018.group1.application.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncludedNoteTest {

    private final String SUBJECT = "หมายเหตุ";
    private final String CONTENT = "กรณีเสนอขายใบสำคัญแสดงสิทธิอนุพันธ์ ให้รายงานผลการขายภายใน 45 วันนับแต่วันปิดขาย";
    @Test
    public void checkInputCorrectData() {
        IncludedNote includedNote = IncludedNote.builder().build();
        includedNote.setSubject(this.SUBJECT);
        includedNote.setContent(this.CONTENT);

        assertEquals(this.SUBJECT, includedNote.getSubject());
        assertEquals(this.CONTENT, includedNote.getContent());
    }

}
