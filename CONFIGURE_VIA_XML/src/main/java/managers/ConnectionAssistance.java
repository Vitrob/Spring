package managers;

import pattern.ConnectedBusStopsNames;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ConnectionAssistance {

    private final ConnectionManager connectionManager;
    private final BusStopManager busStopManager;

    public ConnectionAssistance(ConnectionManager connectionManager, BusStopManager busStopManager) {
        this.connectionManager = connectionManager;
        this.busStopManager = busStopManager;
    }

    public Set<ConnectedBusStopsNames> getConnections(){
        Map<String,String> busStationNames = busStopManager.getBusStopNames();
        return connectionManager.getConnections().stream()
                .map(street -> ConnectedBusStopsNames.builder()
                        .startName(busStationNames.getOrDefault(street.getStartCode(),street.getStartCode()))
                        .finishName(busStationNames.getOrDefault(street.getFinishCode(),street.getFinishCode()))
                        .build()
                ).collect(Collectors.toSet());
    }
}
