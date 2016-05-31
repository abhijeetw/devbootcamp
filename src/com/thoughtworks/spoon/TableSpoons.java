package com.thoughtworks.spoon;

import java.util.ArrayList;
import java.util.List;

public class TableSpoons extends Volume {
    List<Volume> tablespoons = new ArrayList<Volume>();

    public TableSpoons(int count) {
        volumes = new ArrayList<Volume>();
        for (int index = 0; index < count; index++)
            volumes.add(new TableSpoon());
    }

    @Override
    public boolean is(Volume volume) {
        if (volume.volumes.size() % volumes.size() == 0 && canTransformFrom(volume))
            return true;

        return false;
    }

    @Override
    public boolean canTransformFrom(Volume volume) {

        if (volume.getClass() == TeaSpoons.class)
            return true;
        return false;
    }

}