package com.example.alexandriauniversityapplication;

public class CreditHoursModal {
    private int max_required;
    private int finished;
    private int current;
    private int remaining;
    public void remaining_hours(int max, int finished, int current) {

        int remaining= max- finished -current;
    }

    public int getMax_required() {
        return max_required;
    }
    public void setMax_required(int max_required) {
        this.max_required = max_required;
    }
    public int getFinished() {
        return finished;
    }
    public void setFinished(int finished) {
        this.finished = finished;
    }
    public int getCurrent() {
        return current;
    }
    public void setCurrent(int current) {
        this.current = current;
    }
    public int getRemaining() {
        return remaining;
    }
    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

}
