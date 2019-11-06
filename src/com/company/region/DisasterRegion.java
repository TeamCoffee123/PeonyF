package com.company.region;

import com.company.treedisaster.*;

import java.util.Collections;
import java.util.List;

public class DisasterRegion {
    private final int limitedLevel;
    private List<TreeDisaster> disastersList;

    public DisasterRegion(int limitedLevel) {

        this.limitedLevel = limitedLevel;
    }


    public void setDisastersList(List<TreeDisaster> disastersList) {

        this.disastersList = disastersList;
    }

    public TreeDisaster makeDisaster() {
        Collections.shuffle(disastersList);
        return disastersList.get(0);
    }

}
