import java.util.ArrayList;
import java.util.Scanner;

import code.Settlem;
import code.User;
import code.Buildings;
import code.BuildingUnits;
import code.BulidingDeffense;


public class Main {

    static final int POWERINIT = 100; // TODO calcular o power inicial

    static int lastUserID = 0;

    static ArrayList<User> users = new ArrayList<User>();

    static int tries = 0;

    // TODO gerar mapa
    // escolher settlement inicial

    Settlem settle0 = new Settlem(0, 0, 1, 1);
    //Diogo.addSettlement(settle0);

    // TODO gerar edificios
    // TODO gerar unidades

    public static void main(String[] args) {
           System.out.println("Sci wars -- welcome to the future");
           System.out.println("1 - Login" +  " | " + "2 - Register" + " | " + "3 - Exit");
           Scanner actionInit = new Scanner(System.in);
           int action = actionInit.nextInt();
           switch (action) {
               case 1:
                   login();
                   runGame();
                   break;
               case 2:
                   register();
                   login();
                   runGame();
                   break;
               case 3:
                   exit();
                   break;
               default:
                   System.out.println("Invalid action");
                   break;
           }
    }

    public static void login(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Username: ");
        String name = scanner.nextLine();

        System.out.println("Password: ");
        String password = scanner.nextLine();

        if(isUserValid(name, password)){
            System.out.println("Welcome " + name);
        }
        else{
            System.out.println("Invalid username or password");
            tries++;
            if(tries == 3){
                System.out.println("Too many tries");
                exit();
            }
            else
                login();
        }
    }

    private static boolean isUserValid(String name, String password) {
        for(User u: users) {
            if (u.getName().equals(name) && u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void register(){
        Scanner scanner = new Scanner(System.in);

        // TODO check if user names existes
        System.out.println("Username: ");
        String name = scanner.nextLine();

        System.out.println("Password: ");
        String password = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        User newUser = new User(lastUserID++, name, password, email, POWERINIT);
        users.add(newUser);

        System.out.println("Welcome " + newUser.getName()  + "#" + newUser.getId() + " your power level is " + newUser.getPowerLevel());
    }

    public static void runGame(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Build" +  " | " + "2 - Attack" + " | " + "3 - Exit");
        int action = scanner.nextInt();
        switch (action) {
            case 1:
                //build();
                break;
            case 2:
                //attack();
                break;
            case 3:
                exit();
                break;
            default:
                System.out.println("Invalid action");
                break;
        }
    }

    public static void exit(){
        System.out.println("Byeeee");
    }
}