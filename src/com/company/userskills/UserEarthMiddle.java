package com.company.userskills;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserEarthMiddle extends UserSkills {
    final ConcurrentMap<String,Integer> userSkills = new ConcurrentHashMap<>();
    public UserEarthMiddle(String job, int uerLevel) {
        super("Earth", 60);
        userSkills.put("스톤 던지기",12);
        userSkills.put("스톤 애로우",14);
        userSkills.put("스톤 샤워",16);
        userSkills.put("스톤 스피릿",18); // 몬스터를 가만히 멈춰있게 함
        setUserSkills(userSkills);
    }
}
