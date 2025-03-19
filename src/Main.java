public class Main {
    public static void main(String[] args) {
        Computer hp = new Hp("i7",1,16);
        Computer dell = new Dell("i9",532,2024);

        System.out.println("Displaying details of HP ");
        hp.displayDetails();
        System.out.println("Cost of hp "+ hp.computeValue(450,5)+"USD");
        System.out.println();
    }
}