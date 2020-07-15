package com.singtel.assignment.service.api.support;

import com.singtel.assignment.service.api.enmus.SoundSupportEnum;

public class SingHelper {
    private SoundSupportEnum soundSupportEnums;

    public SingHelper(SoundSupportEnum soundEnums) {
        this.soundSupportEnums = soundEnums;
    }

    public void makeSound() {
        System.out.println(soundSupportEnums.getSound());
    }
}
