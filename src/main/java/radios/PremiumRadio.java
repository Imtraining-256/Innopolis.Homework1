package radios;

// TODO: отформатируй код пж и в других файлах тоже
public class PremiumRadio implements Radio{

    private boolean powerStatus;

    @Override
    public String playMusic() {
        return !powerStatus ? "Turn on radio, please" : "Never gonna give you up Never gonna let you down";
    }

    public boolean checkPowerStatus() {
        return powerStatus;
    }

    public String switchPower(boolean power) {
        if(!powerStatus){
            powerStatus = true;
            return playMusic();
        }
        else {
            powerStatus = false;
            return "Radio off";
        }
    }
}
