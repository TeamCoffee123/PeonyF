package com.company.treedisaster;

public class SpiritFertileLand extends TreeDisaster {
    /*
    아이템 획득시 발생
    비옥땅 영양제-> 아이템 드랍율을 2배  증가
     */

    public SpiritFertileLand() {
        super("비옥땅 영양제", 1, 0, 0, 0, 0, 0, 2.0);
    }

    public String printSymptom() {
        return "나무의 땅 비옥도를 높여 아이템 드랍율을 2배 올리시겠습니까?";
    }
}
