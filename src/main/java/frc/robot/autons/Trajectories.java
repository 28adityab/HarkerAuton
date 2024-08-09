package frc.robot.autons;

import java.util.List;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.proto.Trajectory;

public class Trajectories {
    public static Trajectory startToOne = generateTrajectory(
        List.of
        (
            new Pose2d(1.41, 5.58, Rotation2d.fromDegrees(180)),
            new Pose2d(2.41, 7.04, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory oneToTwo = generateTrajectory(
        List.of
        (
            new Pose2d(2.41, 7.04, Rotation2d.fromDegrees(180)),
            new Pose2d(1.41, 5.58, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory twoToThree = generateTrajectory(
        List.of
        (
            new Pose2d(1.41, 5.58, Rotation2d.fromDegrees(180)),
            new Pose2d(2.60, 5.58, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory threeToFour = generateTrajectory
    (
        List.of
        (
            new Pose2d(2.60, 5.58, Rotation2d.fromDegrees(180)),
            new Pose2d(1.41, 5.58, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory fourToFive = generateTrajectory(
        List.of
        (
            new Pose2d(1.41, 5.58, Rotation2d.fromDegrees(180)),
            new Pose2d(2.60, 4.10, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory fiveToSix = generateTrajectory(
        List.of
        (
            new Pose2d(2.60, 4.10, Rotation2d.fromDegrees(180)),
            new Pose2d(1.41, 5.58, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory sixToSeven = generateTrajectory(
        List.of
        (
            new Pose2d(1.41, 5.58, Rotation2d.fromDegrees(180)),
            new Pose2d(1.41, 5.59, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory sevenToEight = generateTrajectory(
        List.of
        (
            new Pose2d(1.41, 5.59, Rotation2d.fromDegrees(180)),
            new Pose2d(1.41, 5.60, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory eightToNine = generateTrajectory(
        List.of
        (
            new Pose2d(1.41, 5.60, Rotation2d.fromDegrees(180)),
            new Pose2d(7.80, 7.44, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory nineToTen = generateTrajectory(
        List.of
        (
            new Pose2d(7.80, 7.44, Rotation2d.fromDegrees(180)),
            new Pose2d(1.41, 5.60, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory tenToEleven = generateTrajectory(
        List.of
        (
            new Pose2d(1.41, 5.60, Rotation2d.fromDegrees(180)),
            new Pose2d(5.30, 6.70, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory elevenToTwelve = generateTrajectory(
        List.of
        (
            new Pose2d(4.33, 6.29, Rotation2d.fromDegrees(180)),
            new Pose2d(7.80, 5.79, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory twelveToThirteen = generateTrajectory(
        List.of
        (
            new Pose2d(7.80, 5.79, Rotation2d.fromDegrees(180)),
            new Pose2d(5.30, 6.70, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory thirteenToFourteen = generateTrajectory(
        List.of
        (
            new Pose2d(4.33, 6.29, Rotation2d.fromDegrees(180)),
            new Pose2d(1.41, 5.58, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory fourteenToFifteen = generateTrajectory(
        List.of
        (
            new Pose2d(1.41, 5.58, Rotation2d.fromDegrees(180)),
            new Pose2d(4.50, 4.76, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory fifteenToSixteen = generateTrajectory(
        List.of
        (
            new Pose2d(4.50, 4.76, Rotation2d.fromDegrees(180)),
            new Pose2d(7.80, 2.48, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory sixteenToSeventeen = generateTrajectory(
        List.of
        (
            new Pose2d(7.80, 2.48, Rotation2d.fromDegrees(180)),
            new Pose2d(4.50, 4.76, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
    public static Trajectory seventeenToEnd = generateTrajectory(
        List.of
        (
            new Pose2d(4.50, 4.76, Rotation2d.fromDegrees(180)),
            new Pose2d(1.41, 5.58, Rotation2d.fromDegrees(180))
        ),
        2.0,
        1.0,
        0.0,
        0.0,
        true
    );
}
