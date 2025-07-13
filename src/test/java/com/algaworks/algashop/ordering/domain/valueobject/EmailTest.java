package com.algaworks.algashop.ordering.domain.valueobject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void shouldGenerate(){
        Email email = new Email("john@outlook.com");

        Assertions.assertThat(email.value()).isEqualTo("john@outlook.com");
    }

    @Test
    void shouldGenerate_whenInvalidEmail_shouldGenerateException(){
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()-> {
                    new Email("john.com.br");
                });
    }

    @Test
    void shouldGenerate_whenNullEmail_shouldGenerateException(){
        Assertions.assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(()-> {
                    new Email(null);
                });
    }
}