package org.inheritance;

import org.inheritance.model.ColorEnum;
import org.inheritance.model.Daisy;
import org.inheritance.model.SunFlower;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
// prueba




        SunFlower sunFlowerGarden = new SunFlower("Sun flower1", ColorEnum.BLUE,1.5,Boolean.TRUE);
        if(sunFlowerGarden.getBloomDate()==null){
            System.out.println("bloomDate is null");
        }
        LocalDate bloomDate = LocalDate.now().withMonth(3);
        sunFlowerGarden.setBloomDate(bloomDate);
        System.out.println(sunFlowerGarden);

        LocalDate daisyBlommDate = LocalDate.now().withMonth(6);
        Daisy daisyGarden = new Daisy("Margarita",ColorEnum.RED,daisyBlommDate,12,Boolean.TRUE);

        System.out.println(daisyGarden);

    }
}