 package com.dbs.app;

import com.dbs.beans.ConsoleMessageRenderer;
import com.dbs.beans.HelloMessageProvider;
import com.dbs.beans.MessageProvider;
import com.dbs.beans.MessageRenderer;
import com.dbs.helper.MessageFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");

        MessageProvider messageProvider = (MessageProvider) context.getBean("helloMessageProvider") ;
        MessageRenderer messageRenderer = (MessageRenderer) context.getBean("consoleMessageRenderer");

        messageRenderer.render();

//        MessageRenderer messageRenderer = null;
//        try {
//            messageRenderer = MessageFactory.getMessageRenderer();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//        MessageProvider messageProvider = null;
//        try {
//            messageProvider = MessageFactory.getMessageProvider();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//        messageRenderer.setMessageProvider(messageProvider);





    }
}
