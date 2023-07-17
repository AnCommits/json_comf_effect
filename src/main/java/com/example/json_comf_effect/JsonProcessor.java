package com.example.json_comf_effect;

import com.example.json_comf_effect.model.User;
import java.util.Map;

public interface JsonProcessor {
    String toJson(User user);
    User fromJson(String json);
    Map<String, Object> fromJsonAsMap(String json);
    String getUserName(String user);
}
