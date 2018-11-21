package ru.ponomaryov.se;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnimalType animals[] = new AnimalType[2];
        animals[0] = new AnimalDog("Dog", 500.0D, 0.5D, 10.0D);
        animals[1] = new AnimalCat("Cat", 200.0D, 2.0D, 0.0D);

        animals[0].randomizeRange(50.0D);
        animals[1].randomizeRange(30.0D);

        System.out.println("Emulation run 350 meters");
        for (AnimalType animal : animals) {
            if (animal.doRun(350.0D)) {
                System.out.println(animal.getName() + " True [" + animal.getRunRange() + "]");
            } else {
                System.out.println(animal.getName() + " False [" + animal.getRunRange() + "]");
            }
        }
        System.out.println("Emulation jump 1.2 meters");
        for (AnimalType animal : animals) {
            if (animal.doJump(1.2D)) {
                System.out.println(animal.getName() + " True [" + animal.getJumpRange() + "]");
            } else {
                System.out.println(animal.getName() + " False [" + animal.getJumpRange() + "]");
            }
        }
        System.out.println("Emulation swim 9.0 meters");
        for (AnimalType animal : animals) {
            if (animal.doSwim(9.0D)) {
                System.out.println(animal.getName() + " True [" + animal.getSwimRange() + "]");
            } else {
                System.out.println(animal.getName() + " False [" + animal.getSwimRange() + "]");
            }
        }
    }
}
