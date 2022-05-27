package home.managers;

import java.util.Map;


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
