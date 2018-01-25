/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2344.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    /*|-------------------------|*|
    |*| Autonomous Measurements |*|
    |*|-------------------------|*/

    //====== DRIVING DISTANCE & ROTATION ======//
    public static double
            DISTANCE_TO_AUTO_LINE = 120,
            DISTANCE_TO_SWITCH = 196,
            DISTANCE_TO_RIGHT_SCALE = 288,
            DISTANCE_TO_LEFT_SCALE_ONE = 261,
            ROTATION_TO_LEFT_SCALE_ONE = 90,
            DISTANCE_TO_LEFT_SCALE_TWO = 180,
            ROTATION_TO_LEFT_SCALE_TWO = -90,
            DISTANCE_TO_LEFT_SCALE_THREE = 71.97;

    //====== NEUTRAL HEIGHTS ======//
    public static double
            HEIGHT_OF_SCALE = 61.1, //57.6 + 3.5 inch of wall
            HEIGHT_OF_SWITCH = 20.75; //18.75 inch wall

    /*|---------------------------|*|
    |*| TeleOperated Measurements |*|
    |*|---------------------------|*/

    //====== CLIMBING MEASUREMENTS ======//
    public static double DISTANCE_FROM_RUNG_TO_PLATFORM = 80.5;

    /*|---------------------------|*|
    |*|     Other Information     |*|
    |*|---------------------------|*/

    //======= JOYSTICKS =======//
    public static int
            JOYSTICK_DRIVER_ID = 0,
            JOYSTICK_MANIPULATOR_ID = 1;

    //======= TALONS: DRIVE TRAIN =======//
    public static int
            DRIVE_LEFT_MASTER_CANID = 1,
            DRIVE_LEFT_SLAVE_FRONT_CANID = 2,
            DRIVE_LEFT_SLAVE_REAR_CANID = 3,
            DRIVE_RIGHT_MASTER_CANID = 7,
            DRIVE_RIGHT_SLAVE_FRONT_CANID = 5,
            DRIVE_RIGHT_SLAVE_REAR_CANID = 4;

    //======= TALONS: INTAKE SYSTEM =======//
    public static int
            INTAKE_LEFT_CANID = 7,
            INTAKE_RIGHT_CANID = 8;

    //======= TALONS: ELEVATOR SYSTEM =======//
    public static int
            ELEVATOR_PRIMARY_ONE_CANID = 9,
            ELEVATOR_PRIMARY_TWO_CANID = 10,
            ELEVATOR_PRIMARY_THREE_CANID = 11,
            ELEVATOR_PRIMARY_FOUR_CANID = 12,
            ELEVATOR_FIVE_CANID = 13,
            ELEVATOR_SIX_CAN_ID = 14;
    
    //======= PNEUMATICS =======//
    public static int
    		COMPRESSOR_ID = 0,
    		DRIVE_SHIFTGEAR_SID = 0;
}
