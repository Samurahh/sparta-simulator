package com.sparta.model;

import com.sparta.configuration.Settings;

import java.util.Collection;

public class Bootcamp extends Centre {

    private static int count;

    static{
        count = 0;
    }

    public Bootcamp() {
        super(Settings.CENTRE_CAPACITY_BOOTCAMP.getValue(), Settings.CENTRE_GRACE_PERIOD_BOOTCAMP.getValue());
        count++;
    }

    public static int getCentreCount(){
        return count;
    }

    @Override
    public Collection<? extends Trainee> getTraineesByCourseType(CourseType courseType) {
        return super.getTraineesList();
    }
}