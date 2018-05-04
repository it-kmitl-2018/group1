package th.ac.kmitl.it.se.soa2018.group1.application.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductCategoryTest {

    private final String code = "14111507";
    private final String name = "กระดาษถ่ายเอกสารหรือพิมพ์งานทั่วไป";

    @Test
    public void checkInputCorrectData() {
        ProductCategory productCategory = ProductCategory.builder()
                .code(this.code)
                .name(this.name)
                .build();
        assertEquals(this.code, productCategory.getCode());
        assertEquals(this.name, productCategory.getName());
    }

}
