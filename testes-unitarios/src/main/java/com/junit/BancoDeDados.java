package com.junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        //fez algo
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao(){
        //fez algo
        LOGGER.info("finalizou conexao");
    }

}
