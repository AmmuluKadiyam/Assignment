package com.singtel.assignment.service.api.models;

import com.singtel.assignment.service.api.activities.FlyActivity;
import com.singtel.assignment.service.api.activities.CanNotFlyActivity;
import com.singtel.assignment.service.api.activities.CanNotSpeakActivity;
import com.singtel.assignment.service.api.activities.SpeakableActivity;
import com.singtel.assignment.service.api.enmus.SoundSupportEnum;
import com.singtel.assignment.service.api.support.SingHelper;
import com.singtel.assignment.service.api.utils.Constant;

public class ButterflyModel extends FlyWalkSpeackCollectionActivity {
    private FlyWalkSpeackCollectionActivity state = new caterpillarState(new SingHelper(SoundSupportEnum.CATERPILLAR));

    public ButterflyModel() {
        super(new SingHelper(SoundSupportEnum.CATERPILLAR));
    }

    public void transform() {
        state = new ButterflyState(new SingHelper(SoundSupportEnum.NO_SOUND));
    }

    @Override
    public void canFly() {
        state.canFly();
    }

    @Override
    public void callSound() {
        state.callSound();
    }

    @Override
    public void canWalk() {
        state.canWalk();
    }

    private class ButterflyState extends FlyWalkSpeackCollectionActivity implements FlyActivity, CanNotSpeakActivity {

        public ButterflyState(SingHelper singHelper) {
            super(singHelper);
        }

        @Override
        public void callSound() {
            super.callSound();
        }

        @Override
        public void canFly() {
            super.callSound();
        }
    }

    private class caterpillarState extends FlyWalkSpeackCollectionActivity implements SpeakableActivity, CanNotFlyActivity {

        public caterpillarState(SingHelper singHelper) {
            super(singHelper);

        }

        @Override
        public void callSound() {
            super.callSound();
        }

        @Override
        public void canFly() {
            System.out.println(Constant.I_CANT_FLY);
        }
    }
}
