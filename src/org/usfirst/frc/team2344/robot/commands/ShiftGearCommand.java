package org.usfirst.frc.team2344.robot.commands;

import org.usfirst.frc.team2344.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShiftGearCommand extends Command{
	
	public ShiftGearCommand() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.kAir);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		while(Robot.m_oi.getDriverJoystick().getRawButton(5) == true) {
			Robot.kAir.shiftGear(true);
		}
			Robot.kAir.shiftGear(false);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.kAir.shiftGear(false);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		end();
	}
}

