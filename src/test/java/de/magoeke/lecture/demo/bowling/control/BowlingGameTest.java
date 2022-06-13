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
    void should_return_11_when_first_three_rolls_are_8_1_2_and_no_other_roll_hits_a_pin() {
        rolls.add(8);
        rolls.add(1);
        rolls.add(2);
        fillWithZeroFrames(rolls, 17);

        final var score = bowlingGame.calculateScore(rolls);

        assertThat(score).isEqualTo(11);
    }

    private void fillWithZeroFrames(final List<Integer> rolls, final int numberOfRolls) {
        for(int i = 0; i < numberOfRolls; i++) {
            rolls.add(0);
        }
    }

}
