package th.ac.kmitl.it.se.soa2018.group1.application.form;

import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Builder
public @Data
class TaxInvoiceForm {

    private String id;
    private String name;
    private String typeCode;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Timestamp issueDateTime;
    private String purpose;
    private String purposeCode;
    private String globalId;
    private String subject;
    private String content;

}
