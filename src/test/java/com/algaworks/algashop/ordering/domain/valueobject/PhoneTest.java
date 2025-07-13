package com.algaworks.algashop.ordering.domain.valueobject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

    @Test
    void shouldGenerate(){
        Phone phone = new Phone("444-444-4444");

        Assertions.assertThat(phone.value()).isEqualTo("444-444-4444");
    }

    @Test
    void shouldGenerate_whenInvalidDocument_shouldGenerateException(){
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()-> {
                    new Phone("");
                });
    }

    @Test
    void shouldGenerate_whenNullDocument_shouldGenerateException(){
        Assertions.assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(()-> {
                    new Phone(null);
                });
    }
}