package com.sustav.produces;

import javax.enterprise.inject.Produces;
import java.util.Random;

public class IntRandom {

    @Produces
    public Integer getRandomNumber() {
        return new Random().nextInt(100);
    }
}
