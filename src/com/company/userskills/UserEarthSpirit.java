package com.company.userskills;


import javafx.util.Pair;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class UserEarthSpirit extends UserSkills {
    final ConcurrentMap<Integer, Pair<String, Integer>> userSkills = new ConcurrentHashMap<>();

    public UserEarthSpirit() {
        super("Earth", 0);
        userSkills.put(1, new Pair<>("스톤 던지기", 2));
        userSkills.put(2, new Pair<>("스톤 애로우", 4));
        userSkills.put(3, new Pair<>("스톤 샤워", 6));
        userSkills.put(4, new Pair<>("스톤 스피릿", 8)); // 몬스터를 가만히 멈춰있게 함
        setUserSkills(userSkills);
    }
     
}
