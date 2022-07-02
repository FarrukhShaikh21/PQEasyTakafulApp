package pqetapp.viewpqeasyapp.pqbean;

import javax.faces.context.ExternalContext;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

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
        ADFContext.getCurrent().getSessionScope().put("pCNICNo",getStrUserName());
        return null;
    }
}
