package de.magoeke.lecture.demo.bowling.boundary;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.magoeke.lecture.demo.bowling.control.BowlingGame;

@RestController
public class BowlingGameApi {

    private final BowlingGame bowlingGame;

    public BowlingGameApi(final BowlingGame bowlingGame) {
        this.bowlingGame = bowlingGame;
    }

    @PostMapping("/scores")
    public String calculateScore(@RequestBody List<Integer> rolls) {
        return String.valueOf(bowlingGame.calculateScore(rolls));
    }

}
