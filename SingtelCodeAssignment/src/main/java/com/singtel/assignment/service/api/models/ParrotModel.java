package com.singtel.assignment.service.api.models;

import com.singtel.assignment.service.api.activities.FlyActivity;
import com.singtel.assignment.service.api.enmus.SoundSupportEnum;
import com.singtel.assignment.service.api.support.SingHelper;
import com.singtel.assignment.service.api.utils.Constant;

public class ParrotModel extends BirdModel implements FlyActivity {
    public ParrotModel() {
        super(new SingHelper(SoundSupportEnum.DEFAULT));
    }

    public ParrotModel(SingHelper singHelper) {
        super(singHelper);
    }

    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }
}
