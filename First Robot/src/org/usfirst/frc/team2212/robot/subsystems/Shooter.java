package org.usfirst.frc.team2212.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	private SpeedController shooterDrum;
	public static final double SHOOTER_DRUME_SPEED = 0.5;

	public Shooter(SpeedController shooterDrume) {
		this.shooterDrum = shooterDrume;

	}

	public void shoot(double speed) {
		shooterDrum.set(speed);

	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
