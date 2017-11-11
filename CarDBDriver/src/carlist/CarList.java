/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlist;
import car.*;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.comparingInt;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Stealth Pro
 */
public class CarList {
        /*
    You must have a CarList that maintains a sorted array of Car objects. 
    Use the compareTo method to sort Car objects. You may not use Arrays.sort 
    in this method.
    */
    int count;
    int size;
    
    Car[] carArray;
    
    // getters
    int getCount() { return count; }
    int getSize() { return size; }
    Car[] getCarArray () { return carArray; }
    
    //setters
    void setCount(int count) {
        this.count = count;
    }
    void setSize (int size) {
        this.size = size;
    }
    void setCarArray (Car[] carArray) {
        this.carArray = carArray;
    }
    
    
    // default constructor
    public CarList(String fileName) {
        count = 0;
        size = 5;
        setCarArray(new Car[size]);            // car array
        Car[] temp = new Car[size];    // temp car array
        
        // check if file opens properly
        File file = new File(fileName);
        Scanner in = null;
        try {
            in = new Scanner(file);
            in.useDelimiter(",");
             in.nextLine();
            
            // while the end of the file has not been reached, populate array
            while (in.hasNextLine()) {
                // if full, double size
                if (isFull()) {
                    temp = increaseSize(temp);
                    setCarArray(temp);
                    temp = new Car[size];
                    temp = getCarArray();
                }
                // populate carList
                // increase count
                temp[count] = new Car();
                temp[count].setModel(in.next());
                temp[count].setDispl(in.next());
                temp[count].setCylinders(in.next());
                temp[count].setTransmission(in.next());
                temp[count].setDrive(in.next());
                temp[count].setFuelType(in.next());
                temp[count].setCertRegion(in.next());
                temp[count].setStnd(in.next());
                temp[count].setStndDescription(in.next());
                temp[count].setUnderhoodID(in.next());
                temp[count].setVehicleClass(in.next());
                temp[count].setPollutionScore(in.nextInt());
                temp[count].setCityMPG(in.next());
                temp[count].setHwyMPG(in.next());
                temp[count].setCmbMPG(in.next());
                temp[count].setGreenhouseScore(in.nextInt());
                temp[count].setSmartWay(in.next());
                in.useDelimiter("");
                in.next();
                temp[count].setCombCO2(in.nextLine());
                in.useDelimiter(",");
                
                if(isGasCar(temp[count])) {
                    temp[count] = new GasCar(temp[count]);
                }
                else {
                    temp[count] = new GreenCar(temp[count]);
                }

                count++;
            }
            in.close(); 
            
            Arrays.sort(carArray, new SortCars());
            setCarArray(temp);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CarList.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            in.close(); 
            
            setCarArray(temp);
            //sortCars();
        }
    }
    
    // copy constructor
    CarList(CarList carList) {
        this.count = carList.count;
        this.size = carList.size;
        
        this.carArray = new Car[size];
        
        System.arraycopy( carList.carArray, 0, this.carArray, 0, size);
    }
    
    // Returns true if list is full
    boolean isFull() {
        return count == size;
    }
    
    // doubles the size of the carList array
    Car[] increaseSize (Car[] carArray) {
        this.size += 1;
        Car[] temp = new Car[size];
        System.arraycopy(carArray, 0, temp, 0, count);
        
        this.carArray = new Car[size];
        this.carArray = temp;
        
        return this.carArray;
    }
    
    /*
    takes as input a Car and inserts it into the array in sorted order. 
    If the array is full it will be resized to accommodate a new item. 
    */
    void addCar(Car car) {
        if (isFull()) {
            this.carArray = increaseSize(this.carArray);
        }
        
        Car[] temp = new Car[size];
        for (int i = 0; i < count; i++) {
            temp[i] = carArray[i];
        }
        temp[count] = car;
        
        carArray = temp;
        count++;
        //sortCars();
    }
    
    // Return false if fuelType is Hydrogen or Electricity.
    public boolean isGasCar(Car car) {
        // check if fuel is hydrogen or electricity
        String h = "Hydrogen";
        String e = "Electricity";
        return !(car.getFuelType().equals(h) || car.getFuelType().equals(e));
    }  
    
