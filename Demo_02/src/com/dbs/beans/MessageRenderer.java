 package com.dbs.beans;


public interface MessageRenderer {

    void render();

    void setMessageProvider(MessageProvider messageProvider);

    MessageProvider getMessageProvider();
}
