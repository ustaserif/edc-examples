// Generated by Enunciate
package com.eurotech.cloud.apis.v2.model;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
    name = "edcMessage",
    namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
    name = "message",
    namespace = ""
)
public class EdcMessage implements java.io.Serializable {

    private com.eurotech.cloud.apis.v2.model.EdcPayload _edcPayload;
    private java.lang.String _topic;
    private java.util.Date _timestamp;

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "payload",
        namespace = ""
    )
    public com.eurotech.cloud.apis.v2.model.EdcPayload getEdcPayload() {
        return this._edcPayload;
    }

    /**
     * (no documentation provided)
     */
    public void setEdcPayload(com.eurotech.cloud.apis.v2.model.EdcPayload _edcPayload) {
        this._edcPayload = _edcPayload;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "topic",
        namespace = ""
    )
    public java.lang.String getTopic() {
        return this._topic;
    }

    /**
     * (no documentation provided)
     */
    public void setTopic(java.lang.String _topic) {
        this._topic = _topic;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "receivedOn",
        namespace = ""
    )
    public java.util.Date getTimestamp() {
        return this._timestamp;
    }

    /**
     * (no documentation provided)
     */
    public void setTimestamp(java.util.Date _timestamp) {
        this._timestamp = _timestamp;
    }

}
