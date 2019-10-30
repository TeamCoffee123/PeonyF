package com.company.region;
import com.company.monster.*;

import java.util.ArrayList;

public class MonsterRegionMiddle extends MonsterRegion {
    MiddleMonsterHyperion middleMonsterHyperion = new MiddleMonsterHyperion();
    MiddleMonsterKronos middleMonsterKronos = new MiddleMonsterKronos();
    MiddleMonsterTethys middleMonsterTethys = new MiddleMonsterTethys();
    MiddleMonsterTheia middleMonsterTheia = new MiddleMonsterTheia();
    MiddleMonsterBrontes middleMonsterBrontes = new MiddleMonsterBrontes();
    MiddleMonsterSteropes middleMonsterSteropes = new MiddleMonsterSteropes();
    MiddleMonsterArges middleMonsterArges = new MiddleMonsterArges();
    MiddleMonsterKottos middleMonsterKottos = new MiddleMonsterKottos();
    MiddleMonsterBriareos middleMonsterBriareos = new MiddleMonsterBriareos();
    MiddleMonsterGyes middleMonsterGyes = new MiddleMonsterGyes();

    public MonsterRegionMiddle()
    {
        super(60);
        final ArrayList<Monster> monsterList = new ArrayList<>();
        monsterList.add(middleMonsterHyperion);
        monsterList.add(middleMonsterKronos);
        monsterList.add(middleMonsterTethys);
        monsterList.add(middleMonsterTheia);
        monsterList.add(middleMonsterBrontes);
        monsterList.add(middleMonsterSteropes);
        monsterList.add(middleMonsterArges);
        monsterList.add(middleMonsterKottos);
        monsterList.add(middleMonsterBriareos);
        monsterList.add(middleMonsterGyes);
        setMonsterList(monsterList);

    }

}
