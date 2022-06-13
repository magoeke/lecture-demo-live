package de.magoeke.lecture.demo.bowling.control;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BowlingGameTest {

    private BowlingGame bowlingGame;
    private List<Integer> rolls;

    @BeforeEach
    void setUp() {
        bowlingGame = new BowlingGame();
        rolls = new ArrayList<>();
    }

    @Test
    void should_return_0_when_all_rolls_were_zero() {
        fillWithZeroFrames(rolls, 20);

        final var score = bowlingGame.calculateScore(rolls);

        assertThat(score).isEqualTo(0);
    }

    @Test
    void should_return_9_when_first_frame_is_8_and_1_and_all_other_rolls_miss() {
        rolls.add(8);
        rolls.add(1);
        fillWithZeroFrames(rolls, 18);

        final var score = bowlingGame.calculateScore(rolls);

        assertThat(score).isEqualTo(9);
    }

    private void fillWithZeroFrames(final List<Integer> rolls, final int numberOfRolls) {
        for(int i = 0; i < numberOfRolls; i++) {
            rolls.add(0);
        }
    }

}
