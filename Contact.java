package profile;
//constructer fo contact card
public class Contact {
    public String name;
    public char gender;
    public int age;
    public String number;
    public boolean isSubscribed;

    public Contact(String name, char gender,int age,String number,boolean isSubscribed){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.number =number;
        this.isSubscribed = isSubscribed;
    }
}
