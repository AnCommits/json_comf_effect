package com.example.json_comf_effect;

import com.example.json_comf_effect.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class JacksonJsonProcessorTest {

    User user;
    JsonProcessor processor;

    @BeforeEach
    void setup() {
        user = new User();
        user.setName("Antony");
        user.setLastname("Williams");
        processor = new JacksonJsonProcessor();
    }

    @Test
    void toJson() {
        String json = processor.toJson(user);
        String expected = "{\"name\":\"Antony\",\"lastname\":\"Williams\"}";
        assertEquals(expected, json);
    }

    @Test
    void fromJson() throws IOException {
        String json = Files.readString(Paths.get("src/main/resources/sample.json"));
        User user = processor.fromJson(json);
        assertEquals("Peter", user.getName());
        assertEquals("Jones", user.getLastname());
    }

    @Test
    void getUserName() throws IOException {
        String json = Files.readString(Paths.get("src/main/resources/sample.json"));
        User user = processor.fromJson(json);
        assertEquals("Peter", user.getName());
    }
}