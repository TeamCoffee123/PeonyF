package com.company.userskills;


import javafx.util.Pair;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserWaterSpirit extends UserSkills {

    public UserWaterSpirit() {
        super("water", 0);
        final ConcurrentMap<Integer, Pair<String, Integer>> userSkills = new ConcurrentHashMap<>();
        userSkills.put(1, new Pair<>("워터 스매시", 2));
        userSkills.put(2, new Pair<>("워터 캐논", 4)); //물대포
        userSkills.put(3, new Pair<>("토네이도", 6));
        userSkills.put(4, new Pair<>("워터 스피릿", 8)); //물의 정령으로 못움직이게 함
        setUserSkills(userSkills);
    }


}
