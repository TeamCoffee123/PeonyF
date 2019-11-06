package com.company.region;

import com.company.treedisaster.*;

import java.util.ArrayList;
import java.util.List;

public class DisasterRegionSpirit extends DisasterRegion {
    TreeDisaster spiritFertileLand = new SpiritFertileLand();
    TreeDisaster spiritFloodProtection = new SpiritFloodProtection();
    TreeDisaster spiritPreventEarthquake = new SpiritPreventEarthquake();
    TreeDisaster spiritPreventWeed = new SpiritPreventWeed();
    TreeDisaster spiritRemoveWorms = new SpiritRemoveWorms();
    TreeDisaster spiritWaterControl = new SpiritWaterControl();
    TreeDisaster spiritWaterFungus = new SpiritWaterFungus();
    TreeDisaster spiritWaterPollution = new SpiritWaterPollution();

    public DisasterRegionSpirit() {
        super(0);
        final List<TreeDisaster> disasterList = new ArrayList<>();
        disasterList.add(spiritFertileLand);
        disasterList.add(spiritFloodProtection);
        disasterList.add(spiritPreventEarthquake);
        disasterList.add(spiritPreventWeed);
        disasterList.add(spiritRemoveWorms);
        disasterList.add(spiritWaterControl);
        disasterList.add(spiritWaterFungus);
        disasterList.add(spiritWaterPollution);
        setDisastersList(disasterList);
    }


}
