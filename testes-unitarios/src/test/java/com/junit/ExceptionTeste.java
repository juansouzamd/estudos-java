package com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTeste {

    @Test
    void validaCenarioDeExcecaoNaTransferencia(){
        Conta juan = new Conta("juan", 2500d);
        Conta maria = new Conta("maria", 2000d);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, ()-> transferenciaEntreContas.transfere(juan, maria,
                0));

        Assertions.assertDoesNotThrow(()-> transferenciaEntreContas.transfere(juan,
                maria,
                500));
    }

}
