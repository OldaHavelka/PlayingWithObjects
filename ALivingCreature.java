package cz.pack.name;

public abstract class ALivingCreature {
    private float weight;
    private float height;
    private boolean isFed;

    public ALivingCreature(float weight, float height) {
        this.weight = weight;
        this.height = height;
        this.isFed = true;
    }

    public void feed(){
        this.isFed=true;
    }

    public float getHeight(){
        return this.height;
    }

    public void setHeight(float height){
        this.height=height;
    }

    public boolean getIsFed(){
        return this.isFed;
    }

    public void setIsFed(boolean isFed) {
        this.isFed=isFed;
    }

    public float getWeight(){
        return this.weight;
    }

    public void setWeight(float weight){
        this.weight=weight;
    }

    abstract public String makeASound();
}
