package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SpiritMonsterAmun extends Monster {
    public SpiritMonsterAmun()
    {
        super("아뭄",7);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",9);
        skills.put("",11);
        skills.put("",13);
        skills.put("아이스 프리징",15);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str ="[레벨 7 : 아뭄] 모든걸 다 없애겠어 깔깔깔 아무것도 존재하지 않도록.. 엇 너는 누구지?";
        return super.toString();
    }
}
