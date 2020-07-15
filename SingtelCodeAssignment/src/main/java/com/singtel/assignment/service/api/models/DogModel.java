package com.singtel.assignment.service.api.models;

import com.singtel.assignment.service.api.enmus.SoundSupportEnum;
import com.singtel.assignment.service.api.support.SingHelper;

public class DogModel extends WalkSpeackCollectionActivity {
    public DogModel() {
        super((new SingHelper(SoundSupportEnum.DOG)));
    }

    public DogModel(SingHelper singHelper) {
        super(singHelper);
    }
}
