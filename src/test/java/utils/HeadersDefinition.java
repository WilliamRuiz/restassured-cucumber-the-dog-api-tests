package utils;

import java.util.HashMap;
import java.util.Map;

public class HeadersDefinition extends BaseAPI{

    public static Map<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-type", "application/json");
        headers.put("x-api-key", "live_Ix5LJeNH5KCyIBeY3srqKBbSHCZb2Tk33it49uedfxcSNVIaPYJrikakhDFz0H2N");

        return headers;
    }
}
