package home;

import home.managers.BusStopManager;
import home.managers.ConnectionAssistance;
import home.managers.ConnectionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public BusStopManager busStopManager() {
        return new BusStopManager();
    }

    @Bean
    public ConnectionManager connectionManager() {
        return new ConnectionManager();
    }

    @Bean
    public ConnectionAssistance connectionAssistance() {
        return new ConnectionAssistance(connectionManager(),busStopManager());
    }

}
