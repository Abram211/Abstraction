public class Hp extends Computer{
    int ram;

    public Hp(String core, int storage, int ram) {
        super(core, storage);
        this.ram = ram;
    }
    public void displayDetails(){
        System.out.println("Core: "+core);
        System.out.println("Storage: "+storage+"TB");
        System.out.println("RAM: "+ram +"GB");
    }
}
