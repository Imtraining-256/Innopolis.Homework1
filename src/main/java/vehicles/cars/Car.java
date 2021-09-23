package vehicles.cars;

import doors.Door;
import doors.DoubleDoors;
import engines.Engine;
import exceptions.InvalidWeightException;
import vehicles.Vehicle;

public abstract class Car extends Vehicle {

    private Door door = new DoubleDoors();

    /**
     * {@inheritDoc}
     */
    public Car(Engine engine, int weight) throws InvalidWeightException {
        super(engine, weight);
    }

    public String openDoors(){
       return door.open();
    }
}
