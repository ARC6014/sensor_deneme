// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants.ServoConstants;

public class ServoMotor extends SubsystemBase {
  /** Creates a new Servo. */
  private final Servo motorServo = new Servo(ServoConstants.SERVO_ID);
  public ServoMotor() {
    setServo();
  }
  //SERVO_VALUE 0<x<1
  public void setServo(){
    motorServo.set(ServoConstants.SERVO_VALUE);
  }

  public double getServoValue(){
    return motorServo.get();
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Servo Position", getServoValue());
  }
}
