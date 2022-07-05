package pqetapp.viewpqeasyapp.pqbean;

import javax.faces.context.ExternalContext;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;

public class PQEasyTakafulBean {
    public PQEasyTakafulBean() {
        super();
    }
    String strUserName;

    public void setStrUserName(String strUserName) {
        this.strUserName = strUserName;
    }

    public String getStrUserName() {
        return strUserName;
    }
    
    public String doLoginPQEashApp() {
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("VuPortalClientInfoQVOROIterator");
        ADFContext.getCurrent().getSessionScope().put("pCNICNo",getStrUserName());
        return "ACT-PQET-LOGIN";
    }
}
