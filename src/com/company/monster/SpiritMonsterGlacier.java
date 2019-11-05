package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SpiritMonsterGlacier extends Monster {
    public SpiritMonsterGlacier()
    {
        super("글랜셔",9);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put(" ",11);
        skills.put(" ",13);
        skills.put(" ",15);
        skills.put("센 눈보라",17);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str="[레벨 9 : 글랜셔] 얼음의 상위 정령 글랜셔가 다가오고있습니다.........";
        return super.toString();
    }
}
