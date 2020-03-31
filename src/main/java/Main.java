
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Beth");
        names.add("Scott");
        names.add(0, "Bob");
        
        System.out.println(names.size());
        
        for (int i=0; i< names.size(); i++) {
            System.out.println(names.get(i));
        }
        
        System.out.println(names.toString());
        
        names.remove(2);
        
        System.out.println(names.toString());
        
        
        // array review
        double[] money = new double[10];
        money[0] = 1.50;
        money[1] = 2.0;
        
        for (int i=0; i< money.length; i++) {
            System.out.println(money[i]);
        }
        
        
        
        
        
        
        
        
        
        int[] months = { 1,2,3,4,5,6,7,8,9,10,11,12};
        
        months[0]++;
        months[0]*=5;
        ++months[0];
        
        int[] myNumbers = new int[50];
        
        Random rand = new Random();
        
        
        for (int i = 0; i<myNumbers.length; i++) {
            
            myNumbers[i] = rand.nextInt(1000000);
            
            System.out.println(myNumbers[i]); 
        }
        
        
        for (int number : myNumbers) {
            System.out.println(number);
        }
        
        
        // copy values from one array to another
        int[] array1 = { 1,2,3};
        int[] array2 = new int[array1.length];
        
        // array2 = array1; // invalid!
        
        for (int i=0; i<array1.length; i++) {
            array2[i] = array1[i];
        }
        
        
        // use copy integer array method
        int[] days = {1,3,4,5,7,8};
        
        int[] copiedDays = copyIntegerArray(days);
        
    }
    
    public static int[] copyIntegerArray(int[] arrayToCopyFrom) {
        int[] output = new int[arrayToCopyFrom.length];
        
        
        for (int i=0; i<arrayToCopyFrom.length; i++) {
            output[i] = arrayToCopyFrom[i];
        }
        
        return output;
    }
}
