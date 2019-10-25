package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Goblin extends Monster {
    public Goblin() {
        super("고블린", 2);
        final ConcurrentMap<String, Integer> skills = new ConcurrentHashMap<>();
        skills.put("몸통박치기", 2);
        skills.put("물기", 4);
        skills.put("무기뺏기", 6);
        skills.put("단체공격", 8);
        setSkills(skills);
    }
}
