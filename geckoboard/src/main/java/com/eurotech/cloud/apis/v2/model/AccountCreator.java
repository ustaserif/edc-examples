// Generated by Enunciate
package com.eurotech.cloud.apis.v2.model;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
    name = "accountCreator",
    namespace = "http://eurotech.com/edc/2.0"
)
@javax.xml.bind.annotation.XmlRootElement (
    name = "accountCreator",
    namespace = "http://eurotech.com/edc/2.0"
)
public class AccountCreator implements java.io.Serializable {

    private java.lang.String _organizationCountry;
    private java.lang.String _organizationZipPostCode;
    private java.lang.String _organizationStateProvinceCounty;
    private java.lang.String _organizationAddressLine2;
    private java.lang.String _accountPassword;
    private java.util.Date _expirationDate;
    private boolean _dataStorageEnabled;
    private int _rulesAssistantId;
    private java.lang.String _organizationPhoneNumber;
    private int _dataTimeToLive;
    private java.lang.String _organizationCity;
    private java.lang.String _organizationEmail;
    private java.lang.String _brokerUrl;
    private java.lang.String _organizationAddressLine1;
    private long _rxByteLimit;
    private long _txByteLimit;
    private java.lang.String _organizationName;
    private int _maxNumberOfDevices;
    private int _maxNumberOfRules;
    private java.lang.String _accountName;

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "organizationCountry",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getOrganizationCountry() {
        return this._organizationCountry;
    }

    /**
     * (no documentation provided)
     */
    public void setOrganizationCountry(java.lang.String _organizationCountry) {
        this._organizationCountry = _organizationCountry;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "organizationZipPostCode",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getOrganizationZipPostCode() {
        return this._organizationZipPostCode;
    }

    /**
     * (no documentation provided)
     */
    public void setOrganizationZipPostCode(java.lang.String _organizationZipPostCode) {
        this._organizationZipPostCode = _organizationZipPostCode;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "organizationStateProvinceCounty",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getOrganizationStateProvinceCounty() {
        return this._organizationStateProvinceCounty;
    }

    /**
     * (no documentation provided)
     */
    public void setOrganizationStateProvinceCounty(java.lang.String _organizationStateProvinceCounty) {
        this._organizationStateProvinceCounty = _organizationStateProvinceCounty;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "organizationAddressLine2",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getOrganizationAddressLine2() {
        return this._organizationAddressLine2;
    }

    /**
     * (no documentation provided)
     */
    public void setOrganizationAddressLine2(java.lang.String _organizationAddressLine2) {
        this._organizationAddressLine2 = _organizationAddressLine2;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "accountPassword",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getAccountPassword() {
        return this._accountPassword;
    }

    /**
     * (no documentation provided)
     */
    public void setAccountPassword(java.lang.String _accountPassword) {
        this._accountPassword = _accountPassword;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "expirationDate",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.util.Date getExpirationDate() {
        return this._expirationDate;
    }

    /**
     * (no documentation provided)
     */
    public void setExpirationDate(java.util.Date _expirationDate) {
        this._expirationDate = _expirationDate;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "dataStorageEnabled",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public boolean getDataStorageEnabled() {
        return this._dataStorageEnabled;
    }

    /**
     * (no documentation provided)
     */
    public void setDataStorageEnabled(boolean _dataStorageEnabled) {
        this._dataStorageEnabled = _dataStorageEnabled;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "rulesAssistantId",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public int getRulesAssistantId() {
        return this._rulesAssistantId;
    }

    /**
     * (no documentation provided)
     */
    public void setRulesAssistantId(int _rulesAssistantId) {
        this._rulesAssistantId = _rulesAssistantId;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "organizationPhoneNumber",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getOrganizationPhoneNumber() {
        return this._organizationPhoneNumber;
    }

    /**
     * (no documentation provided)
     */
    public void setOrganizationPhoneNumber(java.lang.String _organizationPhoneNumber) {
        this._organizationPhoneNumber = _organizationPhoneNumber;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "dataTimeToLive",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public int getDataTimeToLive() {
        return this._dataTimeToLive;
    }

    /**
     * (no documentation provided)
     */
    public void setDataTimeToLive(int _dataTimeToLive) {
        this._dataTimeToLive = _dataTimeToLive;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "organizationCity",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getOrganizationCity() {
        return this._organizationCity;
    }

    /**
     * (no documentation provided)
     */
    public void setOrganizationCity(java.lang.String _organizationCity) {
        this._organizationCity = _organizationCity;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "organizationEmail",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getOrganizationEmail() {
        return this._organizationEmail;
    }

    /**
     * (no documentation provided)
     */
    public void setOrganizationEmail(java.lang.String _organizationEmail) {
        this._organizationEmail = _organizationEmail;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "brokerUrl",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getBrokerUrl() {
        return this._brokerUrl;
    }

    /**
     * (no documentation provided)
     */
    public void setBrokerUrl(java.lang.String _brokerUrl) {
        this._brokerUrl = _brokerUrl;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "organizationAddressLine1",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getOrganizationAddressLine1() {
        return this._organizationAddressLine1;
    }

    /**
     * (no documentation provided)
     */
    public void setOrganizationAddressLine1(java.lang.String _organizationAddressLine1) {
        this._organizationAddressLine1 = _organizationAddressLine1;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "rxByteLimit",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public long getRxByteLimit() {
        return this._rxByteLimit;
    }

    /**
     * (no documentation provided)
     */
    public void setRxByteLimit(long _rxByteLimit) {
        this._rxByteLimit = _rxByteLimit;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "txByteLimit",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public long getTxByteLimit() {
        return this._txByteLimit;
    }

    /**
     * (no documentation provided)
     */
    public void setTxByteLimit(long _txByteLimit) {
        this._txByteLimit = _txByteLimit;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "organizationName",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getOrganizationName() {
        return this._organizationName;
    }

    /**
     * (no documentation provided)
     */
    public void setOrganizationName(java.lang.String _organizationName) {
        this._organizationName = _organizationName;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "maxNumberOfDevices",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public int getMaxNumberOfDevices() {
        return this._maxNumberOfDevices;
    }

    /**
     * (no documentation provided)
     */
    public void setMaxNumberOfDevices(int _maxNumberOfDevices) {
        this._maxNumberOfDevices = _maxNumberOfDevices;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "maxNumberOfRules",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public int getMaxNumberOfRules() {
        return this._maxNumberOfRules;
    }

    /**
     * (no documentation provided)
     */
    public void setMaxNumberOfRules(int _maxNumberOfRules) {
        this._maxNumberOfRules = _maxNumberOfRules;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "accountName",
        namespace = "http://eurotech.com/edc/2.0"
    )
    public java.lang.String getAccountName() {
        return this._accountName;
    }

    /**
     * (no documentation provided)
     */
    public void setAccountName(java.lang.String _accountName) {
        this._accountName = _accountName;
    }

}
