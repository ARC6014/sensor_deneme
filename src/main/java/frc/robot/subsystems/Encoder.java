// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.EncoderConstants;

public class Encoder extends SubsystemBase {
  /** Creates a new Encoder. */
  private final DutyCycleEncoder mBoreEncoder1 = new DutyCycleEncoder(EncoderConstants.BORE_ID1);
  private final DutyCycleEncoder mBoreEncoder2 = new DutyCycleEncoder(EncoderConstants.BORE_ID2);
  private final DutyCycleEncoder mBoreEncoder3 = new DutyCycleEncoder(EncoderConstants.BORE_ID3);
  private final DutyCycleEncoder mBoreEncoder4 = new DutyCycleEncoder(EncoderConstants.BORE_ID4);
  
  public Encoder() {
  }

  public boolean isBoreEncoder1Alive() {
    return mBoreEncoder1.isConnected();
  }
  public boolean isBoreEncoder2Alive() {
    return mBoreEncoder2.isConnected();
  }
  public boolean isBoreEncoder3Alive() {
    return mBoreEncoder3.isConnected();
  }
  public boolean isBoreEncoder4Alive() {
    return mBoreEncoder4.isConnected();
  }

  public double getBorePosition1(){
    return mBoreEncoder1.getAbsolutePosition();
  }
  public double getBorePosition2(){
    return mBoreEncoder2.getAbsolutePosition();
  }
  public double getBorePosition3(){
    return mBoreEncoder3.getAbsolutePosition();
  }
  public double getBorePosition4(){
    return mBoreEncoder4.getAbsolutePosition();
  }

  @Override
  public void periodic() {
    SmartDashboard.putBoolean("Is Bore Encoder 1 Alive?", isBoreEncoder1Alive());
    SmartDashboard.putNumber("Bore Position 1", getBorePosition1());
    SmartDashboard.putBoolean("Is Bore Encoder 2 Alive?", isBoreEncoder2Alive());
    SmartDashboard.putNumber("Bore Position 2", getBorePosition2());
    SmartDashboard.putBoolean("Is Bore Encoder 3 Alive?", isBoreEncoder3Alive());
    SmartDashboard.putNumber("Bore Position 3", getBorePosition3());
    SmartDashboard.putBoolean("Is Bore Encoder 4 Alive?", isBoreEncoder4Alive());
    SmartDashboard.putNumber("Bore Position 4", getBorePosition4());
  }
}
