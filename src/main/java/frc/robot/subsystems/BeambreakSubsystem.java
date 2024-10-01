// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BeambreakSubsystem extends SubsystemBase {
  /** Creates a new BeambreakSubsystem. */
  private DigitalInput beamBreak;
  public BeambreakSubsystem() {
    beamBreak = new DigitalInput(0);
  }
  /**
   * returns true when object is detected
   */
  public boolean getBeambreak() {
    return !beamBreak.get();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putBoolean("Is Beambreak detecting sth?", getBeambreak());
  }
}
