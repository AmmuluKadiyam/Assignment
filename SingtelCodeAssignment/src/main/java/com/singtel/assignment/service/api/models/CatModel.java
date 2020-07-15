package com.singtel.assignment.service.api.models;

import com.singtel.assignment.service.api.enmus.SoundSupportEnum;
import com.singtel.assignment.service.api.support.SingHelper;

public class CatModel extends WalkSpeackCollectionActivity {
    public CatModel() {
        super(new SingHelper(SoundSupportEnum.CAT));
    }

    public CatModel(SingHelper singHelper) {
        super(singHelper);
    }
}
