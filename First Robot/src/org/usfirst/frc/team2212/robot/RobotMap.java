package org.usfirst.frc.team2212.robot;

import edu.wpi.first.wpilibj.Joystick;

public class RobotMap {
	
	public interface PWM{
		public static final int CRANE_PIN = 1;
		public static final int FEEDER_PIN = 6;
				
	}
	
	public interface DIO{
		public static final int LIMIT_SWICH_UP = 2;
		public static final int LIMIT_SWICH_DOWN = 6;
}
	public interface canTalon{
		public static final int MOTOR_FRONT_LEFT = 0;
		public static final int MOTOR_FRONT_RIGHT = 1;
		public static final int MOTOR_BACK_LEFT = 2;
		public static final int MOTOR_BACK_RIGHT = 3;
		
		
	}
}
