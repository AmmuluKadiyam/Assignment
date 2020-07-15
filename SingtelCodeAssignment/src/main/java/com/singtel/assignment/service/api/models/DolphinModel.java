package com.singtel.assignment.service.api.models;

import com.singtel.assignment.service.api.activities.SwimActivity;
import com.singtel.assignment.service.api.utils.Constant;

public class DolphinModel extends AnimalModel implements SwimActivity {
    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
