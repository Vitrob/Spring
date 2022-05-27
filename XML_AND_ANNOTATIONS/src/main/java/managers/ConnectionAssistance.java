package managers;

import org.springframework.beans.factory.annotation.Autowired;
import pattern.ConnectedBusStopsNames;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ConnectionAssistance {

    @Autowired
    private final ConnectionManager connectionManager;
    @Autowired
    private final BusStopManager busStopManager;

    public ConnectionAssistance(ConnectionManager connectionManager, BusStopManager busStopManager) {
        this.connectionManager = connectionManager;
        this.busStopManager = busStopManager;
    }

    public Set<ConnectedBusStopsNames> getConnections(){
        Map<String,String> busStopNames = busStopManager.getBusStopNames();
        return connectionManager.getConnections().stream()
                .map(busStop -> ConnectedBusStopsNames.builder()
                        .startName(busStopNames.getOrDefault(busStop.getStartCode(),busStop.getStartCode()))
                        .finishName(busStopNames.getOrDefault(busStop.getFinishCode(),busStop.getFinishCode()))
                        .build()
                ).collect(Collectors.toSet());
    }
}
