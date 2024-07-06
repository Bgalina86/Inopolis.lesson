package Homework9_IntermediateCertification.Task2WateringACactus;

import java.util.Random;

public class HumiditySensorImpl implements HumiditySensor {
private Integer humiditySensor;
    @Override
    public Integer getHumiditySensor() {
        return humiditySensor;
    }

    @Override
    public void makeHumiditySensor() {
        Random random=new Random();
        humiditySensor = 15 + random.nextInt(86);

    }
}
