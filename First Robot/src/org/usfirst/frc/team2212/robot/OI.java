package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.robot.commands.Feed;
import org.usfirst.frc.team2212.robot.commands.MoveCrane;
import org.usfirst.frc.team2212.robot.subsystems.Crane;
import org.usfirst.frc.team2212.robot.subsystems.Feeder;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI/* gevald */ {
	 //יש לעדכן כפתור לפעולת האיסוף
	Joystick joystickLeft;
	Joystick joystickRight;
	 
	
	
	public OI() {
		 joystickLeft = new Joystick(1);
		 joystickRight = new Joystick(0);
		
		JoystickButton craneUpButton = new JoystickButton(joystickRight, 2);
		JoystickButton craneDownButton = new JoystickButton(joystickRight, 3);
		JoystickButton shootButton = new JoystickButton(joystickRight, 1);
		JoystickButton FeedButton = new JoystickButton(joystickRight, 4);
		
		craneUpButton.whenPressed(new MoveCrane(Crane.CRANE_UP_SPEED));
		craneDownButton.whenPressed(new MoveCrane(Crane.CRANR_DOWN_SPEED));
		shootButton.whileHeld(new Feed(Feeder.FEEDER_SPEED));
		
	}


	public double getJoystickRight() {
		return joystickLeft.getY();
	}


	public double getJoystickLeft() {
		return joystickRight.getY();
	}
	
	
	

}
