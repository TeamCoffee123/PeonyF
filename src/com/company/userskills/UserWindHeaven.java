package com.company.userskills;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserWindHeaven extends UserSkills {
    final ConcurrentMap userSkills = new ConcurrentHashMap<>();
    public UserWindHeaven(String job, int uerLevel) {
        super("wind", 90);
        final ConcurrentMap<String,Integer> userSkills = new ConcurrentHashMap<>();
        userSkills.put("윈드 애로우",22);
        userSkills.put("메가 윈드 애로우",24);
        userSkills.put("윈드 스톰",26);
        userSkills.put("윈드 스피릿",28); //윈드 회오리
        setUserSkills(userSkills);
    }

}
