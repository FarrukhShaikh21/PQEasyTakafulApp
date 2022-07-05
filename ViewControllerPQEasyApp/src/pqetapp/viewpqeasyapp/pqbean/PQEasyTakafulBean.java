package pqetapp.viewpqeasyapp.pqbean;

import javax.faces.application.FacesMessage;
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
    Integer strParticipantId;


    public void setStrParticipantId(Integer strParticipantId) {
        this.strParticipantId = strParticipantId;
    }

    public Integer getStrParticipantId() {
        return strParticipantId;
    }

    public void setStrUserName(String strUserName) {
        this.strUserName = strUserName;
    }

    public String getStrUserName() {
        return strUserName;
    }
    
    public String doLoginPQEashApp() {
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib=bc.findIteratorBinding("VuPortalClientInfoQVOROIterator");
        ib.getViewObject().setWhereClause("nic='"+getStrUserName()+"'");
        ib.getViewObject().executeQuery();
        if (ib.getEstimatedRowCount()>0) {
            ADFContext.getCurrent().getSessionScope().put("pCNICNo", getStrUserName());
            ADFContext.getCurrent().getSessionScope().put("pParticipantId", ib.getViewObject().first().getAttribute("ParticipantIdPk"));
            setStrParticipantId(Integer.parseInt(ib.getViewObject().first().getAttribute("ParticipantIdPk").toString()));
            return "ACT-PQET-LOGIN";
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Invalid CNIC No"));
        return null;
    }
}
