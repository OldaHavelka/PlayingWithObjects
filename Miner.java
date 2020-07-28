package cz.pack.name;

public class Miner extends Human implements IWorkable{

    private float salary;
    private float money;
    private int hoursWorkedUnpayed;

    public Miner(float weight, float height) {
        super(weight, height);
        this.salary=150.0f;
    }

    @Override
    public void setMoney(float money){
        System.out.println("Setting money is a bad idea.");
    }

    @Override
    public float getMoney(){
        return this.money;
    }

    @Override
    public String jobDescription() {
        return "I am a miner. I mine in a coal mine.";
    }

    @Override
    public void work() {
        if (this.getIsFed()) {
            this.hoursWorkedUnpayed+=8;
        }
    }

    @Override
    public void getPayed() {
        this.money+=this.salary*this.hoursWorkedUnpayed;
        this.hoursWorkedUnpayed=0;
    }

    @Override
    public void promote() {
        this.salary+=50.0f;
    }

    @Override
    public void demote() {
        this.salary-=50.0f;
    }
}
