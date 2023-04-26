package day30_inheritance.planetTask$;

public class Earth extends Planet$ {
    public Earth(String surfaceGravity, double mass, double radius, double volume, double population) {
        super(surfaceGravity, mass, radius, volume, population);
    }

//    public Earth(String surfaceGravity, double mass, double radius, double volume, double population) {
//        super(name, surfaceGravity, mass, radius, volume, population);  //todo name should weg : the reason of the error: if getClass().getSimpleName() is used for the name than there shouldn't be name in the constructor of Parent class hire child class as well.
//    }
}
