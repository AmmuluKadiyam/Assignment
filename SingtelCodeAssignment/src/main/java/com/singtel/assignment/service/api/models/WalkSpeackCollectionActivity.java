package com.singtel.assignment.service.api.models;

import com.singtel.assignment.service.api.activities.SpeakableActivity;
import com.singtel.assignment.service.api.activities.WalkableActivity;
import com.singtel.assignment.service.api.enmus.SoundSupportEnum;
import com.singtel.assignment.service.api.support.SingHelper;
import com.singtel.assignment.service.api.utils.Constant;

public abstract class WalkSpeackCollectionActivity extends AnimalModel implements WalkableActivity, SpeakableActivity {
    private SingHelper singHelper;

    public WalkSpeackCollectionActivity() {
        this.singHelper = new SingHelper(SoundSupportEnum.DEFAULT);
    }

    public WalkSpeackCollectionActivity(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
