package th.ac.kmitl.it.se.soa2018.group1.application.model;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
@Builder
public @Data
class ExchangedDocument {

    private String id;
    private String name;
    private String typeCode;
    private Timestamp issueDateTime;
    private String purpose;
    private String purposeCode;
    private String globalId;
    private Timestamp creationDateTime;
    private IncludedNote includedNote;

}
