package vehicles.trucks;

import beepers.Beeper;
import beepers.Horn;
import doors.Door;
import doors.FourDoors;
import engines.Engine;
import exceptions.InvalidWeightException;
import vehicles.Vehicle;

public abstract class Truck extends Vehicle {

    private Door door = new FourDoors();
    private Beeper horn  = new Horn();

    /**
     * {@inheritDoc}
     */
    public Truck(Engine engine, int weight) throws InvalidWeightException {
        super(engine, weight);
    }

    /**
     * Carry cargo
     * @return "Carry"
     */
    public String carryCargo(){
        return "Carry";
    }

    /**
     * Horn sound
     * @return sound
     */
    public String checkHorn(){
        return horn.makeSound();
    }

    /**
     * Doors sound
     * @return sound
     */
    public String openDoors(){
        return door.open();
    }
}
