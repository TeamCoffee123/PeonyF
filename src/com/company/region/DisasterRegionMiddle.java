package com.company.region;

import com.company.treedisaster.*;

import java.util.ArrayList;
import java.util.List;

public class DisasterRegionMiddle extends DisasterRegion {
    //spirit disaster
    TreeDisaster spiritFertileLand = new SpiritFertileLand();
    TreeDisaster spiritFloodProtection = new SpiritFloodProtection();
    TreeDisaster spiritPreventEarthquake = new SpiritPreventEarthquake();
    TreeDisaster spiritPreventWeed = new SpiritPreventWeed();
    TreeDisaster spiritRemoveWorms = new SpiritRemoveWorms();
    TreeDisaster spiritWaterControl = new SpiritWaterControl();
    TreeDisaster spiritWaterFungus = new SpiritWaterFungus();
    TreeDisaster spiritWaterPollution = new SpiritWaterPollution();

    //middle disaster
    TreeDisaster middleWindMissingItem = new MiddleWindMissingItem();
    TreeDisaster middleWindControl = new MiddleWindControl();
    TreeDisaster middleStrongWind = new MiddleStrongWind();
    TreeDisaster middleErodeHurri = new MiddleErodeHurri();


    public DisasterRegionMiddle() {
        super(60);
        final List<TreeDisaster> disasterList = new ArrayList<>();

        //spirit disaster
        disasterList.add(spiritFertileLand);
        disasterList.add(spiritFloodProtection);
        disasterList.add(spiritPreventEarthquake);
        disasterList.add(spiritPreventWeed);
        disasterList.add(spiritRemoveWorms);
        disasterList.add(spiritWaterControl);
        disasterList.add(spiritWaterFungus);
        disasterList.add(spiritWaterPollution);

        //middle disaster
        disasterList.add(middleErodeHurri);
        disasterList.add(middleStrongWind);
        disasterList.add(middleWindControl);
        disasterList.add(middleWindMissingItem);

        setDisastersList(disasterList);

    }
}
