package com.company;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class User {


    /*
    각 마을 선택및 스킬 부여, hp 표현, 인벤토리 상태 print
     */
    private int userHp;
    private int uerLevel;
    private final String job;

    public User(String job, int uerLevel)
    {
        userHp= uerLevel*50;
        this.uerLevel = uerLevel;
        this.job = job;
    }

    public int getUerLevel() {
        return uerLevel;
    }

    public int getUserHp() {
        return userHp;
    }

    private ConcurrentMap<String,Integer> userSkills;
    private ConcurrentMap<String,Integer> inventory = new ConcurrentHashMap<>();


    public void setUserSkills(ConcurrentMap<String,Integer> userSkills)
    {
        this.userSkills= userSkills;
    }
    public ConcurrentMap<String, Integer> getUserSkills() {
        return userSkills;
    }

    public void setInventory(ConcurrentMap<String,Integer> inventory){this.inventory=inventory; }
    public ConcurrentMap<String, Integer> getInventory() {return inventory;}

}
