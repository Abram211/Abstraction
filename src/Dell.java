public class Dell extends Computer{
    int released;

    public Dell(String core, int storage, int released) {
        super(core, storage);
        this.released = released;
    }
    public void displayDetails() {
        System.out.println("Core: "+core);
        System.out.println("Storage: "+storage+"GB");
        System.out.println("Released Year: "+released);
    }
}
