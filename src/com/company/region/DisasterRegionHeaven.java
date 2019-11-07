package com.company.region;

import com.company.treedisaster.*;

import java.util.ArrayList;
import java.util.List;

public class DisasterRegionHeaven extends DisasterRegion {
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

    //heaven disaster
    TreeDisaster heavenMildClimate = new HeavenMildClimate();
    TreeDisaster heavenSunBlock = new HeavenSunBlock();
    TreeDisaster heavenTempDes = new HeavenTempDes();
    TreeDisaster heavenTempRise = new HeavenTempRise();


    public DisasterRegionHeaven() {
        super(90);
        final List<TreeDisaster> disasterList = new ArrayList<>();


      /*
      [질문]
      1단계: Spirit 지역 -> Spirit 재해 8개
      2단계: Middle 지역 -> Middle 재해 4개+Spirit 재해 8개
      3단계: Heaven 지역 -> Heaven 재해 4개+ Middle 재해 4개+Spirit 재해 8개
      라고 표현시 아래와 같이 추가하는게 맞는지 문의드립니다.
      *DisasterRegionSpirit, DisasterRegionMiddle 클래스 참고
       */

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

        //heaven disaster
        disasterList.add(heavenMildClimate);
        disasterList.add(heavenSunBlock);
        disasterList.add(heavenTempRise);
        disasterList.add(heavenTempDes);

        setDisastersList(disasterList);
    }
}
