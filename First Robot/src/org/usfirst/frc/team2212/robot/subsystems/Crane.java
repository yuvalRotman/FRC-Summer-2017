package org.usfirst.frc.team2212.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Crane extends Subsystem {
	private SpeedController craneMotor;
	private DigitalInput limitUp;
	private DigitalInput limitDown;

	public static final double CRANE_UP_SPEED = 0.5;
	public static final double CRANR_DOWN_SPEED = -0.3;
	
	

	public Crane(SpeedController craneMotor,DigitalInput up,DigitalInput down) {
		limitDown = down;
		limitUp = up;
		this.craneMotor = craneMotor;

	}

	public boolean canMove(double speedMoving) {
		if (limitUp.get()&&speedMoving >0) {
			return false;
		}
		else if (limitDown.get()&&speedMoving<0) {
			return false;
		}
		else
			return true;		
	}
	public void trymove(double speed) {
		if(canMove(speed))
		craneMotor.set(speed);

	}

	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
