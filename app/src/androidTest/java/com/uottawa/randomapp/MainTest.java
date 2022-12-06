package com.uottawa.randomapp;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

public class MainTest {
    @Rule
    ActivityScenarioRule<MainActivity> activityActivityScenarioRule=new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void test(){
        activityActivityScenarioRule.getScenario().onActivity(activity -> {

        });
    }
}
