import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class tusk1way1 
{
    
    public static void main(String[] args) throws IOException
    {
      
        LinkedList <String> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in,"Cp866");
        System.out.println("Введите строку: ");
        String S = sc.nextLine();

        while(!S.contains("stop"))
       {
        ll.add(S);
        System.out.println("Введите строку: ");
        S = sc.nextLine();

       } 
    
       LinkedList <String> list1 = new LinkedList<>();

       while(!ll.isEmpty())
       {
        list1.add(ll.pollLast());
       }

       System.out.println(list1.toString());
       sc.close();
    }

}
