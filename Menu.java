import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Menu {
    private List <Cars> carList = new ArrayList<>();
    private List <Candy> candyList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    private String startMenu = "\nMENU\n(1) Bilar\n(2) Godisar \n(3) Rör\n(4) Havremjölk\n(5) Visa beställningar\n(6) Avsluta";
    
    private <T> String getListString(List<T> list, String header){
        StringJoiner joiner = new StringJoiner ("\n");
        for (T item : list){
            joiner.add(item.toString());
        }
        return header + "\n" + joiner.toString();
    }

    public void showMeny() {
        boolean run = true;
        while (run) {
            System.out.println(startMenu);
            try {
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        Cars car = new Cars();
                        System.out.println("Ange regnummer");
                        car.setRegNum(sc.nextLine());
                        System.out.println("Ange färg");
                        car.setColor(sc.nextLine());
                        System.out.println("Ange märke");
                        car.setBrand(sc.nextLine());
                        carList.add(car);
                        break;
                    case 2:
                        Candy candy = new Candy();
                        System.out.println("Ange smak");
                        candy.setTaste(sc.nextLine());
                        System.out.println("Ange antal");
                        candy.setQuantity(sc.nextInt());
                        candyList.add(candy);
                        break;
                    case 3:
                        //rör
                        break;
                    case 4:
                        //havremjölk
                        break;
                    case 5:
                        System.out.println(getListString(carList, "\nBilar:\n__________"));
                        System.out.println(getListString(candyList, "\nCandy:\n__________"));
                        
                        break;
                    case 6:
                        System.out.println("Programmet avslutas.");
                        run = false;
                        break;
                    default:
                        System.out.println("Ogiltigt val. Försök igen.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Felaktig inmatning. Ange en siffra.");
                sc.nextLine();
            }
        }
        sc.close();
    }
}