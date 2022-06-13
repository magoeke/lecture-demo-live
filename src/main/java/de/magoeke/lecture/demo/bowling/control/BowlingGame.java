package de.magoeke.lecture.demo.bowling.control;

import java.util.List;

public class BowlingGame {

    public int calculateScore(List<Integer> rolls) {
        var result = 0;

        int i = 0;
        for(int frame = 0; frame < 10; frame++) {
            final var tmpFrameScore = rolls.get(i) + rolls.get(i+1);

            if(isSpare(tmpFrameScore)) {
                result += 10 + rolls.get(i+2);
            } else {
                result += tmpFrameScore;
            }

            i += 2;
        }

        return result;
    }

    private boolean isSpare(final int tmpFrameScore) {
        return tmpFrameScore == 10;
    }

}
