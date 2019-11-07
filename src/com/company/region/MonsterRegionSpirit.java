package com.company.region;

import com.company.monster.*;

import java.util.ArrayList;
import java.util.List;

public class MonsterRegionSpirit extends MonsterRegion {
    Monster spiritMonsterGoblin = new SpiritMonsterGoblin();
    Monster spiritMonsterNaga = new SpiritMonsterNaga();
    Monster spiritMonsterDarkSpirit = new SpiritMonsterDarkSpirit();


    public MonsterRegionSpirit() {
        super(0); //레벨 제한이 없어서 10000으로 표현?
        final List<Monster> monsterList = new ArrayList<>();
        monsterList.add(spiritMonsterGoblin);
        monsterList.add(spiritMonsterNaga);
        monsterList.add(spiritMonsterDarkSpirit);
        setMonsterList(monsterList);
    }
}


