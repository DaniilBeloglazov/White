package com.lvl3tasks.tsk7;

public class Solution {
    public static void main(String[] args){
        Cat.addCats(46);
        System.out.print(Cat.catsCount);
    }
    public static class Cat{
       public static int catsCount;
       public static void addCats(int numOfCats){
           catsCount += numOfCats;
       }
    }
}