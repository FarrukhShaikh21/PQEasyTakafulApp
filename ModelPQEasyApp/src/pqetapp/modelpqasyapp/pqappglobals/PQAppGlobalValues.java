package pqetapp.modelpqasyapp.pqappglobals;

import javax.servlet.http.HttpSession;

import oracle.adf.share.ADFContext;

public class PQAppGlobalValues {
    public PQAppGlobalValues() {
        super();
    }
    
    public static String doGetPQCnicNo() {
        return ADFContext.getCurrent().getPageFlowScope().get("pCNICNo").toString();
    }
}
