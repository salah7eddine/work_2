package org.home.myapp;

import static spark.Spark.*;

import java.util.*;

import com.google.gson.Gson;

public class RestServer {
  public static void main(String[] args) {
    Gson gson = new Gson();
    get("/hello", (req, resp) -> {
      Map<String, Object> data = new HashMap<>();
      data.put("name", "Mohamed");
      data.put("salary", "6500");
      resp.type("application/json");
      return data;
    }, gson::toJson);
  }
}
