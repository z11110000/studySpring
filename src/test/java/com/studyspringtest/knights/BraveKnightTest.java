package com.studyspringtest.knights;

import com.studyspring.knights.BraveKnight;
import com.studyspring.quest.Quest;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mock = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mock);
        braveKnight.embarkOnQuest();
        verify(mock,times(1)).embark();
    }
}
