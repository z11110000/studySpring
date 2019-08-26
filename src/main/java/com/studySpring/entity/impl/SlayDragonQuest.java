package com.studySpring.entity.impl;

import com.studySpring.entity.Quest;

public class SlayDragonQuest implements Quest {

    @Override
    public void embark(){
        System.out.println("slay dragon quest having embark.....");
    }
}
