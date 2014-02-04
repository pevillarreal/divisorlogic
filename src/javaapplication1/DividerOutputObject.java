/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

public class DividerOutputObject implements Comparable<DividerOutputObject> {

    private int divider;
    private String output;

    public DividerOutputObject(int divider, String output) {
        this.divider = divider;
        this.output = output;
    }

    public int getDivider() {
        return divider;
    }

    public String getOutput() {
        return output;
    }

    @Override
    public int compareTo(DividerOutputObject o) {
        if (this.divider > o.divider) {
            return 1;
        }
        if (this.divider < o.divider) {
            return -1;
        }
        
        return 0;
    }

}
