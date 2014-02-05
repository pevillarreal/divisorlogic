/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DividerCheckRunner {

    private DividerCheckRunner() {
    }

    public static void runDivisionCheck(int startNumber, int endNumber) {
        runDivisionCheck(startNumber, endNumber, "fizz", "buzz");
    }

    public static void runDivisionCheck(int startNumber, int endNumber, String divisibleByThreeOutput,
            String divisibleByFiveOutput) {
        List<DividerOutputObject> divisionData = new ArrayList<DividerOutputObject>();
        divisionData.add(new DividerOutputObject(3, divisibleByThreeOutput));
        divisionData.add(new DividerOutputObject(5, divisibleByFiveOutput));
        runDivisionCheck(startNumber, endNumber, divisionData);
    }

    public static void runDivisionCheck(int startNumber, int endNumber, List<DividerOutputObject> divisionData) {
        if (startNumber < 0 || endNumber < 0) {
            throw new IllegalArgumentException("startNumber and endNumber cannot be zero");
        }

        if (startNumber > endNumber) {
            throw new IllegalArgumentException("startNumber cannot be greater than end number");
        }

        Collections.sort(divisionData);
        for (int i = startNumber; i <= endNumber; i++) {
            boolean matched = false;
            for (DividerOutputObject dividerOutputObject : divisionData) {
                if (dividerOutputObject.isDivisor(i)) {
                    System.out.print(dividerOutputObject.getOutput());
                    System.out.print(" ");
                    matched = true;
                }
            }
            if (!matched) {
                System.out.print(i);
            }

            System.out.print("\n");
        }

    }

    public class DividierCheckIterator implements Iterator<String> {

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String next() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported by this iterator.");
        }
    }
}
