package org.usfirst.frc.team2506.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public Lift roboLift = new Lift();

	public Joystick controller = new Joystick(0);

	public void robotInit() {
		//Do nothing
	}

	public void autonomousPeriod() {
		//Autonomous code here
	}

	public void teleopPeriodic() {
		for (ButtonType btn : ButtonType.values()) {
			if (controller.getRawButton(btn)) {
				roboLift.teleopLift(btn.getType());
			}
		}
	}
