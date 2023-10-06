package com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void deveCalcuclarIdadeCorretamente(){
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15,0, 0));

        Assertions.assertEquals(23, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15,0, 0));

        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao =  new Pessoa("Joao", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
