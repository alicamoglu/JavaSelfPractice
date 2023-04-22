package day30_inheritance.planetTask$;
import java.lang.Math;

public class Planet$ {
    private String surfaceGravity;
    private double mass, radius, volume, surfaceArea, population;
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurfaceGravity() {
        return surfaceGravity;
    }

    public void setSurfaceGravity(String surfaceGravity) {
        this.surfaceGravity = surfaceGravity;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.out.println("Invalid radius: " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public Planet$(String name, String surfaceGravity, double mass, double radius, double volume, double population) {
        setName(name);             //this.name = name;
        setSurfaceGravity(surfaceGravity);               //this.surfaceGravity = surfaceGravity;
        setMass(mass);               //this.mass = mass;
        setRadius(radius);               //this.radius = radius;
        setVolume(volume);               //this.volume = volume;
        setPopulation(population);               //this.population = population;
        setSurfaceArea((4/3)*Math.PI*Math.pow(radius,3)); //this.surfaceArea = (4/3)*Math.PI*Math.pow(radius,3);--> wrong this           //math.pi*pow(radius
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", surfaceGravity='" + surfaceGravity + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", volume=" + volume +
                ", surfaceArea=" + surfaceArea +
                ", population=" + population +
                '}';
    }
}
