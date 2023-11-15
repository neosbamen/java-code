package org.inheritance.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class SunFlower extends Flower {


    private Double height;
    private Boolean isFacingSun;

    public SunFlower(String name, ColorEnum color,Double height, Boolean isFacingSun){

        super(name, color);
        this.height=height;
        this.isFacingSun=isFacingSun;

    }
    public void photosynthesis(){ }

    @Override
    public void bloom() {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.equals(super.bloomDate)) {
            System.out.println("Esta floreciendo desde Sunflower");
        } else {
            System.out.println("No corresponde florecer desde SunFlower");
        }
    }

}
