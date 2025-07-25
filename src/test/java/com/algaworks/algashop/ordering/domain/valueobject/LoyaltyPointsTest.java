package com.algaworks.algashop.ordering.domain.valueobject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LoyaltyPointsTest {

    @Test
    void shouldGenerate(){
        LoyaltyPoints loyaltyPoints = new LoyaltyPoints(10);

        Assertions.assertThat(loyaltyPoints.value()).isEqualTo(10);
    }

    @Test
    void shouldAddValue(){
        LoyaltyPoints loyaltyPoints = new LoyaltyPoints(10);
        var loyaltyPointsUpdate = loyaltyPoints.add(5);
        Assertions.assertThat(loyaltyPointsUpdate.value()).isEqualTo(15);
    }

    @Test
    void shouldNotValue(){
        LoyaltyPoints loyaltyPoints = new LoyaltyPoints(10);

        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                        .isThrownBy(() -> loyaltyPoints.add(-5));

        Assertions.assertThat(loyaltyPoints.value()).isEqualTo(10);
    }
}