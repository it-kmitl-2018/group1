package th.ac.kmitl.it.se.soa2018.group1.application.model;

import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;

public class ExchangeTest {

    private final String ID = "docu12345678";
    private final String NAME = "ใบแจ้งหนี้";
    private final String TYPE_EXCHANGE_ID = "380";
    private final Timestamp ISSUE_DATE_TIME = new Timestamp((System.currentTimeMillis()));
    private final String PURPOSE_EXCHANGE = "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง";
    private final String PURPOSE_EXCHANGE_ID = "DCNS03";
    private final String EXCHANGED_GLOBAL_ID = "2.16.764.1.1.2.1.X.X.X";
    private final Timestamp CREATION_DATE_TIME = new Timestamp(System.currentTimeMillis());
    private final IncludedNote INCLUDED_NOTE = new IncludedNote();

    @Test
    public void checkInputCorrectData() {

        Exchange exchange = Exchange.builder()
                .id(this.ID)
                .name(this.NAME)
                .typeExchangeID(this.TYPE_EXCHANGE_ID)
                .issueDateTime(this.ISSUE_DATE_TIME)
                .purposeExchange(this.PURPOSE_EXCHANGE)
                .purposeExchangeID(this.PURPOSE_EXCHANGE_ID)
                .exchangeGlobalID(this.EXCHANGED_GLOBAL_ID)
                .creationDateTime(this.CREATION_DATE_TIME)
                .includedNote(this.INCLUDED_NOTE)
                .build();

        assertEquals(this.ID, exchange.getId());
        assertEquals(this.NAME, exchange.getName());
        assertEquals(this.TYPE_EXCHANGE_ID, exchange.getTypeExchangeID());
        assertEquals(this.ISSUE_DATE_TIME, exchange.getIssueDateTime());
        assertEquals(this.PURPOSE_EXCHANGE, exchange.getPurposeExchange());
        assertEquals(this.PURPOSE_EXCHANGE_ID, exchange.getPurposeExchangeID());
        assertEquals(this.EXCHANGED_GLOBAL_ID, exchange.getExchangeGlobalID());
        assertEquals(this.CREATION_DATE_TIME, exchange.getCreationDateTime());
        assertEquals(this.INCLUDED_NOTE, exchange.getIncludedNote());

    }

}
