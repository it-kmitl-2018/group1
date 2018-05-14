package th.ac.kmitl.it.se.soa2018.group1.application.json;

import org.junit.Test;
import  static  org.junit.Assert.assertEquals;

public class AddressJsonTest {

    private String lineOne = "สำนักงานใหญ่ เลขที่ 313/1";
    private String lineTwo = "ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี กรุงเทพมหานคร 10600";
    private String cityName = "ธนบุรี";
    private String citySubDivisionName = "บุคคโล";
    private String postCode = "10600";
    private String countrySubDivision = "กรุงเทพมหานคร";
    private String countryName = "TH";

    @Test
    public void shouldGetAllInfo() {
        AddressJson addressJson = AddressJson.builder()
                .lineOne(this.lineOne)
                .lineTwo(this.lineTwo)
                .cityName(this.cityName)
                .citySubDivisionName(this.citySubDivisionName)
                .postCode(this.postCode)
                .countrySubDivision(this.countrySubDivision)
                .countryName(this.countryName)
                .build();

        assertEquals(this.lineOne , addressJson.lineOne);
        assertEquals(this.lineTwo , addressJson.lineTwo);
        assertEquals(this.cityName , addressJson.cityName);
        assertEquals(this.citySubDivisionName , addressJson.citySubDivisionName);
        assertEquals(this.postCode , addressJson.postCode);
        assertEquals(this.countrySubDivision , addressJson.countrySubDivision);
        assertEquals(this.countryName , addressJson.countryName);
    }
}