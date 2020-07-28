package cz.pack.name;

public class Main {

    public static void main(String[] args) {
        Cat aCat = new Cat(14.4f, 32.5f);
        System.out.println(aCat.makeASound());
        System.out.println(aCat.getHeight());
        System.out.println(aCat.getWeight());
        aCat.setHeight(3243423.4234f);
        System.out.println(aCat.getHeight());
        System.out.println("--------");
        Miner aMiner = new Miner(86.5f, 182.4f);
        System.out.println(aMiner.getMoney());
        System.out.println(aMiner.jobDescription());
        System.out.println(aMiner.makeASound());
        aMiner.work();
        aMiner.getPayed();
        System.out.println(aMiner.getMoney());
        System.out.println("--------");
        System.out.println(aCat.getClass());
        System.out.println(((Human)aMiner).getClass());
    }
}
