package th.ac.kmitl.it.se.soa2018.group1.application.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellerAddressModelTest {

    private final String POSTCODE = "10310";
    private final String CITY_NAME = "1017";
    private final String CITY_SUB_DIVISION_NAME = "101701";
    private final String COUNTRY_ID = "TH";
    private final int COUNTRY_SUB_DIVISION_ID = 10;
    private final String BUILDING_NUMBER = "3/34";

    @Test
    public void checkInputCorrectData() {
        SellerAddressModel sellerAddressModel = new SellerAddressModel();
        sellerAddressModel.setPostcode(this.POSTCODE);
        sellerAddressModel.setCityName(this.CITY_NAME);
        sellerAddressModel.setCitySubDivisionName(this.CITY_SUB_DIVISION_NAME);
        sellerAddressModel.setCountryID(this.COUNTRY_ID);
        sellerAddressModel.setCountrySubDivisionID(this.COUNTRY_SUB_DIVISION_ID);
        sellerAddressModel.setBuildingNumber(this.BUILDING_NUMBER);

        assertEquals(POSTCODE, sellerAddressModel.getPostcode());
        assertEquals(CITY_NAME, sellerAddressModel.getCityName());
        assertEquals(CITY_SUB_DIVISION_NAME, sellerAddressModel.getCitySubDivisionName());
        assertEquals(COUNTRY_ID, sellerAddressModel.getCountryID());
        assertEquals(COUNTRY_SUB_DIVISION_ID, sellerAddressModel.getCountrySubDivisionID());
        assertEquals(BUILDING_NUMBER, sellerAddressModel.getBuildingNumber());
    }
}
