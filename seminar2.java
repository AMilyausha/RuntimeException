
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class seminar2{
    public static void main(String[] args) {
        inputFloat();
        int[] arr={3,4,5,4,4,4,5,5,5,5};
        int d=0;
        correctCode2(arr,d);
        inputSrtring();
    }

    // 1.Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//  и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//   вместо этого, необходимо повторно запросить у пользователя ввод данных.

    private static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Ввод дробного числа (типа float)");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Введены некорректные данные");
                System.out.println("Ввод дробного числа (типа float)");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            }   finally{
                System.out.println("Удачи");
            } 
        }
     
    }
    // 2. Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
// Дан следующий код, исправьте его там, где требуется 
// (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

private static void correctCode2(int[] arr1,int d) {
    try {
        double catchedRes1 = arr1[8]/d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Деление на ноль: " + e);
        } catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Ошибка индексации массива: " + e);   
        }
        
    }

// 3. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
private static void inputSrtring() {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите любой текст кроме пустой строки");
    try {
        String result = reader.readLine();
        if(result.equals("")) throw new RuntimeException("Пустую строку вводить нельзя");
        System.out.println(result);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
 
}

