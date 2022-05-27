package home.pattern;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class ConnectedBusStopsCodes {

    private final String startCode;
    private final String finishCode;

}
