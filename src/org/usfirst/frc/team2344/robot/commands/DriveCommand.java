package org.usfirst.frc.team2344.robot.commands;

import org.usfirst.frc.team2344.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveCommand extends Command{
	public DriveCommand() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.kDrive);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.kDrive.tankDrive(Robot.m_oi.getDriverJoystick());
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return true;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
