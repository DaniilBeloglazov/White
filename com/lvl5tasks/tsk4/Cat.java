package com.lvl5tasks.tsk4;

class Cat {
    static int catCount;
    {catCount++;}
    @Override
    protected void finalize() throws Throwable {
        catCount--;
    }
}
