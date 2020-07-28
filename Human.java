package cz.pack.name;

public class Human extends ALivingCreature{

    private float money;

    public Human(float weight, float height) {
        super(weight, height);
        this.money=0.0f;
    }

    @Override
    public String makeASound() {
        return "Hello?";
    }

    public String jobDescription() {
        return "I currently do not have a job. Looking for a job in the midst of a pandemic while having no previous experience is not an easy task.";
    }

    public float getMoney() {
        System.out.println("What an impolite question.");
        return -1.0f;
    }

    public void setMoney(float money) {
        System.out.println("You're not trying to take money from me, aren't you?");
    }
}
