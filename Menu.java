import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private String startMenu = "\nMENU\n(1) Bilar\n(2) Godisar \n(3) Rör\n(4) Havremjölk\n(5) Visa beställningar\n(6) Avsluta";
    private List <Cars> carList = new ArrayList<>();
    private List <Candy> candyList = new ArrayList<>();
    private List <Pipes> pipeList = new ArrayList<>();
    private List <Oatmilk> oatmilkList = new ArrayList<>();
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
                            Pipes pipes = new Pipes();
                            System.out.println("Ange diameter");
                            pipes.setDiameter(sc.nextDouble());
                            System.out.println("Ange längd");
                            pipes.setLength(sc.nextDouble());
                            pipeList.add(pipes);
                            break;
                        case 4:
                            Oatmilk oatmilk = new Oatmilk();
                            System.out.println("Ange fetthalt");
                            oatmilk.setFatcontent(sc.nextDouble());
                            System.out.println("Ange antal liter");
                            oatmilk.setLiter(sc.nextDouble());
                            oatmilkList.add(oatmilk);
                            break;
                        case 5:
                            System.out.println(getListString(carList, "\nBilar:\n__________"));
                            System.out.println(getListString(candyList, "\nGodis:\n__________"));   
                            System.out.println(getListString(pipeList, "\nRör:\n__________"));     
                            System.out.println(getListString(oatmilkList, "\nHavremjölk:\n__________"));         
                            break;
                        case 6:
                            System.out.println("Programmet avslutas.");
                            run = false;
                            break;
                        default:
                            System.out.println("Ogiltigt val. Försök igen.");
                    }
            } 
            catch (InputMismatchException e) {
                System.out.println("Felaktig inmatning. Ange en siffra.");
                sc.nextLine();
                }
        }
        sc.close();
    }
}