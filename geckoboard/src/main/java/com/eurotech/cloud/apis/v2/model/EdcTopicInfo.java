// Generated by Enunciate
package com.eurotech.cloud.apis.v2.model;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
    name = "edcTopicInfo",
    namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
    name = "topicInfo",
    namespace = ""
)
public class EdcTopicInfo implements java.io.Serializable {

    private java.lang.String _fullTopic;
    private java.util.Date _lastMessageTimestamp;

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "topic",
        namespace = ""
    )
    public java.lang.String getFullTopic() {
        return this._fullTopic;
    }

    /**
     * (no documentation provided)
     */
    public void setFullTopic(java.lang.String _fullTopic) {
        this._fullTopic = _fullTopic;
    }

    /**
     * (no documentation provided)
     */
    @javax.xml.bind.annotation.XmlElement (
        name = "lastMessageOn",
        namespace = ""
    )
    public java.util.Date getLastMessageTimestamp() {
        return this._lastMessageTimestamp;
    }

    /**
     * (no documentation provided)
     */
    public void setLastMessageTimestamp(java.util.Date _lastMessageTimestamp) {
        this._lastMessageTimestamp = _lastMessageTimestamp;
    }

}
