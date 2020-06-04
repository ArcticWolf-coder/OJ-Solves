import java.util.*;
public class leds{
public static void main(String[] args)  {
    Scanner sc=new Scanner(System.in);    
    int N = sc.nextInt();
    sc.nextLine();
        char[] numbers;
        int leds;
        for(int i=1;i<=N;i++) {
            leds = 0;
            numbers = sc.nextLine().toCharArray();
            for (char number : numbers) {
                switch (number) {
                    case '8':
                        leds += 7;
                        break;
                    case '0':
                    case '6':
                    case '9':
                        leds += 6;
                        break;
                    case '2':
                    case '3':
                    case '5':
                        leds += 5;
                        break;
                    case '4':
                        leds += 4;
                        break;
                    case '7':
                        leds += 3;
                        break;
                    case '1':
                        leds += 2;
                        break;
                }
            }
            System.out.println(leds + " leds");
        }
        
    }
}