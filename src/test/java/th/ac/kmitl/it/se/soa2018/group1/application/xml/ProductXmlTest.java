package th.ac.kmitl.it.se.soa2018.group1.application.xml;

import org.junit.Test;
import th.ac.kmitl.it.se.soa2018.group1.application.model.IncludedNote;
import th.ac.kmitl.it.se.soa2018.group1.application.model.ProductCategory;

import java.sql.Timestamp;

import static org.junit.Assert.*;

public class ProductXmlTest {
    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "12345678901234";
    private String name = "กระดาษถ่ายเอกสาร A4 80 แกรม Double A";
    private String description = "ใช้งานร่วมกับเครื่องถ่ายเอกสาร เครื่องพิมพ์อิงค์เจ็ท เครื่องพิมพ์เลเซอร์ และเครื่องพิมพ์ดีดทั่วไป";
    private String lotNumber = "10000";
    private Timestamp expiryDateTime = new Timestamp(System.currentTimeMillis());
    private ProductCategory productCategory = ProductCategory.builder().build();
    private String countryId = "TH";
    private IncludedNote note = IncludedNote.builder().build();

    @Test
    public void shouldGetAllInfo(){
        ProductXml productXml = ProductXml.builder()
                .id(this.id)
                .globalId(this.globalId)
                .name(this.name)
                .description(this.description)
                .lotNumber(this.lotNumber)
                .expiryDateTime(this.expiryDateTime)
                .productCategory(this.productCategory)
                .countryId(this.countryId)
                .note(this.note)
                .build();

        assertEquals(this.id , productXml.id);
        assertEquals(this.globalId , productXml.globalId);
        assertEquals(this.name , productXml.name);
        assertEquals(this.description, productXml.description);
        assertEquals(this.lotNumber , productXml.lotNumber);
        assertEquals(this.expiryDateTime , productXml.expiryDateTime);
        assertEquals(this.productCategory , productXml.productCategory);
        assertEquals(this.countryId , productXml.countryId);
        assertEquals(this.note , productXml.note);
    }

}