package com.example.json_comf_effect;

import com.example.json_comf_effect.model.User;
import com.jayway.jsonpath.JsonPath;

import java.util.Map;

public class JsonPathJsonProcessor implements JsonProcessor {
    @Override
    public String toJson(User user) {
        throw new UnsupportedOperationException("Conversion from POJO to JSON is not suppoorted by JsonPath");
    }

    @Override
    public User fromJson(String json) {
        return JsonPath.parse(json).read("$", User.class);
    }

    @Override
    public Map<String, Object> fromJsonAsMap(String json) {
        return JsonPath.parse(json).read("$.title", Map.class);
    }

    @Override
    public String getUserName(String json) {
        return JsonPath.parse(json).read("$.name", String.class);
    }
}
