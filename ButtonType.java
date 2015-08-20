package org.usfirst.frc.team2506.robot;

public enum ButtonType {
	TO_UP(2);
	TO_DOWN(3);
	TO_MIDDLE(4);
	LEFT_BUMPER(5);
	RIGHT_BUMPER(6);
	STOP(7);

	int type;
	Button(int t) {
		type = t;
	}

	int getType() {
		return type;
	}
}

public class Button {
	public ButtonType BtnType { get; private set; }
	public int Priority { get; private set; }

	public Button(ButtonType type, int priority) {
		this.BtnType = type;
		this.Priority = priority;
	}
} 
