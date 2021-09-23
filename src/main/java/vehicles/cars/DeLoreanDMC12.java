package vehicles.cars;

import beepers.Beeper;
import beepers.MagicSparks;
import doors.Door;
import doors.DoubleVerticalDoors;
import engines.Engine;
import exceptions.InvalidFutureTravel;
import exceptions.InvalidWeightException;
import radios.BrokenRadio;
import radios.Radio;

public class DeLoreanDMC12 extends Car {

    private final double SPEED_TO_TRAVEL = 142;

    private boolean almanac;

    private Radio radio = new BrokenRadio();
    private Beeper beeper = new MagicSparks();
    private Door door = new DoubleVerticalDoors();

    public DeLoreanDMC12(Engine engine, int weight, boolean almanac) throws InvalidWeightException {
        super(engine, weight);

        this.almanac = almanac;
    }

    @Override
    public String openDoors(){
        return door.open();
    }

    /**
     * Beeper's sound
     * @return sound
     */
    public String checkBeeper(){
        return beeper.makeSound();
    }

    /**
     * Checks timeline. Broken if old Biff gives The Grays Sports Almanac to his
     * @return timline status
     */
    public String checkTimeline(){
        if(almanac){
            return "Ok!";
        }
        return "All right, Doc. What's going on? Where are we? When are we?";
    }

    /**
     * Radio
     * @return sound
     */
    public String turnOnRadio(){
        return radio.playMusic();
    }

    /**
     * Time trevel
     * @return Classic quote
     * @throws InvalidFutureTravel if speed to small
     */
    public String backToTheFuture() throws InvalidFutureTravel {
        if(super.moveForward() > SPEED_TO_TRAVEL){
            return "Where we're going, we don't need roads";
        }
        throw new InvalidFutureTravel();
    }
}

