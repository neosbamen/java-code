package org.inheritance.model;
import lombok.*;
import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Flower {

    protected String name;
    protected ColorEnum color;
    protected LocalDate bloomDate;

    public Flower(String name, ColorEnum color){
        this.name=name;
        this.color=color;
    }

    public abstract void  bloom();
    public void wither(){
        //the wither default to be applied as soon as the flower get blooms
        LocalDate currentDate=LocalDate.now();
        if(currentDate.isAfter(this.bloomDate)){
            System.out.println("Esta flor esta marcita");
        }
    }
}
