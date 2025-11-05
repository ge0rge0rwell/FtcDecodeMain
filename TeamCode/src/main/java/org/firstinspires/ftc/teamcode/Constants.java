package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Constants {


    public static class DriveTrainConstants{

        public static String FrontLeftName = "FrontLeftMotor";
        public static String FrontRightName = "FrontRightMotor";
        public static String BackLeftName = "BackLeftMotor";
        public static String BackRightName = "BackRightMotor";


        public static DcMotorSimple.Direction LeftFrontDirection = DcMotorSimple.Direction.FORWARD;
        public static DcMotorSimple.Direction LeftBackDirection = DcMotorSimple.Direction.FORWARD;
        public static DcMotorSimple.Direction RightFrontDirection = DcMotorSimple.Direction.REVERSE;
        public static DcMotorSimple.Direction RightBackDirection = DcMotorSimple.Direction.REVERSE;



    }
}
