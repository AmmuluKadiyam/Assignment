package com.singtel.assignment.service.api.support;

import com.singtel.assignment.service.api.activities.FlyActivity;
import com.singtel.assignment.service.api.activities.SpeakableActivity;
import com.singtel.assignment.service.api.activities.SwimActivity;
import com.singtel.assignment.service.api.activities.WalkableActivity;
import com.singtel.assignment.service.api.models.AnimalModel;

public class AnimalUtil {
    AnimalModel[] animals;
    int flyingAnimal = 0;
    int walkingAnimal = 0;
    int speakingAnimal = 0;
    int swimingAnimal = 0;


    public AnimalUtil(AnimalModel[] animals) {
        this.animals = animals;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof FlyActivity) {
                flyingAnimal += 1;
            }
            if (animals[i] instanceof WalkableActivity) {
                walkingAnimal += 1;
            }
            if (animals[i] instanceof SpeakableActivity) {
                speakingAnimal += 1;
            }
            if (animals[i] instanceof SwimActivity) {
                swimingAnimal += 1;
            }
        }
    }

    public int getFlyingAnimal() {
        return flyingAnimal;
    }

    public void setFlyingAnimal(int flyingAnimal) {
        this.flyingAnimal = flyingAnimal;
    }

    public int getWalkingAnimal() {
        return walkingAnimal;
    }

    public void setWalkingAnimal(int walkingAnimal) {
        this.walkingAnimal = walkingAnimal;
    }

    public int getSpeakingAnimal() {
        return speakingAnimal;
    }

    public void setSpeakingAnimal(int speakingAnimal) {
        this.speakingAnimal = speakingAnimal;
    }

    public int getSwimingAnimal() {
        return swimingAnimal;
    }

    public void setSwimingAnimal(int swimingAnimal) {
        this.swimingAnimal = swimingAnimal;
    }
}
