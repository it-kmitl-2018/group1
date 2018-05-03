package th.ac.kmitl.it.se.soa2018.group1.application.model;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Builder
public @Data class Exchange {

    private String id;
    private String name;
    private String typeExchangeID;
    private Timestamp issueDateTime;
    private String purposeExchange;
    private String purposeExchangeID;
    private String exchangeGlobalID;
    private Timestamp creationDateTime;
    private IncludedNote includedNote;

}
