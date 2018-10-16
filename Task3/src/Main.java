import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        System.out.println("Enter length of array: ");
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        Apartment[] apartments = new Apartment[N];

        Random rand = new Random();
        String[] buildingTypes = new String[]{"Private", "Hostel", "Multi-family"};
        for (int i = 0; i < N; i++){
            int rnd = new Random().nextInt(buildingTypes.length);
            apartments[i] = new Apartment(rand.nextInt(500) + 1,
                                          BigDecimal.valueOf(rand.nextFloat() * 100).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue(),
                                    rand.nextInt(61) + 1,
                              rand.nextInt(6) + 1,
                                           buildingTypes[rnd],
                               rand.nextInt(31) + 1);
            System.out.println(apartments[i].toString());
        }


        System.out.println("Enter room numbers to search: ");
        int rn = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for(int i = 0; i < apartments.length; i++) {
            if (apartments[i].getRoomNumber() == rn) {
                System.out.println(apartments[i].toString());
                flag = true;
            }
        }
        if (!flag)
            System.out.println("Apartments with the specified number of rooms not found.");


        System.out.println("Enter room square to search: ");
        int rs = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter apartment floor to search: ");
        int af = Integer.parseInt(scanner.nextLine());
        flag = false;
        for(int i = 0; i < apartments.length; i++)
            if (apartments[i].getSquare() > rs && apartments[i].getFloor() > af) {
                System.out.println(apartments[i].toString());
                flag = true;
            }
        if (!flag)
            System.out.println("Apartments with greate values than the specified square and floor not found.");
    }

}
