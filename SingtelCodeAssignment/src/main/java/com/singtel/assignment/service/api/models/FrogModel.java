package com.singtel.assignment.service.api.models;

import com.singtel.assignment.service.api.activities.SpeakableActivity;
import com.singtel.assignment.service.api.activities.SwimActivity;
import com.singtel.assignment.service.api.activities.WalkableActivity;
import com.singtel.assignment.service.api.enmus.SoundSupportEnum;
import com.singtel.assignment.service.api.support.SingHelper;
import com.singtel.assignment.service.api.utils.Constant;

public class FrogModel extends AnimalModel implements SwimActivity, WalkableActivity, SpeakableActivity {
    SingHelper singHelper;

    public FrogModel() {
        singHelper = new SingHelper(SoundSupportEnum.DEFAULT);
    }

    public FrogModel(SingHelper singHelper) {
        singHelper = singHelper;
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
