package com.thoughtworks.spoon;

import java.util.ArrayList;
import java.util.List;

public class Pints extends Volume {
    List<Volume> pints = new ArrayList<Volume>();

    public Pints(int count) {
        volumes = new ArrayList<Volume>();
        for (int index = 0; index < count; index++)
            volumes.add(new Pint());
    }

    @Override
    public boolean is(Volume volume) {
        if (volume.volumes.size() % volumes.size() == 0 && canTransformFrom(volume))
            return true;

        return false;
    }

    @Override
    public boolean canTransformFrom(Volume volume) {

        if (volume.getClass() == Cups.class)
            return true;
        return false;
    }
}
