package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.DemandType;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import frc.robot.util.Constants;

public class AngledElevator extends SubsystemBase {
    private static AngledElevator instance;
    private double desiredPosition;
    private TalonFX master;
    private TalonFX follower;
    private DigitalInput limitSwitch;

    /**
     * =========================================================
     * Create two TalonFX motors and a DigitalInput limit switch.
     * Instantiate master and follower using ids set in RobotMap
     * Instantiate the limit switch using its id from RobotMap
     * Call initElevator
     * =========================================================
     */
    private AngledElevator()
    {
        master = new TalonFX(RobotMap.AngledElevator.MASTER_ID);
        follower = new TalonFX(RobotMap.AngledElevator.FOLLOWER_ID);
        limitSwitch = new DigitalInput(RobotMap.AngledElevator.LIMIT_SWITCH_ID);
        initElevator();
    }

    /**
     * ===============================================
     * Make the follower motor follow the master motor
     * ===============================================
     */
    private void initElevator() {
        follower.follow(master);
        /**
         * =========================================================
         * IGNORE EVERYTHING PAST THIS LINE TO THE END OF THE METHOD
         * =========================================================
         */
        master.config_kP(Constants.SLOT_INDEX, RobotMap.AngledElevator.kP);

        master.configForwardSoftLimitEnable(true);
        master.configReverseSoftLimitEnable(true);
        master.configForwardSoftLimitThreshold(RobotMap.AngledElevator.FORWARD_LIMIT);
        master.configReverseSoftLimitThreshold(RobotMap.AngledElevator.REVERSE_LIMIT);
        
        master.overrideSoftLimitsEnable(true);

        master.configMotionCruiseVelocity(RobotMap.AngledElevator.CRUISE_VELOCITY);
        master.configMotionAcceleration(RobotMap.AngledElevator.CRUISE_ACCELERATION);

        master.configClosedloopRamp(RobotMap.AngledElevator.RAMP_TIME);
    }

    /**
     * moves the Elevator to some desired position
     * @param   desiredPosition
     * @return  set the master motor using MotionMagic 
     */
    public void moveToPosition(double desiredPosition) {
        master.set(ControlMode.MotionMagic, desiredPosition, DemandType.ArbitraryFeedForward, RobotMap.AngledElevator.kG);
    }

    /**
     * ==================================================
     * Setter (Mutator) for the desired position variable
     * ==================================================
     * 
     * @param   position (double)
     * @return  set the desired position to some position
     */
    public void setDesiredPosition(double position)
    {
        desiredPosition = position;
    }

    /**
     * ===================================================
     * Getter (Accessor) for the desired position variable
     * ===================================================
     * @return  desired position (double)
     */
    public double getDesiredPosition()
    {
        return desiredPosition;
    }

    /**
     * ==============================================================================================================================
     * check whether the absolute value of the desired position minus the current position is less than the max error of the elevator
     * the max error is 
     * ==============================================================================================================================
     * 
     * @param   desiredposition 
     * @return  a boolean
     */
    public boolean lessThanMaxError(double desiredPosition)
    {
        return Math.abs(desiredPosition - instance.getCurrentPosition()) < RobotMap.AngledElevator.MAX_ERROR;
    }

    /**
     * ======================================================================
     * Getter (Accessor) for the current encoder position of the master motor
     * ======================================================================
     * @return  get the selected encoder position of the master motor
     */
    public double getCurrentPosition()
    {
        return master.getSelectedSensorPosition();
    }

    /** Small Functions Below
     * =========================================================================
     * 1. Set elevator power using percent output (hint: its a type of ControlMode)
     * 
     * 2. Set the sensor position of the two internal encoders to be 0
     * 
     * 3. Return a boolean of whether limit switch is on or off
     * =========================================================================
     */

    /**
     * if power is 0, disable the motor
     * @param   power
     * @return  power to the motors using PercentOutput (constant); extends / retracts motors
     */
    public void setElevatorPower(double power)
    {
        if (power == 0)
        {
            master.neutralOutput();
        }
        else
        {
            master.set(ControlMode.PercentOutput, power);
        }
    }

    /**
     * @return  resetted encoders (set postion of the encoders to zero)
     */
    public void setEncoderPositionToZero()
    {
        master.setSelectedSensorPosition(0);
    }

    /**
     * @return  whether elevator is at ground level (at the bottom)
     */
    public boolean elevatorAtGroundLevel()
    {
        return ! limitSwitch.get();
    }

    /**
     * @return  if the elevator is extended to the max
     */
    public boolean elevatorExtendedToMax()
    {
        return getCurrentPosition() > RobotMap.AngledElevator.FORWARD_LIMIT;
    }


    /**
     * ==============
     * Singleton Code
     * ==============
     */
    public static AngledElevator getInstance() 
    {
        if (instance == null) 
        {
            instance = new AngledElevator();
        }
        return instance;
    }
}
