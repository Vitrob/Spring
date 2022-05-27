package home;

import home.managers.ConnectionAssistance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        ConnectionAssistance connectionAssistance = applicationContext.getBean(ConnectionAssistance.class);
        System.out.println(connectionAssistance.getConnections());

    }
}
