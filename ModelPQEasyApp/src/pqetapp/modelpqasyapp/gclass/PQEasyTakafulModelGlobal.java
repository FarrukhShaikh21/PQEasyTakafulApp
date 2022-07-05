package pqetapp.modelpqasyapp.gclass;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;

public class PQEasyTakafulModelGlobal {
    public PQEasyTakafulModelGlobal() {
        super();
    }
    
    public static String dogetUserID() {
        
        return ADFContext.getCurrent().getSessionScope().get("pCNICNo").toString();
    }
   
    public static Integer dogetParticipantID() {
        
        return Integer.parseInt(ADFContext.getCurrent().getSessionScope().get("pParticipantId").toString() );
    }
    
}
