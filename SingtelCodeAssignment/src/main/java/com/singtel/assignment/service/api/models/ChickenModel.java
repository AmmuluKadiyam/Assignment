package com.singtel.assignment.service.api.models;

import com.singtel.assignment.service.api.activities.CanNotFlyActivity;
import com.singtel.assignment.service.api.enmus.SoundSupportEnum;
import com.singtel.assignment.service.api.support.SingHelper;
import com.singtel.assignment.service.api.utils.Constant;

public class ChickenModel extends BirdModel implements CanNotFlyActivity {
    public ChickenModel() {
        super(new SingHelper(SoundSupportEnum.CHICKEN));
    }

    public ChickenModel(SingHelper singHelper) {
        super(singHelper);
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }

    @Override
    public void canFly() {
        System.out.println(Constant.I_CANT_FLY);
    }
}
