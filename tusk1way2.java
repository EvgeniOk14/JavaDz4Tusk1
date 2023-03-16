import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class tusk1way2 
{
    
    public static String randStr(int n) 
    {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = n;
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
          .limit(targetStringLength)
          .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
          .toString();
        return generatedString;
    }

    public static int rangeOfRanom()
    {
        Scanner sc = new Scanner(System.in,"Cp866");
        System.out.println("Введите длину случайной строки: ");
        int number = sc.nextInt();
        sc.close();
        return number;
    }

    public static void main(String[] args)
    {

        LinkedList <String> ll = new LinkedList<>();
            int number = rangeOfRanom();
            for(int i = 0; i < 10; i++)
            {
                String s = randStr(number);
                ll.add(s);
                /*System.out.println(ll);*/
            }
        System.out.println("Массив случайных строк:\n "  + ll);
        LinkedList <String> reversedlist = new LinkedList<>();
            while(!ll.isEmpty())
            {
                System.out.println(ll.getLast());
                reversedlist.add(ll.pollLast());
            }
        System.out.println("перевёрнутый массив случайных строк:\n " + reversedlist);

    }

}
