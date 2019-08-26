package com.studySpring.entity.impl;

import com.studySpring.entity.Minstrel;

import java.io.PrintStream;

public class MinstrelImpl implements Minstrel {

    private PrintStream printStream;

    public MinstrelImpl(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void singBeforeQuest(){
        printStream.println("the knight will embark the quest .....");
    }

    public void singAfterQuest(){
        printStream.println("the knight had embark the quest!");
    }


}
