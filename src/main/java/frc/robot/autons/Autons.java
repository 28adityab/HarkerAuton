package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.claw.CloseClaw;
import frc.robot.commands.elevator.ZeroElevator;
import frc.robot.autons.Trajectories;

public class Autons 
{
    public static final SequentialCommandGroup path1 = new SequentialCommandGroup(
        CommandGroups.getFullZeroCommand(),
        CommandGroups.getFullShootCommand(),
        new SwervePositionController(Trajectories.startToOne, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullIntakeCommand()),
        new SwervePositionController(Trajectories.oneToTwo, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullShootCommand()),
        new SwervePositionController(Trajectories.twoToThree, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullIntakeCommand()),
        new SwervePositionController(Trajectories.threeToFour, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullShootCommand()),
        new SwervePositionController(Trajectories.fourToFive, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullIntakeCommand()),
        new SwervePositionController(Trajectories.fiveToSix, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullShootCommand()),
        new SwervePositionController(Trajectories.sixToSeven, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullIntakeCommand()),
        new SwervePositionController(Trajectories.sevenToEight, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullShootCommand()),
        new SwervePositionController(Trajectories.eightToNine, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullIntakeCommand()),
        new SwervePositionController(Trajectories.nineToTen, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullShootCommand()),
        new SwervePositionController(Trajectories.tenToEleven, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullIntakeCommand()),
        new SwervePositionController(Trajectories.elevenToTwelve, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullIntakeCommand()),
        new SwervePositionController(Trajectories.twelveToThirteen, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullIntakeCommand()),
        new SwervePositionController(Trajectories.thirteenToFourteen, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullShootCommand()),
        new SwervePositionController(Trajectories.fourteenToFifteen, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullIntakeCommand()),
        new SwervePositionController(Trajectories.fifteenToSixteen, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullIntakeCommand()),
        new SwervePositionController(Trajectories.sixteenToSeventeen, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullIntakeCommand()),
        new SwervePositionController(Trajectories.seventeenToEnd, () -> Rotation2d.fromDegrees(180), false).alongWith(CommandGroups.getFullShootCommand())
    );
}
