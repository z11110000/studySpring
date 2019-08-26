package com.studySpring.entity.impl;

import com.studySpring.entity.Knight;
import com.studySpring.entity.Quest;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        System.out.println("the brave knight embark the quest");
        quest.embark();
    }
}
