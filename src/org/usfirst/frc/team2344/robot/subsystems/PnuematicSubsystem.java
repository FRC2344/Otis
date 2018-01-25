package org.usfirst.frc.team2344.robot.subsystems;

import org.usfirst.frc.team2344.robot.RobotMap;
import org.usfirst.frc.team2344.robot.commands.ShiftGearCommand;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PnuematicSubsystem extends Subsystem {
	private Solenoid shiftGear;
	
	public PnuematicSubsystem() {
		shiftGear = new Solenoid(RobotMap.DRIVE_SHIFTGEAR_SID);
	}
	
	public void shiftGear(boolean on) {
		shiftGear.set(on);
	}
	

	public void initDefaultCommand() {
		//none
		setDefaultCommand(new ShiftGearCommand());
	}
}
