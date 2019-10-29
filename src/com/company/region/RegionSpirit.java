package com.company.region;
import com.company.monster.*;

import java.util.ArrayList;
import java.util.List;

public class RegionSpirit extends Region{
    Goblin goblin = new Goblin();
    Naga naga = new Naga();
    Bro bro = new Bro();
    DarkSpirit darkSpirit = new DarkSpirit();
    Behemoth behemoth = new Behemoth();
    Akan akan = new Akan();
    Amun amun = new Amun();
    Floe floe = new Floe();
    Glacier glacier = new Glacier();
    Freinture freinture = new Freinture();

    public RegionSpirit(){
        super(100000); //레벨 제한이 없어서 10000으로 표현
        final List<Monster> monsterList = new ArrayList<>();
        monsterList.add(goblin);
        monsterList.add(naga);
        monsterList.add(bro);
        monsterList.add(darkSpirit);
        monsterList.add(behemoth);
        monsterList.add(akan);
        monsterList.add(amun);
        monsterList.add(floe);
        monsterList.add(glacier);
        monsterList.add(freinture);
        setMonsterList(monsterList);
    }
}


