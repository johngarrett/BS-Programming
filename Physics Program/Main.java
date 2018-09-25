/*
 * Program: AP CSP Create Task 
 * Version: 1.0
 * Early 2018
 * Compiler/Platform: Java 1.8, Mac OS X
 * 
 * Description:
 * This class contains the prompts for the user
 * 
 */
import java.io.*;
import java.util.*;

public class Main
{
    public static Scanner input = new Scanner(System.in);
    public static int choice;
    public static void main (String[] args)
    {
        boolean gameOver = false; 
        Kinematic kinObj = new Kinematic();
        while(gameOver == false)
        {
        kinObj.Init();
        System.out.print("Want to play again?");
        if(!input.next().equals("Yes"))
        {gameOver = true;}
        }
    }
        
    }
   
/*sample output

*/  
 