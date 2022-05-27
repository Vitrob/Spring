package home.managers;

import home.pattern.ConnectedBusStopsNames;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class ConnectionAssistance {

    @Autowired
    private  ConnectionManager connectionManager;
    @Autowired
    private  BusStopManager busStopManager;



    public Set<ConnectedBusStopsNames> getConnections() {
        Map<String, String> busStopNames = busStopManager.getBusStopNames();
        return connectionManager.getConnections().stream()
                .map(busStop -> ConnectedBusStopsNames.builder()
                        .startName(busStopNames.getOrDefault(busStop.getStartCode(), busStop.getStartCode()))
                        .finishName(busStopNames.getOrDefault(busStop.getFinishCode(), busStop.getFinishCode()))
                        .build()
                ).collect(Collectors.toSet());
    }
}
