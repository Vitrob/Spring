package home.pattern;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class ConnectedBusStopsNames {

    private final String startName;
    private final String finishName;

}
