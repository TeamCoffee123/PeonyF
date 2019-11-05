package com.company;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class User {
    /*
    각 마을 선택및 스킬 부여, hp 표현, 인벤토리 상태 print
     */
    private int userHp;
    private int uerLevel;
    private Job job;

    public User() {
    }


    public void setUserHp(int userHp) {
        this.userHp = userHp;
    }

    public void setUerLevel(int uerLevel) {
        this.uerLevel = uerLevel;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getUerLevel() {
        return uerLevel;
    }

    public int getUserHp() {
        return userHp;
    }

    public Job getJob() {
        return job;
    }

    private ConcurrentMap<String, Integer> inventory = new ConcurrentHashMap<>();

    public void setInventory(ConcurrentMap<String, Integer> inventory) {
        this.inventory = inventory;
    }

    public ConcurrentMap<String, Integer> getInventory() {
        return inventory;
    }

    public ConcurrentMap<String, Integer> getSkills(){
        return job.getUserSkills();
    }

}
