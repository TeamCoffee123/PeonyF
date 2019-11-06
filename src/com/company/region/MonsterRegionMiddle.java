package com.company.region;

import com.company.monster.*;

import java.util.ArrayList;

public class MonsterRegionMiddle extends MonsterRegion {
    Monster middleMonsterHyperion = new MiddleMonsterHyperion();
    Monster middleMonsterKronos = new MiddleMonsterKronos();
    Monster middleMonsterTethys = new MiddleMonsterTethys();
    Monster middleMonsterGyes = new MiddleMonsterGyes();

    public MonsterRegionMiddle() {
        super(60);
        final ArrayList<Monster> monsterList = new ArrayList<>();
        monsterList.add(middleMonsterHyperion);
        monsterList.add(middleMonsterKronos);
        monsterList.add(middleMonsterTethys);
        monsterList.add(middleMonsterGyes);
        setMonsterList(monsterList);

    }

}
