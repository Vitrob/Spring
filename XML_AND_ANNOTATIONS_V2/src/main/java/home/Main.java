package home;

import home.managers.ConnectionAssistance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:context.xml");
        ConnectionAssistance connectionAssistance = applicationContext.getBean(ConnectionAssistance.class);
        System.out.println(connectionAssistance.getConnections());

    }
}
