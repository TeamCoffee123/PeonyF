package com.company.region;
import com.company.monster.*;

import java.util.ArrayList;
import java.util.List;

public class MonsterRegionSpirit extends MonsterRegion {
    SpiritMonsterGoblin spiritMonsterGoblin = new SpiritMonsterGoblin();
    SpiritMonsterNaga spiritMonsterNaga = new SpiritMonsterNaga();
    SpiritMonsterBro spiritMonsterBro = new SpiritMonsterBro();
    SpiritMonsterDarkSpirit spiritMonsterDarkSpirit = new SpiritMonsterDarkSpirit();
    SpiritMonsterBehemoth spiritMonsterBehemoth = new SpiritMonsterBehemoth();
    SpiritMonsterAkan spiritMonsterAkan = new SpiritMonsterAkan();
    SpiritMonsterAmun spiritMonsterAmun = new SpiritMonsterAmun();
    SpiritMonsterFloe spiritMonsterFloe = new SpiritMonsterFloe();
    SpiritMonsterGlacier spiritMonsterGlacier = new SpiritMonsterGlacier();
    SpiritMonsterFreinture spiritMonsterFreinture = new SpiritMonsterFreinture();

    public MonsterRegionSpirit(){
        super(0); //레벨 제한이 없어서 10000으로 표현?
        final List<Monster> monsterList = new ArrayList<>();
        monsterList.add(spiritMonsterGoblin);
        monsterList.add(spiritMonsterNaga);
        monsterList.add(spiritMonsterBro);
        monsterList.add(spiritMonsterDarkSpirit);
        monsterList.add(spiritMonsterBehemoth);
        monsterList.add(spiritMonsterAkan);
        monsterList.add(spiritMonsterAmun);
        monsterList.add(spiritMonsterFloe);
        monsterList.add(spiritMonsterGlacier);
        monsterList.add(spiritMonsterFreinture);
        setMonsterList(monsterList);
    }
}


