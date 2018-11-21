package ru.ponomaryov.se;

public class AnimalDog extends AnimalType {
    public String name;

    public AnimalDog(String name, double runRange, double jumpRange, double swimRange) {
        super();
        super.runRange = runRange;
        super.jumpRange = jumpRange;
        super.swimRange = swimRange;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
