package com.thoughtworks.spoon;

import java.util.ArrayList;

/**
 * Created by abhijeetshelake on 5/31/16.
 */
public abstract class Volume {

    ArrayList<Volume> volumes;

    boolean is(Volume volume) {
        return false;
    }

    boolean canTransformFrom(Volume volume) {
        return false;
    }

    ;
}


