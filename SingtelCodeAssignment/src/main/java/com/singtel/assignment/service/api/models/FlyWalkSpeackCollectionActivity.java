package com.singtel.assignment.service.api.models;

import com.singtel.assignment.service.api.activities.FlyActivity;
import com.singtel.assignment.service.api.activities.SpeakableActivity;
import com.singtel.assignment.service.api.activities.WalkableActivity;
import com.singtel.assignment.service.api.support.SingHelper;
import com.singtel.assignment.service.api.utils.Constant;

public class FlyWalkSpeackCollectionActivity extends AnimalModel implements FlyActivity, WalkableActivity, SpeakableActivity {
    private SingHelper singHelper;

    public FlyWalkSpeackCollectionActivity(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
