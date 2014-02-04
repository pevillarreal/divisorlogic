/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DividerCheckRunner {

    private DividerCheckRunner() {
    }

    public static String runDivisionCheck(int startNumber, int endNumber) {
        return runDivisionCheck(startNumber, endNumber, "fizz", "buzz");
    }

    public static String runDivisionCheck(int startNumber, int endNumber, String divisibleByThreeOutput,
            String divisibleByFiveOutput) {
        List<DividerOutputObject> divisionData = new ArrayList<DividerOutputObject>();
        divisionData.add(new DividerOutputObject(3, divisibleByThreeOutput));
        divisionData.add(new DividerOutputObject(5, divisibleByFiveOutput));
        return runDivisionCheck(startNumber, endNumber, divisionData);
    }

    public static String runDivisionCheck(int startNumber, int endNumber, List<DividerOutputObject> divisionData) {
        if (startNumber < 0 || endNumber < 0 || startNumber > endNumber) {
            throw new IllegalArgumentException();
        }

        Collections.sort(divisionData);
        StringBuilder sb = new StringBuilder();

        for (int i = startNumber; i <= endNumber; i++) {
            boolean matched = false;
            for (DividerOutputObject dividerOutputObject : divisionData) {
                if (i % dividerOutputObject.getDivider() == 0) {
                    sb.append(dividerOutputObject.getOutput());
                    sb.append(" ");
                    matched = true;
                }
            }
            if (!matched) {
                sb.append(i);
            }

            sb.append("\n");
        }

        return sb.toString();
    }
}
