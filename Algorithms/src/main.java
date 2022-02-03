
public class main {

    public static void main(String[] args) {


        Structure structure = new Structure();
        System.out.println("Start");
        structure.put(1);
        structure.put(2);
        structure.put(3);
        structure.printStatus();
        System.out.println(structure.get());
        System.out.println(structure.get());
        System.out.println(structure.get());
        System.out.println(structure.get());
        structure.printStatus();
        System.out.println("End");
    }

}

