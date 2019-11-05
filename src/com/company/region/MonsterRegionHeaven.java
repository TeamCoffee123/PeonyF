package com.company.region;


import com.company.monster.*;

import java.util.ArrayList;

public class MonsterRegionHeaven extends MonsterRegion {

    HeavenMonsterDemeter heavenMonsterDemeter = new HeavenMonsterDemeter();
    HeavenMonsterPoseidon heavenMonsterPoseidon = new HeavenMonsterPoseidon();
    HeavenMonsterArtemis heavenMonsterArtemis = new HeavenMonsterArtemis();
    HeavenMonsterApollon heavenMonsterApollon = new HeavenMonsterApollon();
    HeavenMonsterDionysos heavenMonsterDionysos = new HeavenMonsterDionysos();
    HeavenMonsterHera heavenMonsterHera = new HeavenMonsterHera();
    HeavenMonsterAthena heavenMonsterAthena = new HeavenMonsterAthena();
    HeavenMonsterAres heavenMonsterAres = new HeavenMonsterAres();
    HeavenMonsterHades heavenMonsterHades = new HeavenMonsterHades();
    HeavenMonsterZeus heavenMonsterZeus = new HeavenMonsterZeus();


    public MonsterRegionHeaven()
    {
        super(90);
        final ArrayList<Monster> monsterList = new ArrayList<>();
        monsterList.add(heavenMonsterDemeter);
        monsterList.add(heavenMonsterPoseidon);
        monsterList.add(heavenMonsterArtemis);
        monsterList.add(heavenMonsterApollon);
        monsterList.add(heavenMonsterDionysos);
        monsterList.add(heavenMonsterHera);
        monsterList.add(heavenMonsterAthena);
        monsterList.add(heavenMonsterAres);
        monsterList.add(heavenMonsterHades);
        monsterList.add(heavenMonsterZeus);
        setMonsterList(monsterList);
    }



}
