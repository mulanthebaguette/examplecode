// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.hal.DigitalGlitchFilterJNI;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Feeder extends SubsystemBase {
  /** Creates a new Feeder2. */
  DigitalInput input;
  VictorSPX feederMotor;

  public Feeder() {
    input = new DigitalInput(0);
    feederMotor = new VictorSPX(0);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public boolean getValue(){
    return input.get();

  }

  public void moveFeeder(double speed){
    feederMotor.set(VictorSPXControlMode.PercentOutput, speed);

  }

}


