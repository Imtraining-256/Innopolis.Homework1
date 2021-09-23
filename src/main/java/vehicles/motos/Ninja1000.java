package vehicles.motos;

import engines.Engine;
import exceptions.InvalidWeightException;

public class Ninja1000 extends Motorcycle{

    /**
     * {@inheritDoc}
     * @param engine
     * @param weight
     * @throws InvalidWeightException
     */
    public Ninja1000(Engine engine, int weight) throws InvalidWeightException {
        super(engine, weight);
    }
}
