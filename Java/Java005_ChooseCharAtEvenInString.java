import static java.lang.System.out;
import java.util.*;
class Java005_ChooseCharAtEvenInString {
    public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      
      Scanner sc1=new Scanner(System.in);
      String inputQueue=sc1.nextLine();

      char[] in_char=inputQueue.toCharArray();
    out.println(in_char);
    int newlen=N;
    do{
        int j=0;
        char[] temp=new char[newlen];
        for(int i=1;i<=newlen-1;i++){
                if(i%2!=0)
                {
                    temp[j]=in_char[i];
                    j++;
            }
        }
        newlen=j;
        out.println("newlen: "+newlen);
        in_char=temp;
    }while(newlen>=2);
    out.println(in_char[0]);
    }
}
