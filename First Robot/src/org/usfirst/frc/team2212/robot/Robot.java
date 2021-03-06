
package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.robot.subsystems.Crane;
import org.usfirst.frc.team2212.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2212.robot.subsystems.Feeder;
import org.usfirst.frc.team2212.robot.subsystems.Gearbox;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot  extends IterativeRobot   {

	
	public static DriveTrain driveTrain;
	public static Crane crane;
	public static Feeder feeder;
	public static OI oi; 
	
	
	/**
	 * This function is run when the robot is first started up and should be used
	 * for any initialization code.
	 */
	@Override
	public void robotInit() {
        //RobotMap robotMap = new RobotMap();
		driveTrain = new DriveTrain(new Gearbox(new CANTalon(RobotMap.canTalon.MOTOR_FRONT_LEFT), new CANTalon(RobotMap.canTalon.MOTOR_BACK_LEFT)),new Gearbox(new CANTalon(RobotMap.canTalon.MOTOR_FRONT_RIGHT), new CANTalon(RobotMap.canTalon.MOTOR_BACK_RIGHT)));
		crane = new Crane(new VictorSP(RobotMap.PWM.CRANE_PIN), new DigitalInput(RobotMap.DIO.LIMIT_SWICH_UP),new DigitalInput(RobotMap.DIO.LIMIT_SWICH_DOWN));
		feeder = new Feeder(new VictorSP(RobotMap.PWM.FEEDER_PIN));
		
		OI oInterface= new OI();
		
	}

	/**
	 * This function is called once each time the robot enters Disabled mode. You
	 * can use it to reset any subsystem information you want to clear when the
	 * robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable chooser
	 * code works with the Java SmartDashboard. If you prefer the LabVIEW Dashboard,
	 * remove all of the chooser code and uncomment the getString code to get the
	 * auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons to
	 * the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
		 * switch(autoSelected) { case "My Auto": autonomousCommand = new
		 * MyAutoCommand(); break; case "Default Auto": default: autonomousCommand = new
		 * ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
