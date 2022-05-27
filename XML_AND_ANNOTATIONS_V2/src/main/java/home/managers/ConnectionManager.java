package home.managers;

import org.springframework.stereotype.Component;
import home.pattern.ConnectedBusStopsCodes;

import java.util.List;

@Component
public class ConnectionManager {

    public List<ConnectedBusStopsCodes> getConnections() {
        return List.of(
                ConnectedBusStopsCodes.builder().startCode("PLW").finishCode("OKJ").build(),
                ConnectedBusStopsCodes.builder().startCode("BPO").finishCode("LST").build()

        );
    }
}
