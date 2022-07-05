package pqetapp.modelpqasyapp.gclass;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;

public class PQEasyTakafulModelGlobal {
    public PQEasyTakafulModelGlobal() {
        super();
    }
    
    public String dogetUserID() {
        
        return ADFContext.getCurrent().getSessionScope().get("pCNICNo").toString();
    }
   
    public String dogetParticipantID() {
        
        return ADFContext.getCurrent().getSessionScope().get("pParticipantId").toString();
    }
    
}
