package org.usfirst.frc.team2212.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	private Gearbox right, left;
	public static final double DRIVE_FORWARD_HIGH_SPEED = 1;
	public static final double DRIVE_REVERS_HIGH_SPEED = -1;
	public static final double DRIVE_FORWARD_LOW_SPEED = 0.5;
	public static final double DRIVE_REVERS_LOW_SPEED = -0.5;
	public DriveTrain(Gearbox right, Gearbox left) {
		this.right = right;
		this.left = left;

	}

	public void drive(double speedGearboxLeft, double speedGearboxRight) {

		left.setSpeed(speedGearboxLeft);
		right.setSpeed(speedGearboxRight);

	}

	public void stopMoving() {
		left.stopGearbox();
		right.stopGearbox();

	}

	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new org.usfirst.frc.team2212.robot.commands.drive());
	}
}
