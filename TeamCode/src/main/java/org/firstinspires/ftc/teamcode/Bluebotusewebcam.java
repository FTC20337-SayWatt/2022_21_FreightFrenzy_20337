package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Bluebotusewebcam extends LinearOpMode {
    private DcMotor rightFront;
    private DcMotor leftFront;
    private DcMotor rightRear;
    private DcMotor leftRear;
    private DcMotor arm;
    private DcMotor grabber;
    float Hublevel;

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();

        while(opModeIsActive()) {
            rightFront.setPower(0.5);
            leftFront.setPower(-0.5);
            rightRear.setPower(0.5);
            leftRear.setPower(-0.5);
            Thread.sleep(500);

            if (Hublevel == 1) {
                arm.setPower(1);
                Thread.sleep(500);
                grabber.setPower(1);
            } else if (Hublevel == 2) {
                arm.setPower(1);
                Thread.sleep(500);
                grabber.setPower(1);
            } else if (Hublevel == 3) {
                arm.setPower(1);
                Thread.sleep(500);
                grabber.setPower(1);
            }
        }
    }
}