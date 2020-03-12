package profile;

public class Format {
    public static void numberChange(String number){
        char[] format = number.toCharArray();
        String output ="";
        boolean flag;
        for(int i = 0; i < (format.length);i++){
            flag = Character.isDigit(format[i]);
            if(flag){
                        output +=format[i];
            }
        }

    }
}
