package de.magoeke.lecture.demo.bowling.control;

import java.util.List;

public class BowlingGame {

    public int calculateScore(List<Integer> rolls) {
        var result = 0;

        for(var roll : rolls) {
            result += roll;
        }

        return result;
    }

}
