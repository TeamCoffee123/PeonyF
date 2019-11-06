package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SpiritMonsterDarkSpirit extends Monster{
    public SpiritMonsterDarkSpirit() {
        super("검은정령",3);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("바늘 찌르기",5);
        skills.put("단체 공격",7);
        skills.put("고통",9);
        skills.put("어두운 환상",11);
        setSkills(skills);
    }

    public String scriptMonster()
    {
        return "[레벨 3 : 다크 정령]나도 한때 너와 같은 정령이였어.. 나도.. 정령이었다고!!";
    }
}
