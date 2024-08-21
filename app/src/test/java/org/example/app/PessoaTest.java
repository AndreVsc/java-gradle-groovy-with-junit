package org.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

class PessoaTest {

    @Test
    void validarCalculoIdade() {
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2004, 4, 17));
        assertEquals(20, pessoa.getIdade()); // Ajuste o valor esperado conforme a data atual
    }
}
