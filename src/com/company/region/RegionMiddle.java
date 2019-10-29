package com.company.region;
import com.company.monster.*;

import java.util.ArrayList;
import java.util.Random;

public class RegionMiddle extends Region{
    Hyperion hyperion = new Hyperion();
    Kronos kronos = new Kronos();
    Tethys tethys = new Tethys();
    Theia theia = new Theia();
    Brontes brontes = new Brontes();
    Steropes steropes = new Steropes();
    Ares ares = new Ares();
    Kottos kottos = new Kottos();
    Briareos briareos = new Briareos();
    Gyes gyes = new Gyes();

    public RegionMiddle()
    {
        super(60);
        final ArrayList<Monster> monsterList = new ArrayList<>();
        monsterList.add(hyperion);
        monsterList.add(kronos);
        monsterList.add(tethys);
        monsterList.add(theia);
        monsterList.add(brontes);
        monsterList.add(steropes);
        monsterList.add(ares);
        monsterList.add(kottos);
        monsterList.add(briareos);
        monsterList.add(gyes);
        setMonsterList(monsterList);

    }

}
