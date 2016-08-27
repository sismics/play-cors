package play.plugins;

import play.Play;
import play.PlayPlugin;
import play.mvc.Http;

/**
 * @author jtremeaux
 */
public class CorsPlugin extends PlayPlugin {
    @Override
    public void beforeInvocation() {
        addCorsHeader();
    }

    public void addCorsHeader() {
        final Http.Request request = Http.Request.current();
        if (Play.mode.isDev() && request != null && request.headers.get("origin") != null) {
            final Http.Response response = Http.Response.current();
            response.setHeader("Access-Control-Allow-Origin", request.headers.get("origin").value());
            response.setHeader("Access-Control-Allow-Credentials", "true");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Authorization");
        }
    }
}
