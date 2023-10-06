package com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgo(){
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void validarAlgo02(){
        Assertions.assertEquals(10, 5+5);
    }
}
