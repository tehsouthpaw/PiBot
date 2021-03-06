package com.bigreddoglabs.pibot;

import android.util.Log;

public class Controller {
	private final int FORWARD = 2;
	private final int STOP = 1;
	private final int BACK = 0;
	
	private int lMotorDirection;
	private int rMotorDirection;
	
	private int lMotorSpeed;
	private int rMotorSpeed;
	
	private final int minSpeed = 100;
	private final int maxSpeed = 255;
	
	private int camPan;
	private int camTilt;
	
	public Controller()
	{
		setlMotorDirection(STOP);
		setrMotorDirection(STOP);
		
		setlMotorSpeed(minSpeed);
		setrMotorSpeed(minSpeed);
		
		setCamPan(0);
		setCamTilt(0);
	}
	
	public int getlMotorDirection() {
		return lMotorDirection;
	}
	public void setlMotorDirection(int lMotorDirection) {
		this.lMotorDirection = lMotorDirection;
	}
	public int getrMotorDirection() {
		return rMotorDirection;
	}
	public void setrMotorDirection(int rMotorDirection) {
		this.rMotorDirection = rMotorDirection;
	}
	public int getlMotorSpeed() {
		return lMotorSpeed;
	}
	public void setlMotorSpeed(int lMotorSpeed) {
		if (lMotorSpeed >= minSpeed && lMotorSpeed <= maxSpeed)
			this.lMotorSpeed = lMotorSpeed;
	}
	public int getrMotorSpeed() {
		return rMotorSpeed;
	}
	public void setrMotorSpeed(int rMotorSpeed) {
		if (rMotorSpeed >= minSpeed && rMotorSpeed <= maxSpeed)
			this.rMotorSpeed = rMotorSpeed;
	}
	
	public void setMotorDirection(int x)
	{
		setlMotorDirection(x);
		setrMotorDirection(x);
	}
	
	public void setMotorSpeed(int x)
	{
		setlMotorSpeed(x);
		setrMotorSpeed(x);
	}
	
	public int getCamPan() {
		return camPan;
	}
	public void setCamPan(int camPan) {
		this.camPan = camPan;
	}
	public int getCamTilt() {
		return camTilt;
	}
	public void setCamTilt(int camTilt) {
		this.camTilt = camTilt;
	}
	
	public String toString()
	{
		return this.getlMotorDirection() + "," +
				this.getlMotorSpeed() + "," +
	    		   this.getrMotorDirection() + "," +
	    		   this.getrMotorSpeed() + "," +
	    		   this.getCamPan() + "," +
	    		   this.getCamTilt();
	}
	
	public boolean equals(Controller op)
	{
		String c1 = this.toString();
		String c2 = op.toString();
		return c1.equals(c2);
	}
	
	public void set(Controller op)
	{
		this.setCamPan(op.getCamPan());
		this.setCamTilt(op.getCamTilt());
		this.setlMotorDirection(op.getlMotorDirection());
		this.setrMotorDirection(op.getrMotorDirection());
		this.setlMotorSpeed(op.getlMotorSpeed());
		this.setrMotorSpeed(op.getrMotorSpeed());
	}
	
}
