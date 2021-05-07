package com.in28minutes.tdd;

import java.awt.*;

public class StringHelper {


    // ABCD,BCD
    public String truncateAInFirst2Positions(String input) {
        return "";
    }

    public static boolean areFirstAndLastTwoCharsTheSame(String input) {

        if (input.length() < 2){
            return false;
        }

        String first2chars = input.substring(0, 2);
        String last2chars = input.substring(input.length() - 2);
        return first2chars.equals(last2chars);
    }
}
