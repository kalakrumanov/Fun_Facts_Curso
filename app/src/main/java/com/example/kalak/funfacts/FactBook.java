package com.example.kalak.funfacts;

import java.util.Random;

/**
 * Created by kalak on 12/11/15.
 */
public class FactBook {

    // Member variables (properties about the object)

    public String[] mFacts = {
            "Cero",
            "uno",
            "dos",
            "tres",
            "cuatro",
            "cinco"
    };

    // Methods

    public String getFact() {

        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        return mFacts[randomNumber];

    }
}