    /*
    toString - returns a String representation of the entire database. The 
    representation of a GasCar will look as follows: 
    Model: VOLVO XC 90 
    Class: standard SUV 
    Pollution Score: 9 
    MPG: 25 
    Cylinders: 4 
    The representation of a GreenCar will look as follows: 
    Model: FIAT 500e 
    Class: small car 
    Pollution Score: 10 
    Fuel Type: Electricity
    */
    public String toString() {
        StringBuffer dataBase = new StringBuffer();
        for (int i = 0; i < count; i++) {
            if(isGasCar(carArray[i])) {
            dataBase.append("Model: " + carArray[i].getModel() + " ");
            dataBase.append("Class: " + carArray[i].getVehicleClass() + " ");
            dataBase.append("Pollution Score: " + carArray[i].getPollutionScore() + " ");
            dataBase.append("MPG: " + carArray[i].getCityMPG() + " ");
            dataBase.append("Cylinders: " + carArray[i].getCylinders() + "\n");
            }
            else if(!isGasCar(carArray[i])) {
                dataBase.append("Model: " + carArray[i].getModel() + " ");
                dataBase.append("Class: " + carArray[i].getVehicleClass() + " ");
                dataBase.append("Pollution Score: " + carArray[i].getPollutionScore() + " ");
                dataBase.append("Fuel Type: " + carArray[i].getFuelType() + "\n");
            }
        }
        return dataBase.toString();
    }
    
    /*
    toStringGreenCars - returns a String representation of the GreenCar objects
    in the list where the representation for each Car is of the 
    following format: 
    Model: BMW i3 BEV 
    Fuel Type: Electricity. 
    Note, the format for this method is different than that of the toString 
    method.
    */
    public String toStringGreenCars() {
        StringBuffer dataBase = new StringBuffer();
        for (int i = 0; i < count; i++) {
            if(!isGasCar(carArray[i])) {
                dataBase.append("Model: " + carArray[i].getModel() + " ");
                dataBase.append("Fuel Type: " + carArray[i].getFuelType() + "\n");
            }
        }
        return dataBase.toString();
    }
    
    /*
    avgMpg - takes no parameters and returns the average MPG across all 
    GasCar objects.
    */
    
    /*
    avgMpgByPartialModel - takes as input a String with a partial model 
    (for example, "Subaru") and returns the average MPG for all cars with a 
    model containing the partial model query String. You may use the String 
    contains method in your solution for this method.
    */
    
    /*
    findClassesByCylinders - takes as input an int specifying number of 
    cylinders and returns a String[] containing the vehicle classes with 
    models that have the specified number of cylinders. For full credit, 
    the String[] will have no repeated elements (each class will only appear 
    once) and the length must be large enough to accommodate only the number of
    valid elements. The resulting array will be sorted and you may use 
    Arrays.sort for this purpose.
    */
    
    /*
    findModelsByClassAndMpg - takes as input a target vehicle class and a 
    minimum MPG and returns a String[] containing the models of all vehicles 
    of the specified class that have at least the specified combined MPG. The 
    String[] may have repeated elements if the same model appears twice in the 
    dataset, but the the length must be large enough to accommodate only the 
    number of valid elements. The resulting array will be sorted and you may 
    use Arrays.sort for this purpose.
    */
}

/*
    Car objects are sorted first by pollution score. 
    If two Car objects have the same pollution score 
    then they will be sorted by model.
    If two Car objects are equal according to compareTo they will be 
    sorted in the list in the reverse order in which they appear in the 
    original data file.
*/
class SortCars implements Comparator<Car> {
    // Car objects are sorted first by pollution score. 
    public int compare(Car a, Car b) {
        return a.getPollutionScore() - b.getPollutionScore();
    }
}

class SortByModel implements Comparator<Car> {
    // If two Car objects have the same pollution score, sort by model
    public int compare(Car a, Car b) {
        return a.getModel().compareTo(b.getModel());
    }
}