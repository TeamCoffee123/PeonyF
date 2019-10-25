package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Naga extends Monster {

    public Naga() {
        super("나가", 1);

        final ConcurrentMap<String, Integer> skills = new ConcurrentHashMap<>();
        skills.put("몸통박치기", 2);
        skills.put("물기", 4);
        skills.put("무기뺏기", 6);
        skills.put("단체공격", 8);
        setSkills(skills);
    }
}
