package com.singtel.assignment.service.api.support;

import com.singtel.assignment.service.api.enmus.LanguageSupportEnum;
import com.singtel.assignment.service.api.enmus.SoundSupportEnum;

public class LanguageHelper {

    public static String translate(String sound, LanguageSupportEnum translateTo) {

        if (translateTo == null || !sound.equals(SoundSupportEnum.ROOSTER.getSound())) {
            System.out.println("Invalid Sound: " + sound);
            return sound;
        }

        switch (translateTo) {
            case DANISH:
                return LanguageSupportEnum.DANISH.getLanguage();
            case DUTCH:
                return LanguageSupportEnum.DUTCH.getLanguage();
            case FINNISH:
                return LanguageSupportEnum.FINNISH.getLanguage();
            case FRENCH:
                return LanguageSupportEnum.FRENCH.getLanguage();
            case GERMAN:
                return LanguageSupportEnum.GERMAN.getLanguage();
            case GREEK:
                return LanguageSupportEnum.GREEK.getLanguage();
            case HEBREW:
                return LanguageSupportEnum.HEBREW.getLanguage();
            case HUNGARIAN:
                return LanguageSupportEnum.HUNGARIAN.getLanguage();
            case ITALIAN:
                return LanguageSupportEnum.ITALIAN.getLanguage();
            case JAPANESE:
                return LanguageSupportEnum.JAPANESE.getLanguage();
            case PORTUGUESE:
                return LanguageSupportEnum.PORTUGUESE.getLanguage();
            case RUSSIAN:
                return LanguageSupportEnum.RUSSIAN.getLanguage();
            case SWEDISH:
                return LanguageSupportEnum.SWEDISH.getLanguage();
            case TURKISH:
                return LanguageSupportEnum.TURKISH.getLanguage();
            case URDU:
                return LanguageSupportEnum.URDU.getLanguage();
            default:
                System.out.println("Unable to translate to: " + translateTo);
                return sound;
        }

    }
}
