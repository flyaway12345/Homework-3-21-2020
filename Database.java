package profile;

import java.util.Scanner;

public class Database {
    private static int databaseSize = 3;
    public static Contact[] database = new Contact[databaseSize];
    public static void initDatabase(){
        for(int i = 0;i < databaseSize;i++){
            if(database[i] != null){
               System.out.println(database[i]);
            }
        }

    }

    public static void addContact(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type Their Name");
        String name = scan.nextLine();
        System.out.println("Type Their Gender (Type O for anything other then Male(m) or Female(f))");
        char gender = scan.next().charAt(0);
        System.out.println("Type Their Age");
        int age = scan.nextInt();
        System.out.println("Subscribe them for Newsletter?");
        boolean isSubscribed = scan.nextBoolean();
        System.out.println("Type Their Phone Number");
        String number = scan.nextLine();
        databaseSize++;
        initDatabase();
        Contact newAdd = new Contact(name, gender,age,number,isSubscribed);
    }

}
