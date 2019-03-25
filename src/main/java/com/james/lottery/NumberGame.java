package com.james.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {//抽象類別
    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0;

    public abstract void generate();//抽象方法

    public boolean validate() {
        if (numbers.size() == numberCount) {
            return true;
        } else
            return false;
    }

}
