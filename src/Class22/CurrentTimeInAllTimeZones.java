package Class22;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Set;

public class CurrentTimeInAllTimeZones {
    public static void main(String[] args) {
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        for (String zoneId : allZoneIds) {
            ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(zoneId));
            System.out.println(zoneId + ": " + currentTime);
        }
    }
}
