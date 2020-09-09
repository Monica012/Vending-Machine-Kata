package com.vendingMachine.vendingMachine;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoinTest {
    @Test
    void coinSize() {
        Coin coinA = new Coin();
        int expectedSize = 1;
        int actualSize = coinA.size;
        assertThat(actualSize).isEqualTo(expectedSize);
    }
    @Test
    void coinWeight() {
        Coin coinA = new Coin();
        int expectedWeight = 1;
        int actualWeight = coinA.weight;
        assertThat(actualWeight).isEqualTo(expectedWeight);
    }
    @Test
    void checkCoinSizeValid() {
        Coin coinA = new Coin();
        int expectedWeight = 1;
        int actualWeight = coinA.weight;
        assertThat(actualWeight).isEqualTo(expectedWeight);
    }


}