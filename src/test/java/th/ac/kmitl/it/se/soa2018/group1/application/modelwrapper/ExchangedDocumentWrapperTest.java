package th.ac.kmitl.it.se.soa2018.group1.application.modelwrapper;

import org.junit.Test;
import th.ac.kmitl.it.se.soa2018.group1.application.form.TaxInvoiceForm;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;


public class ExchangedDocumentWrapperTest {
    private String subject = "หมายเหตุ";
    private String content = "ค่าบริการเพิ่มเติม";
    private String id = "RDTIV0575526000058001";
    private String name = "ใบแจ้งหนี้ (Invoice)";
    private String typeCode = "308";
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private String purpose = "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง";
    private String purposeCode = "DCNS03";
    private String globalId = "2.16.764.1.1.2.1.X.X.X";
    private TaxInvoiceForm taxInvoiceForm;

    @Test
    public void shouldGetAllInfo() {
        this.taxInvoiceForm = TaxInvoiceForm.builder()
                .id(this.id)
                .name(this.name)
                .typeCode(this.typeCode)
                .issueDateTime(this.issueDateTime)
                .purpose(this.purpose)
                .purposeCode(this.purposeCode)
                .globalId(this.globalId)
                .subject(this.subject)
                .content(this.content)
                .build();
        ExchangedDocumentWrapper wrapper = new ExchangedDocumentWrapper(taxInvoiceForm);

        assertEquals(this.taxInvoiceForm, wrapper.taxInvoiceForm);
    }
}