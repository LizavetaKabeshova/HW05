package com.epam.hw4;

import com.epam.hw4.horses.FakeHorseForTest;
import com.epam.hw4.horses.FakeHorseForTest2;
import com.epam.hw4.horses.FakeHorseForTest3;
import org.junit.Assert;
import org.junit.Test;

public class RacecourseTest {

    Racecourse racecourse = new Racecourse();
    FakeHorseForTest fh = new FakeHorseForTest();
    FakeHorseForTest2 fh2 = new FakeHorseForTest2();
    FakeHorseForTest3 fh3 = new FakeHorseForTest3();


    @Test
    public void TestGetHorses() {
        Assert.assertEquals(racecourse.getHorses(fh, fh2, fh3), ("FH" + "\n" + "FH2" + "\n" + "FH3"));
    }

    @Test
    public void TestStartRace() {
        Assert.assertEquals(racecourse.startRace(fh, fh2, fh3), 3);
    }

    @Test
    public void TestStort() {
        Assert.assertEquals(racecourse.sort(fh, fh2, fh3), 3);
    }

}