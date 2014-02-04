/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<DividerOutputObject> dividerObjects = new ArrayList<DividerOutputObject>();
        dividerObjects.add(new DividerOutputObject(3, "fizz"));
        dividerObjects.add(new DividerOutputObject(5, "buzz"));
        dividerObjects.add(new DividerOutputObject(10, "bag"));
        String runDivisionCheck = DividerCheckRunner.runDivisionCheck(1, 100, dividerObjects);
        System.out.println(runDivisionCheck);
    }
}
