// Generated by Enunciate
package com.eurotech.cloud.apis.v2.model;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
    name = "account",
    namespace = "http://eurotech.com/edc/2.0"
)
@javax.xml.bind.annotation.XmlRootElement (
    name = "account",
    namespace = "http://eurotech.com/edc/2.0"
)
public class Account implements java.io.Serializable {

    private java.util.Date _createdOn;
    private long _modifiedBy;
    private long _id;
    private java.lang.String _name;
    private long _createdBy;
    private int _optlock;
    private com.eurotech.cloud.apis.v2.model.Organization _organization;
    private java.util.Date _modifiedOn;

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "createdOn",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.util.Date getCreatedOn() {
        return this._createdOn;
    }

    /**
     * (no documentation provided)
     */
    public void setCreatedOn(java.util.Date _createdOn) {
        this._createdOn = _createdOn;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "modifiedBy",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public long getModifiedBy() {
        return this._modifiedBy;
    }

    /**
     * (no documentation provided)
     */
    public void setModifiedBy(long _modifiedBy) {
        this._modifiedBy = _modifiedBy;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "id",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public long getId() {
        return this._id;
    }

    /**
     * (no documentation provided)
     */
    public void setId(long _id) {
        this._id = _id;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "name",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getName() {
        return this._name;
    }

    /**
     * (no documentation provided)
     */
    public void setName(java.lang.String _name) {
        this._name = _name;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "createdBy",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public long getCreatedBy() {
        return this._createdBy;
    }

    /**
     * (no documentation provided)
     */
    public void setCreatedBy(long _createdBy) {
        this._createdBy = _createdBy;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "optlock",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public int getOptlock() {
        return this._optlock;
    }

    /**
     * (no documentation provided)
     */
    public void setOptlock(int _optlock) {
        this._optlock = _optlock;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "organization",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public com.eurotech.cloud.apis.v2.model.Organization getOrganization() {
        return this._organization;
    }

    /**
     * (no documentation provided)
     */
    public void setOrganization(com.eurotech.cloud.apis.v2.model.Organization _organization) {
        this._organization = _organization;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "modifiedOn",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.util.Date getModifiedOn() {
        return this._modifiedOn;
    }

    /**
     * (no documentation provided)
     */
    public void setModifiedOn(java.util.Date _modifiedOn) {
        this._modifiedOn = _modifiedOn;
    }

}
