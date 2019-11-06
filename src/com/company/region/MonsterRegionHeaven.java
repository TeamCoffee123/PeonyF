package com.company.region;


import com.company.monster.*;

import java.util.ArrayList;

public class MonsterRegionHeaven extends MonsterRegion {

    Monster heavenMonsterDemeter = new HeavenMonsterDemeter();
    Monster heavenMonsterPoseidon = new HeavenMonsterPoseidon();
    Monster heavenMonsterArtemis = new HeavenMonsterArtemis();


    public MonsterRegionHeaven() {
        super(90);
        final ArrayList<Monster> monsterList = new ArrayList<>();
        monsterList.add(heavenMonsterDemeter);
        monsterList.add(heavenMonsterPoseidon);
        monsterList.add(heavenMonsterArtemis);
        setMonsterList(monsterList);
    }


}
