package com.example.json_comf_effect;

import com.example.json_comf_effect.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class JsonPathJsonProcessorTest {

    User user;
    JsonProcessor processor;

    @BeforeEach
    void setup() {
        user = new User();
        user.setName("Antony");
        user.setLastname("Williams");
        processor = new JsonPathJsonProcessor();
    }

    @Test
    void toJson() {
    }

    @Test
    void fromJson() {
        assertThrows(Exception.class, () -> processor.toJson(user));
    }

    @Test
    void fromJsonAsMap() {
    }

    @Test
    void getUserName() throws IOException {
        String json = Files.readString(Paths.get("src/main/resources/sample.json"));
        String name = processor.getUserName(json);
        assertEquals("Peter", name);
    }
}
