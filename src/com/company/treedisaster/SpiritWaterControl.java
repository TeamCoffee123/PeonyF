package com.company.treedisaster;

public class SpiritWaterControl extends TreeDisaster {
    /*
    아이템 획득시 발생
     물양 조절실패로 아이템 획득율 0.5% 하락
     */

    public SpiritWaterControl() {
        super("물 양 자동 조절 기계", 1, 0, 0, 0, 0, 0, 0.5);
    }

    public String printSymptom() {

        return "물양이 조절이 되지 않아 아이템 획득율이 하락됩니다.";
    }
}
