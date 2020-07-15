package com.singtel.assignment.starter;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.singtel.assignment.service.api.enmus.LanguageSupportEnum;
import com.singtel.assignment.service.api.enmus.SoundSupportEnum;
import com.singtel.assignment.service.api.models.BirdModel;
import com.singtel.assignment.service.api.models.ButterflyModel;
import com.singtel.assignment.service.api.models.CatModel;
import com.singtel.assignment.service.api.models.ChickenModel;
import com.singtel.assignment.service.api.models.DogModel;
import com.singtel.assignment.service.api.models.DolphinModel;
import com.singtel.assignment.service.api.models.DuckModel;
import com.singtel.assignment.service.api.models.FishModel;
import com.singtel.assignment.service.api.models.ParrotModel;
import com.singtel.assignment.service.api.models.RoosterModel;
import com.singtel.assignment.service.api.support.SingHelper;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SolutionTest.class);

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeAll
    public static void setUp() {
        System.out.println("@BeforAll - Executes");
    }

    @BeforeEach
    public void init() {
        System.out.println("@BeforeEach - Executes");
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void walk() {

        new BirdModel().canWalk();
        assertThat(outContent.toString(), containsString("I am started walking"));
        new ChickenModel().canWalk();
        assertThat(outContent.toString(), containsString("I am started walking"));
        new DuckModel().canWalk();
        assertThat(outContent.toString(), containsString("I am started walking"));
        new RoosterModel().canWalk();
        assertThat(outContent.toString(), containsString("I am started walking"));
        new ButterflyModel().canWalk();
        assertThat(outContent.toString(), containsString("I am started walking"));
    }

    @Test
    void fly() {
        new DuckModel().canFly();
        assertThat(outContent.toString(), containsString("flying"));
        new ParrotModel().canFly();
        assertThat(outContent.toString(), containsString("flying"));
        new ButterflyModel().canFly();
        assertThat(outContent.toString(), containsString("flying"));

        new ButterflyModel().canFly();
        assertThat(outContent.toString(), containsString("I cant Fly"));
        new ButterflyModel().transform();

        new ButterflyModel().canFly();
        assertThat(outContent.toString(), containsString("flying"));
    }

    @Test
    void sing() {
        new BirdModel().callSound();
        assertThat(outContent.toString(), containsString("I am singing"));
        new DuckModel().callSound();
        assertThat(outContent.toString(), containsString("Quack, quack"));
        new ChickenModel().callSound();
        assertThat(outContent.toString(), containsString("Cluck, cluck"));

        new ChickenModel(new SingHelper(SoundSupportEnum.CHICKEN)).callSound();
        assertThat(outContent.toString(), containsString("Cluck, cluck"));
        new RoosterModel().callSound();
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));
        new RoosterModel(LanguageSupportEnum.DANISH).callSound();
        assertThat(outContent.toString(), containsString("kykyliky"));

        new DogModel(new SingHelper(SoundSupportEnum.DOG)).callSound();
        assertThat(outContent.toString(), containsString("Woof, woof"));
        new CatModel(new SingHelper(SoundSupportEnum.CAT)).callSound();
        assertThat(outContent.toString(), containsString("Meow"));

        new ParrotModel().callSound();
        assertThat(outContent.toString(), containsString("I am singing"));
        new ParrotModel(new SingHelper(SoundSupportEnum.DOG)).callSound();
        assertThat(outContent.toString(), containsString("Woof, woof"));
        new ParrotModel(new SingHelper(SoundSupportEnum.CAT)).callSound();
        assertThat(outContent.toString(), containsString("Meow"));
        new ParrotModel(new SingHelper(SoundSupportEnum.ROOSTER)).callSound();
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));

        new ButterflyModel().callSound();
        assertThat(outContent.toString(), containsString("caterpillar"));
        new ButterflyModel().transform();
        new ButterflyModel().callSound();
        assertThat(outContent.toString(), containsString(""));


    }

    @Test
    void swim() {
        new DuckModel().canSwim();
        assertThat(outContent.toString(), containsString("I am started swimming"));
        new FishModel().canSwim();
        assertThat(outContent.toString(), containsString("I am started swimming"));
        new DolphinModel().canSwim();
        assertThat(outContent.toString(), containsString("I am started swimming"));
    }


}