package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MiddleMonsterSteropes extends Monster {
    public MiddleMonsterSteropes()
    {
        super("스테로페스",16); //외눈박이 번개
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",18);
        skills.put("",20);
        skills.put("",22);
        skills.put("",24);
        setSkills(skills);
    }
}
