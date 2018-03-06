package th.ac.kmitl.it.se.soa2018.group1.TaxInvoiceWebApplication.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PostalTradeAddressTest {

    private final String POSTCODE_CODE = "10310";
    private final String CITY_NAME = "1017";
    private final String CITY_SUB_DIVISION_NAME = "101701";
    private final String COUNTRY_ID = "TH";
    private final int COUNTRY_SUB_DIVISION_ID = 10;
    private final String BUILDING_NUMBER = "3/34";

    @Test
    public void checkInputCorrectData() {
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setPostcodeCode(this.POSTCODE_CODE);
        postalTradeAddress.setCityName(this.CITY_NAME);
        postalTradeAddress.setCitySubDivisionName(this.CITY_SUB_DIVISION_NAME);
        postalTradeAddress.setCountryID(this.COUNTRY_ID);
        postalTradeAddress.setCountrySubDivisionID(this.COUNTRY_SUB_DIVISION_ID);
        postalTradeAddress.setBuildingNumber(this.BUILDING_NUMBER);

        assertEquals(POSTCODE_CODE, postalTradeAddress.getPostcodeCode());
        assertEquals(CITY_NAME, postalTradeAddress.getCityName());
        assertEquals(CITY_SUB_DIVISION_NAME, postalTradeAddress.getCitySubDivisionName());
        assertEquals(COUNTRY_ID, postalTradeAddress.getCountryID());
        assertEquals(COUNTRY_SUB_DIVISION_ID, postalTradeAddress.getCountrySubDivisionID());
        assertEquals(BUILDING_NUMBER, postalTradeAddress.getBuildingNumber());
    }
}
