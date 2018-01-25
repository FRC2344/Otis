package org.usfirst.frc.team2344.robot.subsystems;

import org.usfirst.frc.team2344.robot.RobotMap;
import org.usfirst.frc.team2344.robot.commands.DriveCommand;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {
	//Talons & Solenoids
	private TalonSRX leftMaster, leftFrontSlave, leftRearSlave, rightMaster, rightFrontSlave, rightRearSlave;

	
	
	
	public DriveSubsystem() {
		//Initialization & Setup to the ID on RobotMap
		leftMaster = new TalonSRX(RobotMap.DRIVE_LEFT_MASTER_CANID);
		leftFrontSlave = new TalonSRX(RobotMap.DRIVE_LEFT_SLAVE_FRONT_CANID);
		leftRearSlave = new TalonSRX(RobotMap.DRIVE_LEFT_SLAVE_REAR_CANID);
		
		rightMaster = new TalonSRX(RobotMap.DRIVE_RIGHT_MASTER_CANID);
		rightFrontSlave = new TalonSRX(RobotMap.DRIVE_RIGHT_SLAVE_FRONT_CANID);
		rightRearSlave = new TalonSRX(RobotMap.DRIVE_RIGHT_SLAVE_REAR_CANID);
		
	
		
		//Setting the Talon's to follow the Master
		leftFrontSlave.follow(leftMaster);
		leftRearSlave.follow(leftMaster);
		rightFrontSlave.follow(rightMaster);
		rightRearSlave.follow(rightMaster);
		
		/*
		 * Since we have electrically inverted the motors, there is no need to invert them via code
		 * However, if we do ever get into the case.. the way to set it would be here:
		 * leftFrontSlave.setInverted(true);
		 * 
		 */
	}
	
	public void tankDrive(Joystick joy) {
		/*
		 * Axis 1 = Left Joystick going in a Y axis
		 * Axis 3 = Right Joystick going in a Y axis
		 */
		leftMaster.set(ControlMode.PercentOutput, joy.getRawAxis(3));
		rightMaster.set(ControlMode.PercentOutput, joy.getRawAxis(1));
		
		
	}
	
	
	
	
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new DriveCommand());
	}

}
