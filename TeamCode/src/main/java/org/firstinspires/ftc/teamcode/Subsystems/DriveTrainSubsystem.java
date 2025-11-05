package org.firstinspires.ftc.teamcode.Subsystems;


import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Constants;

public class DriveTrainSubsystem extends SubsystemBase {


    public static DcMotor FrontLeftMotor;
    public static DcMotor FrontRightMotor;
    public static DcMotor BackLeftMotor;
    public static DcMotor BackRightMotor;


    public DriveTrainSubsystem(HardwareMap hardwareMap){

        FrontLeftMotor = hardwareMap.get(DcMotor.class, Constants.DriveTrainConstants.FrontLeftName);
        BackLeftMotor = hardwareMap.get(DcMotor.class, Constants.DriveTrainConstants.BackLeftName);
        FrontRightMotor = hardwareMap.get(DcMotor.class, Constants.DriveTrainConstants.FrontRightName);
        BackRightMotor = hardwareMap.get(DcMotor.class, Constants.DriveTrainConstants.BackRightName);


        FrontRightMotor.setDirection(Constants.DriveTrainConstants.RightFrontDirection);
        FrontLeftMotor.setDirection(Constants.DriveTrainConstants.LeftFrontDirection);
        BackRightMotor.setDirection(Constants.DriveTrainConstants.RightBackDirection);
        BackLeftMotor.setDirection(Constants.DriveTrainConstants.LeftBackDirection);

    }
            public void FieldCentricDrive(double x, double y, double rx){
             double max;

             double FrontLeftPower = y +x +rx;
             }
            }




