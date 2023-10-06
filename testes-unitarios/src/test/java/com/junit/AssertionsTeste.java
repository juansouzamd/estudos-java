package com.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {

    @Test
    void validaLancamentos(){

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjtoEstaNulo(){
        Pessoa pessoa = null;
        //pessoa = new Pessoa("carlos", LocalDateTime.now());

        assertNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }

}
