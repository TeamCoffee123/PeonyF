package com.company.userskills;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserEarthHeaven extends UserSkills {
    final ConcurrentMap<String,Integer> userSkills = new ConcurrentHashMap<>();
    public UserEarthHeaven(String job, int uerLevel) {
        super("Earth", 90);
        userSkills.put("스톤 던지기",22);
        userSkills.put("스톤 애로우",24);
        userSkills.put("스톤 샤워",26);
        userSkills.put("스톤 스피릿",28); // 몬스터를 가만히 멈춰있게 함
        setUserSkills(userSkills);
    }
}
