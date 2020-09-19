package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(properties = {"levelNumber=3"})
class LevelControllerTest {

    @Autowired
    private LevelController controller;

    @Test
    public void should_return_right_level() {
        assertEquals("advanced", controller.getLevel());
    }

}