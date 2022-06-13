package de.magoeke.lecture.demo.bowling.control;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BowlingGameTest {

    @Test
    void should_return_0_when_all_rolls_were_zero() {
        final var bowlingGame = new BowlingGame();

        var rolls = new ArrayList<Integer>();

        for(int i = 0; i < 20; i++) {
            rolls.add(0);
        }

        final var score = bowlingGame.calculateScore(rolls);

        assertThat(score).isEqualTo(0);
    }

}
