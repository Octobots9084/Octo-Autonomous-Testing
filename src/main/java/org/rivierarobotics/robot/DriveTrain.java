package org.rivierarobotics.robot;

public class DriveTrain {

    private final DriveSide left;
    private final DriveSide right;

    public DriveTrain() {
        left = new DriveSide(true);
        right = new DriveSide(false);

    }

    public void setPower(double l, double r) {
        left.setPower(l);
        right.setPower(r);
    }

}
