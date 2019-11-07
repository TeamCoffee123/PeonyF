package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HeavenMonsterDemeter extends Monster {
    public HeavenMonsterDemeter()
    {
        super("데메테르",21); //대지의 여신
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("땅의 정령 소환",23);
        skills.put(" ",25);
        skills.put(" ",27);
        skills.put(" ",29);
        setSkills(skills);
    }

    @Override
    public String scriptMonster() {
        String script ="";
        return super.scriptMonster();
    }
}
