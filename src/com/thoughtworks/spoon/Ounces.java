package com.thoughtworks.spoon;

import java.util.ArrayList;
import java.util.List;

public class Ounces extends Volume {
    List<Ounce> ounces = new ArrayList<Ounce>();

    public Ounces(int count) {
        volumes = new ArrayList<Volume>();
        for (int index = 0; index < count; index++)
            ounces.add(new Ounce());
    }

    @Override
    public boolean is(Volume volume) {
        if (volume.volumes.size() % volumes.size() == 0 && canTransformFrom(volume))
            return true;

        return false;
    }

    @Override
    public boolean canTransformFrom(Volume volume) {

        if (volume.getClass() == TableSpoons.class)
            return true;
        return false;
    }

}
