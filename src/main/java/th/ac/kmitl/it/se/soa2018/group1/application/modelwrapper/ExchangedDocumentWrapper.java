package th.ac.kmitl.it.se.soa2018.group1.application.modelwrapper;

import th.ac.kmitl.it.se.soa2018.group1.application.form.TaxInvoiceForm;
import th.ac.kmitl.it.se.soa2018.group1.application.model.ExchangedDocument;
import th.ac.kmitl.it.se.soa2018.group1.application.model.IncludedNote;

import java.sql.Timestamp;

public class ExchangedDocumentWrapper {

    public TaxInvoiceForm taxInvoiceForm;

    public ExchangedDocumentWrapper(TaxInvoiceForm taxInvoiceForm) {
        this.taxInvoiceForm = taxInvoiceForm;
    }

    public ExchangedDocument getModel() {

        IncludedNote includedNote = new IncludedNote();
        includedNote.setContent(this.taxInvoiceForm.getContent());
        includedNote.setSubject(this.taxInvoiceForm.getSubject());
        ExchangedDocument exchangedDocument = ExchangedDocument.builder()
                .id(this.taxInvoiceForm.getId())
                .name(this.taxInvoiceForm.getName())
                .typeCode(this.taxInvoiceForm.getTypeCode())
                .issueDateTime(this.taxInvoiceForm.getIssueDateTime())
                .purpose(this.taxInvoiceForm.getPurpose())
                .purposeCode(this.taxInvoiceForm.getPurposeCode())
                .globalId(this.taxInvoiceForm.getGlobalId())
                .creationDateTime(new Timestamp(System.currentTimeMillis()))
                .includedNote(includedNote)
                .build();
        return exchangedDocument;
    }

}
