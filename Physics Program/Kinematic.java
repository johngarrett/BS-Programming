/*
 * Program: AP CSP Create Task 
 * Version: 1.0
 * John Garrett
 * Early 2018
 * Compiler/Platform: Java 1.8, Mac OS X
 * 
 * Description:
 * This class contains all the math under the hood
 * 
 */
import java.io.*;
import java.util.*;
public class Kinematic
{
    public static Scanner input = new Scanner(System.in);
    public static Formatting format = new Formatting();
    public static String form1 = "Vf^2 - Vi^2 = 2 * a * ∆x";
    public static String form2 = "v = ∆x/t";
    public static String form3 = "∆x = Vi*t + .5(a*(t^2))";
    
    
    public static double acc;
    public static double x;
    public static double vi;
    public static double vf; 
    public static double time; 
    public static double avgv;
    public static int choice;
    public static int Input(){
             return( input.nextInt());
    }
    public static void Init(){
       format.ClearCons();
       format.Header("WELCOME TO COMPUTATIONAL KINEMATICS");
       
       System.out.print("There are three formulas associated with kinematics...\n"+
       "1. " + form1 + "\n2. "+form2+"\n3. "+form3+"\n\nWhich would you like to explore?\n\nEnter a number(1-3):");
       
       choice = Input();
       
       format.Divider();

       switch (choice)
       {
           //Vf^2 - Vi^2 = 2 * a * ∆x
           case 1: form1(); break;
           //a = ∆v/t
           case 2: form2(); break;
           //∆x = Vi*t + .5(a*(t^2))    
           case 3: form3(); break;
           
           default:
           System.out.println("Invalid Input");
           Init();
       }

    }
   //Vf^2 - Vi^2 = 2 * a * ∆x
    public static void form1()
    {
        System.out.print("What are you trying to solve for?\n\n" +
        "1. Velocity Final"+
        "\n2. Velocity Inital"+
        "\n3. Acceleration"+
        "\n4. Change in X\n"+
        "\nYour Choice(1-4): ");
        
        choice = Input();
        format.Divider();
        switch(choice)
        {
                
            //solving for the change in x    
            case 4:
                acc = Formatting.Print.Acceleration();
                vi = Formatting.Print.VelocityI();
                vf = Formatting.Print.VelocityF();                 
              if(acc!= 0)
               {
                x = (Math.pow(vf,2) - Math.pow(vi,2))/(2*acc);
                
                System.out.println("The Change in x is "+x+" meters.");
               }
              else 
               {
                    System.out.println("Because there is no acceleration in the problem, it is impossible to solve for ∆x with this equation\n\n"+
                    "Multiply velocity by time for the change in x.\n");
               }
                
                break;
            //solving for final velocity
            case 1:
                acc = Formatting.Print.Acceleration();
                x = Formatting.Print.ChangeX();
                vi = Formatting.Print.VelocityI();
                
                vf = Math.sqrt (2*acc*x+Math.pow(vi,2));
                
                System.out.println("The Final Velocity is "+vf+" meters per second.");
                break;
                
            //solving for initial velocity
            case 2:
                acc = Formatting.Print.Acceleration();
                x = Formatting.Print.ChangeX();
                vf = Formatting.Print.VelocityF();
                
                vi = -1 * (Math.sqrt (2*acc*x+Math.pow(vf,2)));
                
                System.out.println("The Inital Velocity is "+vf+" meters per second.");
                break;
                
            //solving for acceleration    
            case 3:
                x = Formatting.Print.ChangeX();
                vi = Formatting.Print.VelocityI();                
                vf = Formatting.Print.VelocityF();               
                
                acc = ((vf*vf) - (vi*vi))/(2*x);

                System.out.println("The Acceleration "+acc+" meters per second per second.");
                break;
            default:
                 System.out.println("Invalid Input.");
                 form1();
         }
    }
    public static void form2(){
        System.out.print("What are you trying to solve for?\n\n" +
               "1. Average Velocity"+
               "\n2. Acceleration"+
               "\n3. Time\n\nYour Choice (1-3): ");
               choice = Input();
               switch (choice)
               {
                   //avg velocity
                   case 1:
                        acc = Formatting.Print.Acceleration();
                        time = Formatting.Print.Time();
                        
                        avgv = acc * time;
                        
                        System.out.println("The average velocity is "+avgv+" meters per second");
                        break;
                        
                   //acc
                   case 2:

                        avgv = Formatting.Print.AvgV();
                        time = Formatting.Print.Time();
                        
                        acc = avgv / time;
                        
                        System.out.println("The acceleration is "+acc+" meters per second per seconds");
                        break;
                        
                   //time
                   case 3:
                        acc = Formatting.Print.Acceleration();
                        avgv = Formatting.Print.AvgV();
                        
                        time = avgv/acc;
                        
                        System.out.println("The time elapased is "+time+"seconds");
                        break;
                        
                   default:
                        System.out.println("Invalid Input");
                        form2();
                }
    }
    public static void form3()
    {
        System.out.print("What are you trying to solve for?"
        + "\n\n1. Change in X\n2.Velocity Inital\n3.Acceleration\n\nYour Choice (1-3): ");
        choice = Input();
        System.out.print("\nEnter Time (in seconds):");
        time = input.nextDouble();
        switch(choice)
        {
            //CHANGE IN X
            case 1:
                vi = Formatting.Print.VelocityI();
                acc = Formatting.Print.Acceleration(); 
                
                x = vi*time + .5*(acc*(Math.pow(time,2)));
                System.out.println("The change in x was "+x+" meters.");
                break;
            //velocity inital
            case 2:
                acc = Formatting.Print.Acceleration();
                x = Formatting.Print.ChangeX();
                
                vi =( .5*(acc*(Math.pow(time,2)))) / time;
               
                System.out.println("The Inital Velocity was "+vi+" meters per second.");
                break;
                
            //acceleration
            case 3:
                x = Formatting.Print.ChangeX();
                vi = Formatting.Print.VelocityI();
                
               acc = 2*((x-vi*time)/(Math.pow(time,2)));
                
               System.out.println("The acceleration is "+acc+" meters per second per seconds");
                break;
            default:
                System.out.println("Invalid Input");
                Input();
        }
    }
   
}
