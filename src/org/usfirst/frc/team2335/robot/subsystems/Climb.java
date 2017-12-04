package org.usfirst.frc.team2335.robot.subsystems;

import org.usfirst.frc.team2335.robot.Robot;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climb extends Subsystem {

    Victor climbMotor;
    
    
    
    public Climb()
    {
    	climbMotor = new Victor(Robot.CLIMB_MOTOR);
    	
    }
    	
    public void climber(double speed)
    {
    	climbMotor.set(speed);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

