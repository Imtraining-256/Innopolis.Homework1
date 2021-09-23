package vehicles.trucks;

import engines.Engine;
import exceptions.InvalidWeightException;
import radios.Radio;

public class TeslaTruck extends Truck {

    private Radio radio;

    /**
     * {@inheritDoc}
     * @param engine
     * @param weight
     * @throws InvalidWeightException
     */
    public TeslaTruck(Engine engine, int weight, Radio radio) throws InvalidWeightException {
        super(engine, weight);

        this.radio = radio;
    }

    /**
     * Play Music
     * @return sound
     */
    public String turnOnRadio(){
        return radio.playMusic();
    }
}
