package CodeSource.init;

import java.util.ArrayList;

/**
 * Created by Lanas on 30/06/2016.
 */
public class initLed {

    public static ArrayList<Integer> initLED(){
        ArrayList<Integer> led = new ArrayList<Integer>();

        for (int i =0; i < 105; i++){
            led.add(0);
        }

        return led;
    }
}
