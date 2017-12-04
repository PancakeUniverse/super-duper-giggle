package org.usfirst.frc.team2335.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI 
{
	Joystick joystick;
	
	JoystickButton climbButton;
	
	public OI()
	{
		joystick = new Joystick(Robot.JOYSTICK);
		climbButton = new JoystickButton(joystick, Robot.CLIMB);
	}
	
	public double getAxis(int axis)
	{
		return joystick.getRawAxis(axis);
	}
}
