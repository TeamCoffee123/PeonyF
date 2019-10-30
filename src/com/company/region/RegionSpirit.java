package com.company.region;

import com.company.monster.Goblin;
import com.company.monster.Monster;
import com.company.monster.Naga;

import java.util.ArrayList;
import java.util.List;

public class RegionSpirit extends Region {
    public RegionSpirit() {
        super(1000000);
        final List<Monster> monsterList = new ArrayList<>();
        monsterList.add(new Naga());
        monsterList.add(new Goblin());
        setMonsterList(monsterList);
    }

}

