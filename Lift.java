package org.usfirst.frc.team2506.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Lift {

	public static int Priority = 4;

	//constants for easy change of major values
	final int STANDARD_SPEED_UNIT, LIFT_INVERSION = 1;
	final int LIFT_SWITCH_BOTTOM, TALON_PORT = 2;
	final int LIFT_SWITCH_MIDDLE = 3;
	final int LIFT_SWITCH_TOP = 4;
	
	//integers to contain integral values
	int rightBumperCounter, leftBumperCounter, upCounter, middleCounter, downCounter, location;
	
	//double for precise height
	double height;
	
	
	//SmartDashboard object for display
	SmartDashboard display = new SmartDashboard();

	DigitalInput liftTop = new DigitalInput(LIFT_SWITCH_TOP);
	DigitalInput liftMiddle = new DigitalInput(LIFT_SWITCH_MIDDLE);
	DigitalInput liftBottom = new DigitalInput(LIFT_SWITCH_BOTTOM);
	Latch topTest = new Latch();
	Latch middleTest = new Latch();
	Latch bottomTest = new Latch();

	Talon liftTalon = new Talon(TALON_PORT);

	public void teleopLift(Button button) {
		Lift.Priority = button.Priority;

		switch(Lift.Priority) {
			case 1:
				stop();
				break;
			case 2:
				if (button.BtnType == ButtonType.RIGHT_BUMPER) {
					if (rightBumberCounter <= leftBumperCounter)
						analogUp();
				}
				else {
					rightBumperCounter = 0;
				}

				if (button.BtnType == ButtonType.LEFT_BUMPER) {
					if (leftBumperCounter <= rightBumperCounter)
						analogDown();
				}
				else {
					leftBumperCounter = 0;
				}

				leftBumperCounter--;
				rightBumperCounter--;
				break;
			case 3:
				if (topTest.latch(true) && (button.BtnType == ButtonType.TOP)
					upCounter = 0;
				if (bottomTest.latch(Down))
					downCounter = 0;
				if (middleTest.latch(Middle))
					
