package com.company.treedisaster;

public class SpiritWaterPollution extends TreeDisaster {

    //다른 정령들의 장난으로 물이 오염되었을 때 오염된 물을 정화 해주는 아이템 입니다.

    public SpiritWaterPollution() {
        super("물 오염 치료제", 1, 0, 6, 0, 0, 0, 0);
    }

    public String printSymptom() {
        return "다른 정령들의 장난으로 물이 오염되어 물이 말랐습니다. ";
    }

}
