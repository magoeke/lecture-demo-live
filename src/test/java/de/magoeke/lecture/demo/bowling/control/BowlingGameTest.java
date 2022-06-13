package de.magoeke.lecture.demo.bowling.control;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BowlingGameTest {

    @Test
    void shouldReturn0WhenAllRollsWereZero() {
        final var bowlingGame = new BowlingGame();

        var rolls = new ArrayList<Integer>();

        for(int i = 0; i < 20; i++) {
            rolls.add(0);
        }

        final var score = bowlingGame.calculateScore(rolls);

        assertThat(score).isEqualTo(0);
    }

}
