package th.ac.kmitl.it.se.soa2018.group1.application.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressTest {

    private final String postCode = "10520";
    private final String buildingName = "บีบีคอร์ท";
    private final String soi = "บ้านกลางสวน";
    private final String village = "-";
    private final String moo = "-";
    private final String streetName = "ฉลองกรุง 1";
    private final String cityName = "กรุงเทพมหานครฯ";
    private final String citySubDivisionName = "ลาดกระบัง";
    private final String countryId = "TH";
    private final String countrySubDivisionId = "2";
    private final String buildingNumber = "661/3";

    @Test
    public void checkInputCorrectData() {

        Address address = Address.builder()
                .postCode(this.postCode)
                .buildingName(this.buildingName)
                .soi(this.soi)
                .village(this.village)
                .moo(this.moo)
                .streetName(this.streetName)
                .cityName(this.cityName)
                .citySubDivisionName(this.citySubDivisionName)
                .countryId(this.countryId)
                .countrySubDivisionId(this.countrySubDivisionId)
                .buildingNumber(this.buildingNumber)
                .build();

        assertEquals(this.postCode, address.getPostCode());
        assertEquals(this.buildingName, address.getBuildingName());
        assertEquals(this.soi, address.getSoi());
        assertEquals(this.village, address.getVillage());
        assertEquals(this.moo, address.getMoo());
        assertEquals(this.streetName, address.getStreetName());
        assertEquals(this.cityName, address.getCityName());
        assertEquals(this.citySubDivisionName, address.getCitySubDivisionName());
        assertEquals(this.countryId, address.getCountryId());
        assertEquals(this.countrySubDivisionId, address.getCountrySubDivisionId());
        assertEquals(this.buildingNumber, address.getBuildingNumber());

    }

}
