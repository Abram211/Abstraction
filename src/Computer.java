public abstract class Computer {
    String core;
    int storage;

    public Computer(String core, int storage) {
        this.core = core;
        this.storage = storage;
    }
    public abstract void displayDetails();
    public double computeValue(double cost,double shifting){
        return cost+shifting;
    }
}
