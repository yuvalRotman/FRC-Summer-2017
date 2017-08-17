package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.robot.commands.Feed;
import org.usfirst.frc.team2212.robot.commands.MoveCrane;
import org.usfirst.frc.team2212.robot.subsystems.Crane;
import org.usfirst.frc.team2212.robot.subsystems.Feeder;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI/* gevald */ {
	 Joystick JRight = new Joystick(0);
	JoystickButton craneUpButton = new JoystickButton(JRight, 2);
	JoystickButton craneDownButton = new JoystickButton(JRight, 3);
	JoystickButton shootButton = new JoystickButton(JRight, 1);
	JoystickButton FeedButton = new JoystickButton(JRight, 4);//יש לעדכן כפתור לפעולת האיסוף
	
	 Joystick JLeft = new Joystick(1);
	
	
	public OI() {
		craneUpButton.whenPressed(new MoveCrane(Crane.CRANE_UP_SPEED));
		craneDownButton.whenPressed(new MoveCrane(Crane.CRANR_DOWN_SPEED));
		shootButton.whileHeld(new Feed(Feeder.FEEDER_SPEED));
		
	}


	public double getJRight() {
		return JLeft.getY();
	}


	public double getJLeft() {
		return JRight.getY();
	}
	
	
	

}
