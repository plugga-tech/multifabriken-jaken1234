import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private String startMenu = "\n-Multifactory-\n(1) Cars\n(2) Candy\n(3) Pipes\n(4) Oatmilk\n(5) Show orders\n(6) Exit";
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
                            try{                          
                                System.out.println("Enter carbrand:");
                                car.setBrand(sc.nextLine());
                                System.out.println("Enter registration number:");
                                car.setRegNum(sc.nextLine());
                                System.out.println("Enter color:");
                                String colorInput=sc.next();
                                if (colorInput.matches(".*\\d.*")) {
                                    throw new InputMismatchException();
                                }
                                car.setColor(colorInput);
                                carList.add(car);                           
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input");
                                sc.nextLine();
                        }
                            break;
                        case 2:
                            Candy candy = new Candy();
                            try {
                                System.out.println("Enter taste:");
                                String tasteInput = sc.next();
                                if (tasteInput.matches(".*\\d.*")) {
                                    throw new InputMismatchException();                                  
                                }           
                                candy.setTaste(tasteInput);           
                                System.out.println("Enter quantity:");
                                candy.setQuantity(sc.nextInt());                    
                                candyList.add(candy);
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input");
                                sc.nextLine();
                            }
                            break;
                        case 3:
                            Pipes pipes = new Pipes();
                            System.out.println("Enter diameter:");
                            pipes.setDiameter(sc.nextDouble());
                            System.out.println("Enter length:");
                            pipes.setLength(sc.nextDouble());
                            pipeList.add(pipes);
                            break;
                        case 4:
                            Oatmilk oatmilk = new Oatmilk();
                            System.out.println("Enter fatcontent:");
                            oatmilk.setFatcontent(sc.nextDouble());
                            System.out.println("Enter liter quantity:");
                            oatmilk.setLiter(sc.nextDouble());
                            oatmilkList.add(oatmilk);
                            break;
                        case 5:
                            boolean emptyList=true;
                            if(!carList.isEmpty()){
                                System.out.println(getListString(carList, "\n\u001B[4m" + "Cars(" + carList.size() + "):" + "\u001B[0m")); 
                                emptyList = false;
                            }                                                                                    
                            if(!candyList.isEmpty()){
                                System.out.println(getListString(candyList, "\n\u001B[4m" + "Candy(" + candyList.size() + "):" + "\u001B[0m")); 
                                emptyList = false;  
                            }                                                                                 
                            if(!pipeList.isEmpty()){
                                System.out.println(getListString(pipeList, "\n\u001B[4m" + "Pipes(" + pipeList.size() + "):" + "\u001B[0m")); 
                                emptyList = false;   
                            }                                                                            
                            if (!oatmilkList.isEmpty()){
                                System.out.println(getListString(oatmilkList, "\n\u001B[4m" + "Oatmilk(" + oatmilkList.size() + "):" + "\u001B[0m"));  
                                emptyList = false; 
                            }                              
                            if (emptyList)
                                System.out.println("No orders");                         
                            break;
                        case 6:
                            System.out.println("Exiting program");
                            run = false;
                            break;
                        default:
                            System.out.println("Invalid input, enter a number(1-6).");
                    }
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                sc.nextLine();
                }
        }
        sc.close();
    }
}