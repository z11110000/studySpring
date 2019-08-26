package com.studyspringtest.knights;

import com.studySpring.entity.Knight;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
