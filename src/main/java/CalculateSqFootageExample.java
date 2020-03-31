
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class CalculateSqFootageExample {
    public static void main(String[] args) {
       
        ArrayList<Rectangle> rooms = new ArrayList<Rectangle>();
        
        rooms.add(new Rectangle(100, 200));
        rooms.add(new Rectangle(500,245.2));

        double sqFootage = GetSquareFootageOfHouse(rooms);
        
        System.out.println(sqFootage);
        
        
    }
    
    
    public static double GetSquareFootageOfHouse(ArrayList<Rectangle> rooms) {
        
        double output = 0;
        
//        for (int i=0; i<rooms.size(); i++) {
//            output += rooms.get(i).getArea();
//        }
        
        for (Rectangle room : rooms) {
            output += room.getArea();
        }
        
        return output;        
    }
}
