import java.util.*;
public class Subtraction {

public static int sub(int a, int b) {
return a - b;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter first number");
int a = sc.nextInt();

System.out.println("Enter second number");
int b = sc.nextInt();

int subtraction = sub(a, b);

System.out.println("The result is: " + subtraction);
}
}