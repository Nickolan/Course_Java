package Sesion9.Enumerations;

public class Enumerations {
    public static void main(String args[]){
        //name(), valueOf(), ordinal()
        for(Season season: Season.values()){
            System.out.println(season.name() + " " + season.ordinal());
        }

        Season t1 = Season.valueOf("WINTER");
        System.out.println(t1.name());

        //valueOf()
    }
}

enum Season{
    SUMMER, SPRING, WINTER, FALL
}
