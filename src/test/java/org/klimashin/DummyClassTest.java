package org.klimashin;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DummyClassTest {

    @Test
    public void getResult_shouldReturnResult() {
        assertThat(new DummyClass().getResult()).isEqualTo("Result");
    }
}