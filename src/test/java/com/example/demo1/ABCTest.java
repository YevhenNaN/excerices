package com.example.demo1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.Field;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class ABCTest {

    @InjectMocks
    ABC abc;

    @Test
    void handle_withRestConnectorException_shouldHandleException() throws NoSuchFieldException, IllegalAccessException {
        List<ABC> staticEntityList = List.of(new ABC(), new ABC());

// Using reflection to set the value of entityList
        Field entityListField = ABC.class.getDeclaredField("entityList");
        entityListField.setAccessible(true);
        entityListField.set(abc, staticEntityList);
        abc.method();

    }
}
