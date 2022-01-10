package de.magoeke.lecture.demo.romannumbers.control;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class RomanNumbersConverter {

    private final Map<Integer, String> arabicToRomanMap;

    public RomanNumbersConverter() {
        arabicToRomanMap = new HashMap<>();
        arabicToRomanMap.put(1, "I");
        arabicToRomanMap.put(4, "IV");
        arabicToRomanMap.put(5, "V");
        arabicToRomanMap.put(9, "IX");
        arabicToRomanMap.put(10, "X");
        arabicToRomanMap.put(40, "XL");
        arabicToRomanMap.put(50, "L");
        arabicToRomanMap.put(90, "XC");
        arabicToRomanMap.put(100, "C");
        arabicToRomanMap.put(400, "CD");
        arabicToRomanMap.put(500, "D");
        arabicToRomanMap.put(900, "CM");
        arabicToRomanMap.put(1000, "M");
    }

    public String convert(final int number) {
        if (number < 1 || number > 3999) {
            return "NAN";
        }

        return convertToRoman(number);
    }

    private String convertToRoman(final int arabicNumber) {
        // stop recursion
        if (arabicNumber == 0) {
            return "";
        }

        final int nearestNumber = arabicToRomanMap.keySet().stream()
                .filter(number -> arabicNumber >= number)
                .max(Integer::compare)
                .get();

        return arabicToRomanMap.get(nearestNumber) + convertToRoman(arabicNumber - nearestNumber);
    }

}
