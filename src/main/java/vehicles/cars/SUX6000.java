package vehicles.cars;

import engines.Engine;
import exceptions.InvalidWeightException;
import radios.Radio;

public class SUX6000 extends Car {

    private Radio radio;

    public SUX6000(Engine engine, int weight, Radio radio) throws InvalidWeightException {
        super(engine, weight);

        this.radio = radio;
    }

    /**
     * Radio sound
     * @return music
     */
    public String turnOnRadio(){
        return radio.playMusic();
    }
}
