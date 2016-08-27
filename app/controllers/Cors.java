package controllers;

import com.google.gson.JsonObject;
import play.mvc.Controller;

/**
 * APIs controller.
 *
 * @author jtremeaux
 */
public class Cors extends Controller {
    public static void preflight() {
        JsonObject json = new JsonObject();
        json.addProperty("status", "ok");
        renderJSON(json.toString());
    }
}