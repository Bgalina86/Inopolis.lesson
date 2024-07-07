package Homework9_IntermediateCertification.Task2WateringACactus;

import java.util.Random;

public class HumiditySensorImpl implements HumiditySensor {

    int humiditySensor;

    @Override
    public int getHumiditySensor() {
        return makeHumiditySensor(humiditySensor);
    }

    @Override
    public int makeHumiditySensor(int humiditySensor) {
        Random random = new Random();
        humiditySensor = 5 + random.nextInt(96);
        System.out.println("Влажность: " + humiditySensor);
        return humiditySensor;
    }
}
