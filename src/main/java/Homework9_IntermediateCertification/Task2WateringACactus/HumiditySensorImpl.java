package Homework9_IntermediateCertification.Task2WateringACactus;

import java.util.Random;

public class HumiditySensorImpl implements HumiditySensor {

    int humiditySensor;
    @Override
    public int getHumiditySensor() {
        return humiditySensor;
    }

    @Override
    public int makeHumiditySensor(int humiditySensor) {
        Random random = new Random();
        humiditySensor = 15 + random.nextInt(86);
        return humiditySensor;
    }
}
