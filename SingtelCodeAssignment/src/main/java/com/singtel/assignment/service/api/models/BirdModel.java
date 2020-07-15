package com.singtel.assignment.service.api.models;

import com.singtel.assignment.service.api.activities.FlyActivity;
import com.singtel.assignment.service.api.activities.SpeakableActivity;
import com.singtel.assignment.service.api.activities.WalkableActivity;
import com.singtel.assignment.service.api.enmus.SoundSupportEnum;
import com.singtel.assignment.service.api.support.SingHelper;
import com.singtel.assignment.service.api.utils.Constant;

public class BirdModel extends AnimalModel implements WalkableActivity, SpeakableActivity, FlyActivity {

    private SingHelper singHelper;

    public BirdModel() {
        this.singHelper = new SingHelper(SoundSupportEnum.DEFAULT);
    }

    public BirdModel(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }


    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }
}
