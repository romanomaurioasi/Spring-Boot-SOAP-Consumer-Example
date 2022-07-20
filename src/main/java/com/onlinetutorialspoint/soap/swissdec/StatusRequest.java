package com.onlinetutorialspoint.soap.swissdec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "jobKey",
        "timeout"
})
@XmlRootElement(name = "StatusRequest")
public class StatusRequest {
    protected String jobKey;
    protected int timeout;

    public String getJobKey() {
        return jobKey;
    }

    public void setJobKey(String value) {
        this.jobKey = value;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int value) {
        this.timeout = value;
    }
}


