package th.ac.kmitl.it.se.soa2018.group1.TaxInvoiceWebApplication.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellerTradePartyTest {
    private final String NAME = "บริษัท ร่วมสมัยธุรกรรมอิเล็กทรอนิกส์ จำกัด";
    private final String TXID = "057552600909900000";

    @Test
    public void checkInputCorrectData() {
        SellerTradeParty sellerTradeParty = new SellerTradeParty();
        sellerTradeParty.setName(NAME);
        sellerTradeParty.setTXID(TXID);

        assertEquals(NAME, sellerTradeParty.getName());
        assertEquals(TXID, sellerTradeParty.getTXID());
    }


}
