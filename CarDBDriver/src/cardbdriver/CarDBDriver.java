/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardbdriver;
import car.*;
import carlist.*;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Stealth Pro
 */
public class CarDBDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Build a CarList object from the file cars.csv.
        String fileName;
        fileName = "D:/Box/Programming/Learning/Java/Project3/cars.csv";
        CarList carList = new CarList(fileName);
        
        // Print "All Cars:" followed by a newline.
        System.out.println("All cars:");
        // Print the result of calling toString on the CarList.
        System.out.println(carList.toString());
        
        // Print "Green Cars - Fuel Type:" followed by a newline.
        System.out.println("Green Cars - Fuel Type:");
        // Print the result of calling toStringGreenCars on the CarList.
        System.out.println(carList.toStringGreenCars());
        
        /* *********************************************************************
        * Print "Average MPG All:" followed by the result of calling avgMpg 
        * on the CarList followed by a newline. The result should be displayed 
        * with exactly two digits after the decimal point.
        ***********************************************************************/
        
        /* *********************************************************************
        * Print "Average MPG Subaru:" followed by the result of calling 
        * avgMpgByPartialModel("SUBARU") on the CarList followed by a newline.
        * The result should be displayed with exactly two digits after the 
        * decimal point.
        ***********************************************************************/
        /***********************************************************************
        * Print "Average MPG Toyota:" followed by the result of calling 
        avgMpgByPartialModel("TOYOTA") on the CarList followed by a newline. 
        The result should be displayed with exactly two digits after the 
        decimal point.
        ***********************************************************************/
        
        /***********************************************************************
        * Print "Average MPG Ferrari:" followed by the result of calling 
        * avgMpgByPartialModel("FERRARI") on the CarList followed by a newline. 
        * The result should be displayed with exactly two digits after the 
        * decimal point.
        ***********************************************************************/
        
        /***********************************************************************
        * Print "Vehicle Classes with 4-Cylinder Cars:" followed by a newline 
        * followed by the result of calling findClassesByCylinders(4) on the 
        * CarList. For each item in the list returned, print a tab followed by 
        * the item followed by a newline.
        ***********************************************************************/
        
        /***********************************************************************
        * Print "Vehicle Classes with 6-Cylinder Cars:" followed by a newline 
        * followed by the result of calling findClassesByCylinders(6) on the 
        * CarList. For each item in the list returned, print a tab followed by 
        * the item followed by a newline.
        ***********************************************************************/
        
        /***********************************************************************
        * Print "Small SUVs with MPG > 22:" followed by a newline followed by 
        * the result of calling findModelsByClassAndMpg("small SUV", 22) on the
        * CarList. For each item in the list returned, print a tab followed by 
        * the item followed by a newline.
        ***********************************************************************/
        
        /***********************************************************************
        *  Print "Small Cars with MPG > 35:" followed by a newline followed by 
        * the result of calling findModelsByClassAndMpg("small car", 35) on the 
        * CarList. For each item in the list returned, print a tab followed by 
        * the item followed by a newline.
        ***********************************************************************/
        
    }
    
}
