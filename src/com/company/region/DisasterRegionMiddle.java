package com.company.region;

import com.company.monster.MiddleMonsterArges;
import com.company.treedisaster.*;

import java.util.ArrayList;
import java.util.List;

public class DisasterRegionMiddle extends DisasterRegion {
    //spirit disaster
    SpiritFertileLand spiritFertileLand = new SpiritFertileLand();
    SpiritFloodProtection spiritFloodProtection = new SpiritFloodProtection();
    SpiritPreventEarthquake spiritPreventEarthquake = new SpiritPreventEarthquake();
    SpiritPreventWeed spiritPreventWeed = new SpiritPreventWeed();
    SpiritRemoveWorms spiritRemoveWorms = new SpiritRemoveWorms();
    SpiritWaterControl spiritWaterControl = new SpiritWaterControl();
    SpiritWaterFungus spiritWaterFungus = new SpiritWaterFungus();
    SpiritWaterPollution spiritWaterPollution = new SpiritWaterPollution();

    //middle disaster
    MiddleWindMissingItem middleWindMissingItem = new MiddleWindMissingItem();
    MiddleWindControl middleWindControl = new MiddleWindControl();
    MiddleStrongWind middleStrongWind = new MiddleStrongWind();
    MiddleErodeHurri middleErodeHurri = new MiddleErodeHurri();



    public DisasterRegionMiddle()
    {
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
