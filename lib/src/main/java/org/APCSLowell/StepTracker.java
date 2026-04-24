package org.APCSLowell;

public class StepTracker {
    private int minSteps, totalSteps;
        private int totalDays, actDays;
    public StepTracker(int activityThreshold) {
        minSteps=activityThreshold;
        totalSteps=0;
        totalDays=0;
        actDays=0;

    }
    void addDailySteps(int stepCount) {
        totalSteps+=stepCount;
        totalDays++;
        if(stepCount>=minSteps)
            actDays++;
    }
    int activeDays() {
        return actDays;
    }
    double averageSteps() {
        if(totalDays==0)
            return 0.0;
        else
            return (double)totalSteps/totalDays;
    }
}
