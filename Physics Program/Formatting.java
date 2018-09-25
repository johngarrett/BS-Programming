

 import java.io.*; import java.util.*;   
public class Formatting
{
    public static void Divider(){
        System.out.println("\n-----------------------------------\n");
    }
    public static void ClearCons(){
         System.out.println("\f");
    }
    public static void Header(String header){
        System.out.println("-----"+header+"-----" + "\n\n");//change later
    }
  
    public static class Print
    {
        public static Scanner input = new Scanner(System.in);
        public static double Acceleration()
        {
           System.out.print("Enter Acceleration(in m/s/s): ");
           return (input.nextDouble());
        }
        public static double ChangeX()
        {
             System.out.print("Enter Change in X (in meters): ");
             return (input.nextDouble());
        }
        public static double VelocityI()
        {
             System.out.print("Enter Velocity Inital: ");
             return (input.nextDouble());
        }
        public static double Velocity()
        {
             System.out.print("Enter Velocity: ");
             return (input.nextDouble());
        }
        public static double VelocityF()
        {
             System.out.print("Enter Velocity Final: ");
             return (input.nextDouble());             
        }
        public static double Time()
        {
             System.out.print("Time: ");
             return (input.nextDouble());                          
        }
        public static double AvgV()
        {
             System.out.print("Enter Avg Velocity:");  
             return (input.nextDouble());                                       
        }
    }
}