package th.ac.kmitl.it.se.soa2018.group1.TaxInvoiceWebApplication.model;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExchangedDocumentTest {

    private final String ID = "RDTIV0575526000058001";
    private final String NAME = "ใบกำ กบั ภำษี";
    private final String TYPE_CODE = "338";
    private final String ISSUE_DATE_TIME = "2016-09-12T19:19:25.0";
    private final String CREATEION_DATE_TIME = "2016-09-12T15:51:26.0";

    @Test
    public void checkInputCorrectData(){
        ExchangedDocument exchangedDocument = new ExchangedDocument();
        exchangedDocument.setId(this.ID);
        exchangedDocument.setName(this.NAME);
        exchangedDocument.setTypeCode(this.TYPE_CODE);
        exchangedDocument.setIssueDateTime(this.ISSUE_DATE_TIME);
        exchangedDocument.setCreationDateTime(this.CREATEION_DATE_TIME);

        assertEquals(ID, exchangedDocument.getId());
        assertEquals(NAME, exchangedDocument.getName());
        assertEquals(TYPE_CODE, exchangedDocument.getTypeCode());
        assertEquals(ISSUE_DATE_TIME, exchangedDocument.getIssueDateTime());
        assertEquals(CREATEION_DATE_TIME, exchangedDocument.getCreationDateTime());
    }




}
