// Generated by Enunciate
package com.eurotech.cloud.apis.v2.model;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
    name = "usageResult",
    namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
    name = "accountUsageResult",
    namespace = ""
)
public class UsageResult implements java.io.Serializable {

    private java.util.List<com.eurotech.cloud.apis.v2.model.EdcUsageInfo> _usage;

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "usage",
        namespace = ""
    )
    public java.util.List<com.eurotech.cloud.apis.v2.model.EdcUsageInfo> getUsage() {
        return this._usage;
    }

    /**
     * (no documentation provided)
     */
    public void setUsage(java.util.List<com.eurotech.cloud.apis.v2.model.EdcUsageInfo> _usage) {
        this._usage = _usage;
    }

}
