package th.ac.kmitl.it.se.soa2018.group1.application.model;

import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;

public class ExchangedDocumentTest {

    private final String ID = "";
    private final String NAME = "ใบแจ้งหนี้";
    private final String TYPE_CODE = "380";
    private final Timestamp ISSUE_DATE_TIME = new Timestamp((System.currentTimeMillis()));
    private final String PURPOSE = "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง";
    private final String PURPOSE_CODE = "DCNS03";
    private final String GLOBAL_ID = "2.16.764.1.1.2.1.X.X.X";
    private final Timestamp CREATION_DATE_TIME = new Timestamp(System.currentTimeMillis());
    private final IncludedNote INCLUDED_NOTE = new IncludedNote();

    @Test
    public void checkInputCorrectData() {
        ExchangedDocument exchangedDocument = ExchangedDocument.builder()
                .id(this.ID)
                .name(this.NAME)
                .typeCode(this.TYPE_CODE)
                .issueDateTime(this.ISSUE_DATE_TIME)
                .purpose(this.PURPOSE)
                .purposeCode(this.PURPOSE_CODE)
                .globalId(this.GLOBAL_ID)
                .creationDateTime(this.CREATION_DATE_TIME)
                .includedNote(this.INCLUDED_NOTE)
                .build();

        assertEquals(this.ID, exchangedDocument.getId());
        assertEquals(this.NAME, exchangedDocument.getName());
        assertEquals(this.TYPE_CODE, exchangedDocument.getTypeCode());
        assertEquals(this.ISSUE_DATE_TIME, exchangedDocument.getIssueDateTime());
        assertEquals(this.PURPOSE, exchangedDocument.getPurpose());
        assertEquals(this.PURPOSE_CODE, exchangedDocument.getPurposeCode());
        assertEquals(this.GLOBAL_ID, exchangedDocument.getGlobalId());
        assertEquals(this.CREATION_DATE_TIME, exchangedDocument.getCreationDateTime());
        assertEquals(this.INCLUDED_NOTE, exchangedDocument.getIncludedNote());

    }

}
