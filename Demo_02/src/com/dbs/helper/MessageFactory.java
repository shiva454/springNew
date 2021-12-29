 package com.dbs.helper;

import com.dbs.beans.HelloMessageProvider;
import com.dbs.beans.MessageProvider;
import com.dbs.beans.MessageRenderer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MessageFactory {

    static MessageProvider messageProvider = null;
    static MessageRenderer messageRenderer = null;

    public static MessageProvider getMessageProvider() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("message.prop"));
        String provider = properties.getProperty("provider");
        return messageProvider = (MessageProvider) Class.forName(provider).newInstance();
    }

    public static MessageRenderer getMessageRenderer() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("message.prop"));
        String renderer = properties.getProperty("renderer");
        return messageRenderer = (MessageRenderer) Class.forName(renderer).newInstance();
    }

}
