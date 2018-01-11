import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculatorr 
{
public static void main(String[] args)
{
int comnda;
int comndb;

String operation;

Scanner input=new Scanner(System.in);

System.out.println("please enter your desired first number");
   comnda = input.nextInt();
System.out.println("please enter your desired second number");
  comndb = input.nextInt();
Scanner op = new Scanner(System.in);
System.out.println("please enter your operation");
operation=op.next();

if(operation == "+");
{
System.out.println("your final answer is " +(comnda+comndb+"!"));
}
}
}


