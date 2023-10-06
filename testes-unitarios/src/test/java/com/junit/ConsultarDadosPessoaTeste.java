package com.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConsultarDadosPessoaTeste {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    @Test
    void validarDadosRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }

}
