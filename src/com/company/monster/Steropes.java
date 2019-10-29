package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Steropes extends Monster {
    public Steropes()
    {
        super("스테로페스",6); //외눈박이 번개
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",2);
        skills.put("",4);
        skills.put("",6);
        skills.put("",8);
        setSkills(skills);
    }
}
