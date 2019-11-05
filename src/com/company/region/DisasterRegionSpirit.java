package com.company.region;

import com.company.treedisaster.*;

import java.util.ArrayList;
import java.util.List;

public class DisasterRegionSpirit extends DisasterRegion {
    SpiritFertileLand spiritFertileLand = new SpiritFertileLand();
    SpiritFloodProtection spiritFloodProtection = new SpiritFloodProtection();
    SpiritPreventEarthquake spiritPreventEarthquake = new SpiritPreventEarthquake();
    SpiritPreventWeed spiritPreventWeed = new SpiritPreventWeed();
    SpiritRemoveWorms spiritRemoveWorms = new SpiritRemoveWorms();
    SpiritWaterControl spiritWaterControl = new SpiritWaterControl();
    SpiritWaterFungus spiritWaterFungus = new SpiritWaterFungus();
    SpiritWaterPollution spiritWaterPollution = new SpiritWaterPollution();

    public DisasterRegionSpirit()
    {
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
