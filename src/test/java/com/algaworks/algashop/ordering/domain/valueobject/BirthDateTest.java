package com.algaworks.algashop.ordering.domain.valueobject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.*;

class BirthDateTest {

    @Test
    void shouldGenerate(){
        BirthDate birthDate = new BirthDate(LocalDate.of(1991, 7, 5));

        Assertions.assertThat(birthDate.value()).isEqualTo(LocalDate.of(1991, 7, 5));
    }

    @Test
    void shouldGenerateAge(){
        BirthDate birthDate = new BirthDate(LocalDate.of(1991, 7, 5));

        Assertions.assertThat(birthDate.age()).isEqualTo(34);
    }

    @Test
    void given_brandNewBirthDate_whenInvalidBirthDate_shouldGenerateException() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()-> {
                    new BirthDate(LocalDate.of(2026, 7, 5)
                    );
                });
    }
}