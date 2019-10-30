package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HeavenMonsterArtemis extends Monster{
    public HeavenMonsterArtemis()
    {
        super("아르테미스",23); //사냥의 여신
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put(" ",25);
        skills.put(" ",27);
        skills.put(" ",29);
        skills.put(" ",32);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str =" ";
        return super.toString();
    }
}
