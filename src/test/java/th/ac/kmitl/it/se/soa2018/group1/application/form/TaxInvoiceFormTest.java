package th.ac.kmitl.it.se.soa2018.group1.application.form;

import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.*;

public class TaxInvoiceFormTest {

    private String id = "KSLQO1205412398521673";
    private String name = "ใบแจ้งหนี้ (Invoice)";
    private String typeCode = "308";
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private String purpose = "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง";
    private String purposeCode = "KAOD01";
    private String globalId = "2.16.764.1.1.2.1.X.X.X";
    private String subject = "หมายเหตุ";
    private String content = "ค่าบริการเพิ่มเติม";

    @Test
    public void shouldGetAllInfo() {
        TaxInvoiceForm taxInvoiceForm = TaxInvoiceForm.builder()
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

        assertEquals(this.id, taxInvoiceForm.getId());
        assertEquals(this.name, taxInvoiceForm.getName());
        assertEquals(this.typeCode, taxInvoiceForm.getTypeCode());
        assertEquals(this.issueDateTime, taxInvoiceForm.getIssueDateTime());
        assertEquals(this.purpose, taxInvoiceForm.getPurpose());
        assertEquals(this.purposeCode, taxInvoiceForm.getPurposeCode());
        assertEquals(this.globalId, taxInvoiceForm.getGlobalId());
        assertEquals(this.subject, taxInvoiceForm.getSubject());
        assertEquals(this.content, taxInvoiceForm.getContent());
    }
}