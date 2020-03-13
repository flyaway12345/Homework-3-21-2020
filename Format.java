package profile;

public class Format {
    public static String numberChange(String number){
        char[] format = number.toCharArray();
        String output ="";
        boolean flag;

        //Formats Phone numbers in the case of typos and put in a standerd format
        for(int i = 0; i < (format.length);i++){
            flag = Character.isDigit(format[i]);
            if(flag){
                        output +=format[i];
            }
        }
        //check to see if number is correct
        if(output.length() != 10){
            System.out.println("ERROR: invald number entry please run again");
        }
        return output;
    }
}
