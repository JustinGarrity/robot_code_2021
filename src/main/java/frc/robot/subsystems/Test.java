// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.util.Map;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Solenoid;

//Shuffle Imports
import edu.wpi.first.networktables.NetworkTableEntry;
//import edu.wpi.first.wpilibj.Solenoid;
//import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
//Command system imports
import edu.wpi.first.wpilibj2.command.CommandBase;




public class Test extends CommandBase{
 
  private WPI_TalonSRX talonMotor1 = new WPI_TalonSRX(1);
  private NetworkTableEntry motor1;


  public Test() {
    
    motor1 = Shuffleboard.getTab("Test")
      .add("Stuff" , 1)
      .withWidget(BuiltInWidgets.kNumberSlider)
      .withSize(2,1)
      .withPosition(0,0)
      .getEntry();

    
  }

  public void setForward(){

    talonMotor1.set(ControlMode.PercentOutput, motor1.getValue().getDouble()); 
    
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
