package service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TrickOrTreatServiceTest {

    private TrickOrTreatService trickOrTreatService = new  TrickOrTreatService();

    @Test
    void childrenAreHappy() {
        String[][] bags = new String[][] {
                {"candy","apple","candy"},
                {"candy","candy"},
                {"candy","candy"}
        };
        String message = trickOrTreatService.trickOrTreat(3, bags);
        Assertions.assertThat(message).isEqualTo("Danke liebe/r Entwickler:in!");
    }

}