package th.ac.kmitl.it.se.soa2018.group1.application.jsonwrappers;

import th.ac.kmitl.it.se.soa2018.group1.application.json.NoteJson;
import th.ac.kmitl.it.se.soa2018.group1.application.model.IncludedNote;

public class NoteWrapper {

    public IncludedNote includedNote;

    public NoteWrapper(IncludedNote includedNote) {
        this.includedNote = includedNote;
    }

    private NoteJson getModelClass(){
        NoteJson jsonNote = NoteJson.builder()
                .subject(includedNote.getSubject())
                .content(includedNote.getContent())
                .build();
        return jsonNote;
    }
}
