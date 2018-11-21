package ru.ponomaryov.se;

public class AnimalType {
    protected double runRange;
    protected double jumpRange;
    protected double swimRange;


    public AnimalType() {
        runRange = 0.0D;
        jumpRange = 0.0D;
        swimRange = 0.0D;
    }

    public boolean doRun(double range) {
        return range < this.runRange ? true : false;
    }

    public boolean doJump(double height) {
        return height < jumpRange ? true : false;
    }

    public boolean doSwim(double range) {
        return range < swimRange ? true : false;
    }

    public void randomizeRange(double percent) {
        double a = 0.0D;
        if (percent > 100.0D) {
            percent = 100.0D;
        }
        if (percent < 0.0D) {
            percent = 0.0D;
        }
        a = runRange * percent / 100.0D;
        a *= Math.random();
        if (Math.random() > 0.5D) {
            runRange += a;
        } else {
            runRange -= a;
        }
        runRange = Math.round(runRange);
        a = jumpRange * percent / 100.0D;
        a *= Math.random();
        if (Math.random() > 0.5D) {
            jumpRange += a;
        } else {
            jumpRange -= a;
        }
        jumpRange = Math.round(jumpRange);
        a = swimRange * percent / 100.0D;
        a *= Math.random();
        if (Math.random() > 0.5D) {
            swimRange += a;
        } else {
            swimRange -= a;
        }
        swimRange = Math.round(swimRange);
    }

    public double getRunRange() {
        return this.runRange;
    }

    public double getJumpRange() {
        return this.jumpRange;
    }

    public double getSwimRange() {
        return this.swimRange;
    }

    protected String getName() {
        return "";
    }
}
