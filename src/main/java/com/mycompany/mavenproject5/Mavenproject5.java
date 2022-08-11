





package com.mycompany.mavenproject5;
import java.util.Scanner;

/**
 *
 * @author almadkhal12
 */
public class Mavenproject5 {
    
    
    public static void main(String[] args) {
        
//   new Mavenproject5().Sum(1000, 5);
//		System.out.println("this is returned method   " + new Mavenproject5().multipl(55, 8));
                           Scanner scan = new Scanner(System.in);
                              Scanner scan2 = new Scanner(System.in);
     Scanner scan3= new Scanner(System.in);
               
    System.out.println("Enter first value");
int a = scan.nextInt();    
    System.out.println("Enter the charctor");
    char c = scan3.next().charAt(0);


    System.out.println("Enter scound value");
int b = scan2.nextInt();   

        
                	switch(c) {
                            case '+':
                            
                         System.out.println("this is returned Sumation   " + new Calc1().Sum(a, b));
                                                  System.out.println("this is returned method   " + new Calc1().Sum(a, b));

                                    
    // code block
    break;
  case '/':
                               System.out.println("this is returned Division   " + new Calc1().Div(a, b));

    // code block
    break;
    
  case '%':
  
                                 System.out.println("this is returned mode   " + new Calc1().mod(a, b));

  break;
  
  case '*':
                                   System.out.println("this is returned Multiple   " + new Calc1().multipl(a, b));

  break;
  
  default:
    // code block
}


	}
}
                
                
	   

