import managers.BusStopManager;
import managers.ConnectionAssistance;
import managers.ConnectionManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("First try - using contect.xml:");
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:context.xml");
        ConnectionAssistance connectionAssistance = applicationContext.getBean(ConnectionAssistance.class);

        System.out.println("Outcome: "+connectionAssistance.getConnections());

        System.out.println();
        System.out.println("Second cry - without contect.xml:");
        ConnectionManager connectionManager = new ConnectionManager();
        BusStopManager busStopManager = new BusStopManager();
        connectionAssistance = new ConnectionAssistance(connectionManager, busStopManager);

        System.out.println("Outcome: "+connectionAssistance.getConnections());


    }
}
