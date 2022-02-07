import java.util.Locale;
import java.util.Scanner;

public class breakandcoun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int sum=0;
        //for(int i=0;i<10 ;i++) {
        //    System.out.println("please enter a number ");
        //    sum+=scanner.nextInt();
        //    if(sum >100){
        //        break;
        //    }
        //}
        //System.out.println("the sum is :  "+sum);
        //int sum=0;
        //int input=0;
        //for(int i=0;i<10 ;i++) {
        //    System.out.println("please enter a number ");
        //    input=scanner.nextInt();
        //    if(input >0){
        //        continue;
        //    }
        //    sum+=input;
        //}
        //System.out.println("the sum is :  "+sum);
        //for(int i=0;i<10 ;i++) {
        //   if(i%2==0)
        //       continue;
        //    System.out.println(i);
        //}
        //1
        // כתבו תוכנית שתקלוט מהמשתמש 10 מספרים ואם המשתמש מכניס את הערך Q
        // אז לצאת מהלולאה
        //הציגו את הסכום של המספרים
        //** אתגר במידה והלקוח מכניס את הערךQאוq יש לצאת (עם בדיקת תנאי אחת בלבד)
        //  to convert String to int =>>    int i = Integer.parseInt(String)
        //String input;
        //int number,sum=0;
        ////
        //for (int i=0;i<10;i++){
        //    System.out.println("please enter a number or press Q to exit");
        //    input=scanner.next();//Q=>q =q     q=>q  55
        //    if (input.equalsIgnoreCase("Q")) {
        //        break;
        //    }
        //    //int x =Integer.parseInt("588");
        //    //byte s=Byte.parseByte("");
        //    //char s='9';
        //    number=Integer.parseInt(input);
        //    sum+=number;
        //}
        //System.out.println("sum i s: "+sum);

        //=======================================================================
        //2
        //כתבו תוכנית המקבלת מהמשתמש מספר אחד ובודקת אם מהספר מכיל
        //9 באחת הספרות (בהנחה שהמשתמש מכניס מספר מורכב מ 4 ספרות)

        //int numb1=scanner.nextInt();
        //int check;
        //for (int i=0;i<4;i++){
        //    check= numb1%10;
        //    if (check ==9) {
        //        System.out.println("we hava a winner !!!!!");
        //        break;
        //    }
        //    numb1/=10;// numb1=numb1/10
        //}
//
        ////2
        //String numb2=scanner.next();
        //if (numb2.contains("9"))
        //    System.out.println("we hava a winner !!!!!");
//

//======================================================================

        //3
        //כתבו תוכנית שמקבלת מהמשתמש מספר אחד ובודקת אם המספר ראשוני
        // מספר ראשוני הוא מספר שמתחלק ב 1 ובעצמו בלבד !!!!
        //
        //int x = scanner.nextInt();
        //boolean flag = true;
        ////optinal
        //if (x == 1 || x == 0) {
        //    for (int i = 2; i < x; i++) {
        //        if (x % i == 0) {
        //            flag = false;
        //            break;
        //        }
        //    }
//
        //    if (flag)
        //        System.out.println(x + "is a prime number");
        //    else
        //        System.out.println("not a prime ");
        //}

    }
}
