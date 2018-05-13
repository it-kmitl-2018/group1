package th.ac.kmitl.it.se.soa2018.group1.application.model;

import org.junit.Test;
import java.sql.Timestamp;
import static org.junit.Assert.assertEquals;

public class ProductTest {

    private String id = "PR00001";
    private String globalID = "12345678901234";
    private String name = "ดินสอเขียนคิ้ว";
    private String description = "ดินสอเนื้อครีม สีน้ำตาลอ่อน";
    private Timestamp expireDateTime = new Timestamp(System.currentTimeMillis());
    private ProductCategory productCategory = ProductCategory.builder().build();
    private String countryID = "TH";
    private IncludedNote includedNote = new IncludedNote();

    @Test
    public void checkInputCorrectData() {
        Product product = Product.builder()
                .id(this.id)
                .globalID(this.globalID)
                .globalID(this.globalID)
                .name(this.name)
                .description(this.description)
                .expireDateTime(this.expireDateTime)
                .productCategory(this.productCategory)
                .countryID(this.countryID)
                .includedNote(this.includedNote)
                .build();
        assertEquals(this.id, product.getId());
        assertEquals(this.globalID, product.getGlobalID());
        assertEquals(this.name, product.getName());
        assertEquals(this.description, product.getDescription());
        assertEquals(this.expireDateTime, product.getExpireDateTime());
        assertEquals(this.productCategory, product.getProductCategory());
        assertEquals(this.countryID, product.getCountryID());
    }

}
