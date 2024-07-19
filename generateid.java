import java.util.Random;
import java.util.*;
public class generateid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String alphnum=letters+numbers;
        StringBuilder sb=new StringBuilder();
        Random random = new Random();
        for(int i=0;i<4;i++)
        {
            int index=random.nextInt(letters.length());
            char randomChar=letters.charAt(index);
            sb.append(randomChar);
        }
            //generate 4 random numbers
            for(int j=0;j<4;j++){
                int index1=random.nextInt(numbers.length());
                char ranChar=numbers.charAt(index1);
                sb.append(ranChar);
            }
            
            //generate random
            int index2=random.nextInt(alphnum.length());
            char raCh=alphnum.charAt(index2);
            sb.append(raCh);
            
            System.out.println("PAN number: "+sb.toString());
        }
    }

