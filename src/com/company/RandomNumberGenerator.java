package com.company;

import java.util.Random;

public class RandomNumberGenerator {
    public static int randomNumber() {
        return new Random().nextInt();
    }

    public int randomNumber(int limit) {
        return new Random().nextInt(limit);
    }
}
