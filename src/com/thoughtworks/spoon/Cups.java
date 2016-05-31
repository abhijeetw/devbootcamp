package com.thoughtworks.spoon;

import java.util.ArrayList;

public class Cups extends Volume {

    public Cups(int count) {
        volumes = new ArrayList<Volume>();
        for (int index = 0; index < count; index++)
            volumes.add(new Cup());
    }

    @Override
    public boolean is(Volume volume) {
        if (volume.volumes.size() % volumes.size() == 0 && canTransformFrom(volume))
            return true;

        return false;
    }

    @Override
    public boolean canTransformFrom(Volume volume) {

        if (volume.getClass() == Ounces.class)
            return true;
        return false;
    }
}

