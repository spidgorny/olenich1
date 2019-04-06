import java.lang.reflect.Array;
import java.util.UUID;

public class ElektroShop {

    public static void main(String[] args) {
        System.out.println(args[0] + " " + args[1]);

        Department department1 = new Department("");
        department1.setName("TV Abteilung");
        department1.area = 58;

        Department department2 = new Department("");
        //department2.name = "Console Abteilung";
        department2.area = 10;

        double big = department2.areaTimes(2);

        System.out.println(department1.getName() + " area: "+department1.getArea());

        int DEP_SIZE = 100;
        Department[] list = new Department[DEP_SIZE];
        for (int i = 0; i < DEP_SIZE; i++) {
            list[i] = new Department(randomName());
        }

        for (int i = 0; i < list.length; i++) {
            Department dep = list[i];
            System.out.println(dep.getName());
        }
    }

    public static String randomName() {
        return UUID.randomUUID().toString();
    }

}
