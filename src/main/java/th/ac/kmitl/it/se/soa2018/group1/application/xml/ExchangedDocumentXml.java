package th.ac.kmitl.it.se.soa2018.group1.application.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Builder;

import java.sql.Timestamp;

@Builder
public class ExchangedDocumentXml {

    @JacksonXmlProperty(localName = "id")
    public String id;

    @JacksonXmlProperty(localName = "name")
    public String name;

    @JacksonXmlProperty(localName = "type_code")
    public String typeCode;

    @JacksonXmlProperty(localName = "issue_date_time")
    public Timestamp issueDateTime;

    @JacksonXmlProperty(localName = "purpose")
    public String purpose;

    @JacksonXmlProperty(localName = "purpose_code")
    public String purposeCode;

    @JacksonXmlProperty(localName = "global_id")
    public String globalId;

    @JacksonXmlProperty(localName = "creation_date_time")
    public Timestamp creationDateTime;

    @JacksonXmlProperty(localName = "subject")
    public String subject;

    @JacksonXmlProperty(localName = "content")
    public String content;
}
