package org.inheritance.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@ToString
public class Daisy extends Flower {

    private Integer petalCount;
    private Boolean hasWhitePetal;

    public Daisy(String name, ColorEnum color, LocalDate bloomDate, Integer petalCount, Boolean hasWhitePetal){
        super(name,color,bloomDate);
        this.petalCount=petalCount;
        this.hasWhitePetal=hasWhitePetal;
    }
    public void attractBees(){

    }
    @Override
    public void bloom() {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.isAfter(super.bloomDate)) {
            System.out.println("Esta floreciendo desde Sunflower");
        } else {
            System.out.println("No corresponde florecer desde SunFlower");
        }
    }
    @Override //this flower get wither after 3 months pass its bloom
    public void wither(){
        LocalDate marchitar=super.bloomDate.plusMonths(3);
        if(marchitar.isAfter(super.bloomDate)){
            System.out.println("Daisy esta marchita");
        }
    }
}
