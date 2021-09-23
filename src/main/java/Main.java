import engines.DieselEngine;
import engines.ElectroEngine;
import engines.Engine;
import engines.PetrolEngine;
import exceptions.InvalidFutureTravel;
import exceptions.InvalidWeightException;
import radios.BrokenRadio;
import radios.PremiumRadio;
import radios.Radio;
import vehicles.Vehicle;
import vehicles.cars.DeLoreanDMC12;
import vehicles.cars.SUX6000;
import vehicles.motos.Ninja1000;
import vehicles.trucks.TeslaTruck;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Engine motoEngine = new PetrolEngine();
        Engine truckEngine = new ElectroEngine();
        Engine carEngine = new DieselEngine();

        PremiumRadio premiumRadioForTesla = new PremiumRadio();
        premiumRadioForTesla.switchPower(true);

        BrokenRadio brokenRadio = new BrokenRadio();
        PremiumRadio premiumRadioForSUX = new PremiumRadio();


        try {
            var ninja = new Ninja1000(motoEngine, 100);
            var tesla = new TeslaTruck(truckEngine, 2000, premiumRadioForTesla);
            var dmc12 = new DeLoreanDMC12(carEngine,1200, false);
            var sux = new SUX6000(carEngine, 1500, premiumRadioForSUX);

            var vehicles = new ArrayList<Vehicle>();
            vehicles.add(ninja);
            vehicles.add(tesla);
            vehicles.add(dmc12);
            vehicles.add(sux);

            for (int i = 0; i < vehicles.size(); i++){
                System.out.println(vehicles.get(i).moveForward());
            }

            System.out.println(tesla.carryCargo());
            System.out.println(tesla.turnOnRadio());
            System.out.println(tesla.checkHorn());
            System.out.println(tesla.openDoors());

            System.out.println(dmc12.backToTheFuture());
            System.out.println(dmc12.checkTimeline());
            System.out.println(dmc12.turnOnRadio());

            sux.turnOnRadio();
            System.out.println(sux.turnOnRadio());
            System.out.println(sux.openDoors());

        } catch (InvalidWeightException e) {
            System.out.println(e.getMessage());
        } catch (InvalidFutureTravel e) {
            System.out.println(e.getMessage());
        }
    }
}
