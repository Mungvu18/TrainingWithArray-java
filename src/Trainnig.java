import java.sql.SQLOutput;
import java.util.Scanner;

public class Trainnig {
    public static void main(String[] args) {
        // khai báo độ dài của mảng
        int size;
        int[] Array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter size of Array");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("size does not exceed 20");
            }
        } while(size>20);
        // nhạp giá trị cho phần tử của mảng
        Array = new int[size];
        for (int i = 0; i <Array.length ; i++) {
            System.out.println("Enter element" + (i+1) +":");
            Array[i] = scanner.nextInt();
        }
        // in ra mảng đã nhập
        System.out.printf("%-20s%s","Elements in array:","");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]+"\t");
        }
        // đảo ngược giữa các phần tử trong mảng
        for (int i = 0; i < Array.length/2; i++) {
           int temp = Array[i];
           Array[i] = Array[size - 1 - i];
           Array[size - 1 - i] = temp;
        }
        System.out.printf("%-20s%s","reverse array","");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]+"\t");
        }
    }
}
