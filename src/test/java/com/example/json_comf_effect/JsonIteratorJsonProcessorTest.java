package com.example.json_comf_effect;

import com.example.json_comf_effect.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonIteratorJsonProcessorTest {

    User user;
    JsonProcessor processor;

    @BeforeEach
    void setup() {
        user = new User();
        user.setName("Antony");
        user.setLastname("Williams");
        processor = new JsonIteratorJsonProcessor();
    }

    @Test
    void toJson() {
    }

    @Test
    void fromJson() {
    }

    @Test
    void fromJsonAsMap() {
    }

    @Test
    void getUserName() {
    }
}