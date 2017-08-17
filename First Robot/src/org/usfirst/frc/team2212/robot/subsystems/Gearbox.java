package org.usfirst.frc.team2212.robot.subsystems;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Gearbox   {
	
	private SpeedController motorFront;
	private SpeedController motorBack;
	
	
	

	/**
	 * @param motorFront
	 * @param motorBack
	 */
	public Gearbox(SpeedController motorFront, SpeedController motorBack) {
		this.motorFront = motorFront;
		this.motorBack = motorBack;
	}

    public void setSpeed(double speed) {
    	motorBack.set(speed); 
    	motorFront.set(speed); 
    	
    }
    
    public void stopGearbox() {
		motorFront.stopMotor();
		motorBack.stopMotor();
	}



}
