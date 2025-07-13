package com.algaworks.algashop.ordering.domain.valueobject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentTest {

    @Test
    void shouldGenerate(){
        Document document = new Document("444-444-4444");

        Assertions.assertThat(document.value()).isEqualTo("444-444-4444");
    }

    @Test
    void shouldGenerate_whenInvalidDocument_shouldGenerateException(){
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()-> {
                    new Document("");
                });
    }

    @Test
    void shouldGenerate_whenNullDocument_shouldGenerateException(){
        Assertions.assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(()-> {
                    new Document(null);
                });
    }
}