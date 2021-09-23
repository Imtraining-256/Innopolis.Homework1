package vehicles.motos;

import engines.Engine;
import exceptions.InvalidWeightException;
import vehicles.Vehicle;

public abstract class Motorcycle extends Vehicle {

    private final double SPEED_MULTIPLIER = 0.3;

    /**
     * {@inheritDoc}
     */
    public Motorcycle(Engine engine, int weight) throws InvalidWeightException {
        super(engine, weight);
    }

    /**
     * Calc moto speed
     * @return standard speed * multiplier
     */
    @Override
    public double moveForward(){
        return super.moveForward() * SPEED_MULTIPLIER;
    }
}
