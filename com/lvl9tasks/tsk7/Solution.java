package com.lvl9tasks.tsk7;

class Solution {
    public static void main(String[] args){
        long l = 111_1111_111_110L;
        int x = 0b1000_1100_1010; // 2250
        double m = 110_987_654_6299.123_34;
        float f = l++ + 10 + ++x - (float)m; //
        l = (long) f / 1000;
        System.out.print(l);
    }
}
