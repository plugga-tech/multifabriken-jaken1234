import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private Cars car = new Cars();
    private Scanner sc = new Scanner(System.in);
    private String startMenu = "MENU\n(1) Bilar\n(2) Godisar \n(3) Rör\n(4) Havremjölk\n(5) Visa beställningar\n(6) Avsluta";

    public void showMeny() {
        boolean run = true;
        while (run) {
            System.out.println(startMenu);

            try {
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Ange regnummer");
                        car.setRegNum(sc.nextLine());
                        System.out.println("Ange färg");
                        car.setColor(sc.nextLine());
                        System.out.println("Ange märke");
                        car.setBrand(sc.nextLine());
                        break;
                    case 2:
                        //godis
                        break;
                    case 3:
                        //rör
                        break;
                    case 4:
                        //havremjölk
                        break;
                    case 5:
                        //alla produkter
                        System.out.println(car.showCar());
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