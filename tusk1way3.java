import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class tusk1way3 
{

    public static LinkedList<String> reversedlist(LinkedList<String> ll)
    {
        LinkedList<String> newList = new LinkedList<String>();
        LinkedList<String> ReversedList = new LinkedList<String>();
        newList = (LinkedList) ll.clone();
            while(!newList.isEmpty())
              {
                 ReversedList.add(newList.pollLast());
              }
        return ReversedList;
    }


    public static void main(String[] args)
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
       System.out.println(reversedlist(ll).toString());
       sc.close();

    }    
}
