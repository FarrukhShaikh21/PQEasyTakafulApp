package pqetapp.modelpqasyapp.eo;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 06 10:43:17 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TmsClmWebClaimImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        WebClaimIdPk {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getWebClaimIdPk();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setWebClaimIdPk((Number) value);
            }
        }
        ,
        LossTypeIdFk {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getLossTypeIdFk();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setLossTypeIdFk((Number) value);
            }
        }
        ,
        LossCause {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getLossCause();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setLossCause((String) value);
            }
        }
        ,
        LossDate {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getLossDate();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setLossDate((Date) value);
            }
        }
        ,
        LossTime {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getLossTime();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setLossTime((String) value);
            }
        }
        ,
        CityIdFk {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getCityIdFk();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setCityIdFk((BigDecimal) value);
            }
        }
        ,
        Area {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getArea();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setArea((String) value);
            }
        }
        ,
        WorkshopIdFk {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getWorkshopIdFk();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setWorkshopIdFk((Number) value);
            }
        }
        ,
        ContactPerson {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getContactPerson();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setContactPerson((String) value);
            }
        }
        ,
        ContactNumber {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getContactNumber();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setContactNumber((String) value);
            }
        }
        ,
        IntimationDate {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getIntimationDate();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setIntimationDate((Date) value);
            }
        }
        ,
        DetailRemarks {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getDetailRemarks();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setDetailRemarks((String) value);
            }
        }
        ,
        DocumentIdFk {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getDocumentIdFk();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setDocumentIdFk((BigDecimal) value);
            }
        }
        ,
        txtLossTypeDescription {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.gettxtLossTypeDescription();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.settxtLossTypeDescription((String) value);
            }
        }
        ,
        txtCityName {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.gettxtCityName();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.settxtCityName((String) value);
            }
        }
        ,
        txtWorkshopName {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.gettxtWorkshopName();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.settxtWorkshopName((String) value);
            }
        }
        ,
        ImageUpload {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getImageUpload();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setImageUpload((BlobDomain) value);
            }
        }
        ,
        ItemDetailId {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getItemDetailId();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setItemDetailId((Number) value);
            }
        }
        ,
        TmsClmStLossType {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getTmsClmStLossType();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setTmsClmStLossType((EntityImpl) value);
            }
        }
        ,
        TmsGenStCity {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getTmsGenStCity();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setTmsGenStCity((EntityImpl) value);
            }
        }
        ,
        TmsClmStWorkshop {
            public Object get(TmsClmWebClaimImpl obj) {
                return obj.getTmsClmStWorkshop();
            }

            public void put(TmsClmWebClaimImpl obj, Object value) {
                obj.setTmsClmStWorkshop((EntityImpl) value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(TmsClmWebClaimImpl object);

        public abstract void put(TmsClmWebClaimImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int WEBCLAIMIDPK = AttributesEnum.WebClaimIdPk.index();
    public static final int LOSSTYPEIDFK = AttributesEnum.LossTypeIdFk.index();
    public static final int LOSSCAUSE = AttributesEnum.LossCause.index();
    public static final int LOSSDATE = AttributesEnum.LossDate.index();
    public static final int LOSSTIME = AttributesEnum.LossTime.index();
    public static final int CITYIDFK = AttributesEnum.CityIdFk.index();
    public static final int AREA = AttributesEnum.Area.index();
    public static final int WORKSHOPIDFK = AttributesEnum.WorkshopIdFk.index();
    public static final int CONTACTPERSON = AttributesEnum.ContactPerson.index();
    public static final int CONTACTNUMBER = AttributesEnum.ContactNumber.index();
    public static final int INTIMATIONDATE = AttributesEnum.IntimationDate.index();
    public static final int DETAILREMARKS = AttributesEnum.DetailRemarks.index();
    public static final int DOCUMENTIDFK = AttributesEnum.DocumentIdFk.index();
    public static final int TXTLOSSTYPEDESCRIPTION = AttributesEnum.txtLossTypeDescription.index();
    public static final int TXTCITYNAME = AttributesEnum.txtCityName.index();
    public static final int TXTWORKSHOPNAME = AttributesEnum.txtWorkshopName.index();
    public static final int IMAGEUPLOAD = AttributesEnum.ImageUpload.index();
    public static final int ITEMDETAILID = AttributesEnum.ItemDetailId.index();
    public static final int TMSCLMSTLOSSTYPE = AttributesEnum.TmsClmStLossType.index();
    public static final int TMSGENSTCITY = AttributesEnum.TmsGenStCity.index();
    public static final int TMSCLMSTWORKSHOP = AttributesEnum.TmsClmStWorkshop.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TmsClmWebClaimImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("pqetapp.modelpqasyapp.eo.TmsClmWebClaim");
    }


    /**
     * Gets the attribute value for WebClaimIdPk, using the alias name WebClaimIdPk.
     * @return the value of WebClaimIdPk
     */
    public Number getWebClaimIdPk() {
        return (Number) getAttributeInternal(WEBCLAIMIDPK);
    }

    /**
     * Sets <code>value</code> as the attribute value for WebClaimIdPk.
     * @param value value to set the WebClaimIdPk
     */
    public void setWebClaimIdPk(Number value) {
        setAttributeInternal(WEBCLAIMIDPK, value);
    }

    /**
     * Gets the attribute value for LossTypeIdFk, using the alias name LossTypeIdFk.
     * @return the value of LossTypeIdFk
     */
    public Number getLossTypeIdFk() {
        return (Number) getAttributeInternal(LOSSTYPEIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for LossTypeIdFk.
     * @param value value to set the LossTypeIdFk
     */
    public void setLossTypeIdFk(Number value) {
        setAttributeInternal(LOSSTYPEIDFK, value);
    }

    /**
     * Gets the attribute value for LossCause, using the alias name LossCause.
     * @return the value of LossCause
     */
    public String getLossCause() {
        return (String) getAttributeInternal(LOSSCAUSE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LossCause.
     * @param value value to set the LossCause
     */
    public void setLossCause(String value) {
        setAttributeInternal(LOSSCAUSE, value);
    }

    /**
     * Gets the attribute value for LossDate, using the alias name LossDate.
     * @return the value of LossDate
     */
    public Date getLossDate() {
        return (Date) getAttributeInternal(LOSSDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LossDate.
     * @param value value to set the LossDate
     */
    public void setLossDate(Date value) {
        setAttributeInternal(LOSSDATE, value);
    }

    /**
     * Gets the attribute value for LossTime, using the alias name LossTime.
     * @return the value of LossTime
     */
    public String getLossTime() {
        return (String) getAttributeInternal(LOSSTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LossTime.
     * @param value value to set the LossTime
     */
    public void setLossTime(String value) {
        setAttributeInternal(LOSSTIME, value);
    }

    /**
     * Gets the attribute value for CityIdFk, using the alias name CityIdFk.
     * @return the value of CityIdFk
     */
    public BigDecimal getCityIdFk() {
        return (BigDecimal) getAttributeInternal(CITYIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for CityIdFk.
     * @param value value to set the CityIdFk
     */
    public void setCityIdFk(BigDecimal value) {
        setAttributeInternal(CITYIDFK, value);
    }

    /**
     * Gets the attribute value for Area, using the alias name Area.
     * @return the value of Area
     */
    public String getArea() {
        return (String) getAttributeInternal(AREA);
    }

    /**
     * Sets <code>value</code> as the attribute value for Area.
     * @param value value to set the Area
     */
    public void setArea(String value) {
        setAttributeInternal(AREA, value);
    }

    /**
     * Gets the attribute value for WorkshopIdFk, using the alias name WorkshopIdFk.
     * @return the value of WorkshopIdFk
     */
    public Number getWorkshopIdFk() {
        return (Number) getAttributeInternal(WORKSHOPIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for WorkshopIdFk.
     * @param value value to set the WorkshopIdFk
     */
    public void setWorkshopIdFk(Number value) {
        setAttributeInternal(WORKSHOPIDFK, value);
    }

    /**
     * Gets the attribute value for ContactPerson, using the alias name ContactPerson.
     * @return the value of ContactPerson
     */
    public String getContactPerson() {
        return (String) getAttributeInternal(CONTACTPERSON);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactPerson.
     * @param value value to set the ContactPerson
     */
    public void setContactPerson(String value) {
        setAttributeInternal(CONTACTPERSON, value==null?null:value.toUpperCase());
    }

    /**
     * Gets the attribute value for ContactNumber, using the alias name ContactNumber.
     * @return the value of ContactNumber
     */
    public String getContactNumber() {
        return (String) getAttributeInternal(CONTACTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactNumber.
     * @param value value to set the ContactNumber
     */
    public void setContactNumber(String value) {
        setAttributeInternal(CONTACTNUMBER, value);
    }

    /**
     * Gets the attribute value for IntimationDate, using the alias name IntimationDate.
     * @return the value of IntimationDate
     */
    public Date getIntimationDate() {
        return (Date) getAttributeInternal(INTIMATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for IntimationDate.
     * @param value value to set the IntimationDate
     */
    public void setIntimationDate(Date value) {
        setAttributeInternal(INTIMATIONDATE, value);
    }

    /**
     * Gets the attribute value for DetailRemarks, using the alias name DetailRemarks.
     * @return the value of DetailRemarks
     */
    public String getDetailRemarks() {
        return (String) getAttributeInternal(DETAILREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for DetailRemarks.
     * @param value value to set the DetailRemarks
     */
    public void setDetailRemarks(String value) {
        setAttributeInternal(DETAILREMARKS, value==null?null:value.toUpperCase());
    }

    /**
     * Gets the attribute value for DocumentIdFk, using the alias name DocumentIdFk.
     * @return the value of DocumentIdFk
     */
    public BigDecimal getDocumentIdFk() {
        return (BigDecimal) getAttributeInternal(DOCUMENTIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocumentIdFk.
     * @param value value to set the DocumentIdFk
     */
    public void setDocumentIdFk(BigDecimal value) {
        setAttributeInternal(DOCUMENTIDFK, value);
    }

    /**
     * Gets the attribute value for txtLossTypeDescription, using the alias name txtLossTypeDescription.
     * @return the value of txtLossTypeDescription
     */
    public String gettxtLossTypeDescription() {
        return (String) getAttributeInternal(TXTLOSSTYPEDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtLossTypeDescription.
     * @param value value to set the txtLossTypeDescription
     */
    public void settxtLossTypeDescription(String value) {
        setAttributeInternal(TXTLOSSTYPEDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for txtCityName, using the alias name txtCityName.
     * @return the value of txtCityName
     */
    public String gettxtCityName() {
        return (String) getAttributeInternal(TXTCITYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtCityName.
     * @param value value to set the txtCityName
     */
    public void settxtCityName(String value) {
        setAttributeInternal(TXTCITYNAME, value);
    }

    /**
     * Gets the attribute value for txtWorkshopName, using the alias name txtWorkshopName.
     * @return the value of txtWorkshopName
     */
    public String gettxtWorkshopName() {
        return (String) getAttributeInternal(TXTWORKSHOPNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtWorkshopName.
     * @param value value to set the txtWorkshopName
     */
    public void settxtWorkshopName(String value) {
        setAttributeInternal(TXTWORKSHOPNAME, value);
    }

    /**
     * Gets the attribute value for ImageUpload, using the alias name ImageUpload.
     * @return the value of ImageUpload
     */
    public BlobDomain getImageUpload() {
        return (BlobDomain) getAttributeInternal(IMAGEUPLOAD);
    }

    /**
     * Sets <code>value</code> as the attribute value for ImageUpload.
     * @param value value to set the ImageUpload
     */
    public void setImageUpload(BlobDomain value) {
        setAttributeInternal(IMAGEUPLOAD, value);
    }

    /**
     * Gets the attribute value for ItemDetailId, using the alias name ItemDetailId.
     * @return the value of ItemDetailId
     */
    public Number getItemDetailId() {
        return (Number) getAttributeInternal(ITEMDETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemDetailId.
     * @param value value to set the ItemDetailId
     */
    public void setItemDetailId(Number value) {
        setAttributeInternal(ITEMDETAILID, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTmsClmStLossType() {
        return (EntityImpl) getAttributeInternal(TMSCLMSTLOSSTYPE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTmsClmStLossType(EntityImpl value) {
        setAttributeInternal(TMSCLMSTLOSSTYPE, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTmsGenStCity() {
        return (EntityImpl) getAttributeInternal(TMSGENSTCITY);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTmsGenStCity(EntityImpl value) {
        setAttributeInternal(TMSGENSTCITY, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTmsClmStWorkshop() {
        return (EntityImpl) getAttributeInternal(TMSCLMSTWORKSHOP);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTmsClmStWorkshop(EntityImpl value) {
        setAttributeInternal(TMSCLMSTWORKSHOP, value);
    }


    /**
     * @param webClaimIdPk key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number webClaimIdPk) {
        return new Key(new Object[] { webClaimIdPk });
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
    
    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl seq =
                    new oracle.jbo.server.SequenceImpl("TMS_CLM_WEB_CLAIM_SEQ", getDBTransaction());
                setWebClaimIdPk(seq.getSequenceNumber());
    }
}

