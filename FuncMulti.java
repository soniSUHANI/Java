import java.util.*;

public class FuncMulti {
    public static int calcMulti(int a, int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul = calcMulti(a,b);
        System.out.println("The multiple of two numbers is "+mul);

    }
}
