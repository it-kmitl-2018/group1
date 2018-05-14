package th.ac.kmitl.it.se.soa2018.group1.application.xml;

import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;

public class ExchangedDocumentXmlTest {

    private String id = "KSLQO1205412398521673";
    private String name = "ใบแจ้งหนี้ (Invoice)";
    private String typeCode = "308";
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private String purpose = "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง";
    private String purposeCode = "KAOD01";
    private String globalId = "2.16.764.1.1.2.1.X.X.X";
    private Timestamp creationDateTime = new Timestamp(System.currentTimeMillis());
    private String subject = "หมายเหตุ";
    private String content = "";

    @Test
    public void shouldGetAllInfo(){
        ExchangedDocumentXml exchangedDocumentXml = ExchangedDocumentXml.builder()
                .id(id)
                .name(name)
                .typeCode(typeCode)
                .issueDateTime(issueDateTime)
                .purpose(purpose)
                .purposeCode(purposeCode)
                .globalId(globalId)
                .creationDateTime(creationDateTime)
                .subject(subject)
                .content(content)
                .build();

        assertEquals(this.id , exchangedDocumentXml.id);
        assertEquals(this.name , exchangedDocumentXml.name);
        assertEquals(this.typeCode , exchangedDocumentXml.typeCode);
        assertEquals(this.issueDateTime, exchangedDocumentXml.issueDateTime);
        assertEquals(this.purpose , exchangedDocumentXml.purpose);
        assertEquals(this.purposeCode , exchangedDocumentXml.purposeCode);
        assertEquals(this.globalId , exchangedDocumentXml.globalId);
        assertEquals(this.creationDateTime , exchangedDocumentXml.creationDateTime);
        assertEquals(this.subject , exchangedDocumentXml.subject);
        assertEquals(this.content , exchangedDocumentXml.content);
    }

}