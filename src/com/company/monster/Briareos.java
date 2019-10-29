package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Briareos extends Monster {
    public Briareos()
    {
        super("브리아레오스",9);
        final ConcurrentMap<String, Integer> skills = new ConcurrentHashMap<>();
        skills.put("",2);
        skills.put("",4);
        skills.put("",6);
        skills.put("",8);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str=" ";
        return super.toString();
    }
}
