package com.company.userskills;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserWindMiddle extends UserSkills {
    final ConcurrentMap userSkills = new ConcurrentHashMap<>();
    public UserWindMiddle(String job, int uerLevel) {
        super("wind", 60);
        final ConcurrentMap<String,Integer> userSkills = new ConcurrentHashMap<>();
        userSkills.put("윈드 애로우",12);
        userSkills.put("메가 윈드 애로우",14);
        userSkills.put("윈드 스톰",16);
        userSkills.put("윈드 스피릿",18); //윈드 회오리
        setUserSkills(userSkills);
    }
}
