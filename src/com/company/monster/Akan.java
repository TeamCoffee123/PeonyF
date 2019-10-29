package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Akan extends Monster {
    public Akan()
    {
        super("아칸",6);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",2);
        skills.put("",4);
        skills.put("",6);
        skills.put("",8);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str="[레벨 6 : 아칸] 모든 마을을 얼음의 마을로 바꾸겠어! 얼음의 정령들! 어서 다 얼려버리자고!";
        return super.toString();
    }
}
