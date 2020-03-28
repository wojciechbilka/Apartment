package apartments;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Apartment ap1 = new Apartment("Warsaw", 35, 7718.75);
        Apartment ap2 = new Apartment("Cracow", 31, 7790);
        Apartment ap3 = new Apartment("Gdansk", 15, 8550.22);



        List<Apartment> list = new ArrayList<>();
        list.add(ap1);
        list.add(ap2);
        list.add(ap3);

        double mean = 0;
        int iter = 0;
        for (Apartment ap : list) {
            mean += ap.getFullPrice();
            System.out.println("Apartment in " + ap.getCity() + " costs " + ap.getFullPrice());
            iter++;
        }
        double average = mean/iter;
        System.out.println(String.format("Mean price is: %.2f", average));
    }
}
