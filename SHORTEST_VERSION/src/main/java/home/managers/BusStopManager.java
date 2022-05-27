package home.managers;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BusStopManager {

    public Map<String, String> getBusStopNames() {
        return Map.of(
                "PLW", "Państwowa Lokalizacja Winorośli",
                "OKJ", "Ochotnicza Komisja Jakości",
                "BPO", "Biznesowa Przestrzeń Ochronna",
                "LST", "Luksusowa Stołówka Towarzyska"
        );
    }

}
