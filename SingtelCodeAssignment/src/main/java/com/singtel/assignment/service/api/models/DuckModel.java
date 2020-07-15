package com.singtel.assignment.service.api.models;

import com.singtel.assignment.service.api.activities.FlyActivity;
import com.singtel.assignment.service.api.activities.SwimActivity;
import com.singtel.assignment.service.api.enmus.SoundSupportEnum;
import com.singtel.assignment.service.api.support.SingHelper;
import com.singtel.assignment.service.api.utils.Constant;

public class DuckModel extends BirdModel implements SwimActivity, FlyActivity {

    public DuckModel() {
        super(new SingHelper(SoundSupportEnum.DUCK));
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }

    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }

    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
