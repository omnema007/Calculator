import java.util.*;
public class Division {

public static int divide(int a, int b) {
return a / b;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter first number");
int a = sc.nextInt();

System.out.println("Enter second number");
int b = sc.nextInt();

int division = divide(a, b);

System.out.println("The result is: " + division);
}
}