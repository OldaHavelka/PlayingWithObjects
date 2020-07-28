package cz.pack.name;

public class Cat extends ALivingCreature{
    public Cat(float weight, float height) {
        super(weight, height);
    }

    @Override
    public String makeASound() {
        return "Meow!";
    }
}
