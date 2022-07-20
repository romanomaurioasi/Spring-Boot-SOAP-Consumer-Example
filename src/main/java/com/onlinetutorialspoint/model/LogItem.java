package com.onlinetutorialspoint.model;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "logitems")
public class LogItem /*extends MongoRepository*/ {

    @Id
    private String id;

    private DateTime createDate;
    private String logMessage;

    public LogItem() {
    }

    public LogItem(DateTime createDate, String logMessage) {
        super();

        this.createDate = createDate;
        this.logMessage = logMessage;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return logMessage;
    }

    public void setMessage(String logMessage) {
        this.logMessage = logMessage;
    }

    @Override
    public String toString() {
        return String.format( "LogItem [id=%s, Message=%s, Time=%s]", id, logMessage, createDate.toString());
    }
}
