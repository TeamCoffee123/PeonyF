package com.company.region;


import com.company.monster.*;

import java.util.ArrayList;

public class RegionHeaven extends Region {

    Demeter demeter = new Demeter();
    Poseidon poseidon = new Poseidon();
    Artemis artemis = new Artemis();
    Apollon apollon = new Apollon();
    Dionysos dionysos = new Dionysos();
    Hera hera = new Hera();
    Athena athena = new Athena();
    Ares ares = new Ares();
    Hades hades = new Hades();
    Zeus zeus = new Zeus();


    public RegionHeaven()
    {
        super(90);
        final ArrayList<Monster> monsterList = new ArrayList<>();
        monsterList.add(demeter);
        monsterList.add(poseidon);
        monsterList.add(artemis);
        monsterList.add(apollon);
        monsterList.add(dionysos);
        monsterList.add(hera);
        monsterList.add(athena);
        monsterList.add(ares);
        monsterList.add(hades);
        monsterList.add(zeus);
        setMonsterList(monsterList);
    }



}
