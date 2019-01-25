/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.TankDrive;

public class TankDrive_MoveAndTurn extends Command {
  private TankDrive tankDrive;
  private OI oi;
  public TankDrive_MoveAndTurn(TankDrive tankDrive, OI oi) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    this.tankDrive = tankDrive;
    this.oi = oi;
    requires(tankDrive);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    tankDrive.DriveAndTurn(oi.getY(), oi.getX());
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
