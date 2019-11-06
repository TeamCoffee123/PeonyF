package com.company.treedisaster;

public class SpiritFloodProtection extends TreeDisaster {
     /*
      홍수가 발생시 방어를 해주는 아이템 입니다.
     */

    public SpiritFloodProtection() {
        super("홍수 방지벽 설치", 1, 0, -10, 0, 0, 0, 0);
    }

    public String printSymptom() {
        return "홍수가 발생하여 나무에 물이 흘러넘치고 있습니다. ";
    }
}
