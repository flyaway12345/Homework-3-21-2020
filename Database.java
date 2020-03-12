package profile;

public class Database {
    public int databaseSize = 3;
    public Contact[] database = new Contact[databaseSize];
    public void initDatabase(){
        for(int i = 0;i < databaseSize;i++){

        }

    }
    public void currentContacts(){
        Contact mike = new Contact("Mike", 'M',24,"(302) 778- 9334",true);
        Contact alice = new Contact("Alice", 'F',19,"5811157782",true);
        Contact erin = new Contact("Erin", 'O',26,"403-672-3361",true);
    }
}
