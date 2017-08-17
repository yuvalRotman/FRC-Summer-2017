package org.usfirst.frc.team2212.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Feeder extends Subsystem {
	private SpeedController feederMotor;
	public static final double FEEDER_SPEED = 0.5;

	public Feeder(SpeedController feederMotor) {
		this.feederMotor = feederMotor;
	}

	public void Feed(double feederSpeed) {
		feederMotor.set(feederSpeed);

	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
