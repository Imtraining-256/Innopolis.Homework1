package vehicles;

import engines.Engine;
import exceptions.InvalidWeightException;

/**
 * Abstract Vehicle
 */
public abstract class Vehicle {

    private Engine engine;
    private int weight;
    private int speed;

    private final int SPEED_INDEX = 1200;

    /**
     * @param engine vehicle engine
     * @param weight vehicle weight in kg
     * @throws InvalidWeightException throws if weight <= 0;
     */
    public Vehicle(Engine engine, int weight) throws InvalidWeightException {
        this.engine = engine;
        setWeight(weight);

        calculateSpeed(this.engine, this.weight);
    }

    /**
     * Vehicle speed
     * @return speed km/h
     */
    public double moveForward(){
        return speed;
    }

    private void calculateSpeed(Engine engine, int weight) {
        this.speed = engine.releasePower() * SPEED_INDEX / weight;
    }

    private void setWeight(int weight) throws InvalidWeightException {

        if(weight <= 0) {
           throw new InvalidWeightException();
        }

        this.weight = weight;
    }
}
