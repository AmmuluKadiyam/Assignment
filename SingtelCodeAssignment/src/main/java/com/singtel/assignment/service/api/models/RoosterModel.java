package com.singtel.assignment.service.api.models;

import com.singtel.assignment.service.api.enmus.LanguageSupportEnum;
import com.singtel.assignment.service.api.enmus.SoundSupportEnum;
import com.singtel.assignment.service.api.support.LanguageHelper;
import com.singtel.assignment.service.api.support.SingHelper;

public class RoosterModel extends ChickenModel {
    LanguageHelper languageHelper;
    SingHelper singHelper;
    LanguageSupportEnum languageEnums;

    public RoosterModel() {
        this.singHelper = new SingHelper(SoundSupportEnum.ROOSTER);
    }

    public RoosterModel(LanguageSupportEnum languageEnums) {
        this.singHelper = new SingHelper(SoundSupportEnum.ROOSTER);
        this.languageEnums = languageEnums;
    }

    @Override
    public void canFly() {
        super.canFly();
    }

    @Override
    public void callSound() {
        String translate = LanguageHelper.translate(SoundSupportEnum.ROOSTER.getSound(), languageEnums);
        System.out.println(translate);

    }
}
