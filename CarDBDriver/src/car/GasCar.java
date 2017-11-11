/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Kevin Beltran
 */
public class GasCar extends Car {
    /**************************************************************************
    A GasCar is any car that does not have a Fuel of Hydrogen or Electricity. 
    Hybrid cars (e.g., Fuel Gasoline/Electricity) are considered type GasCar. 
    GasCar must have at least the following properties: 
    numberCylinders (column Cyl) and 
    mpg (column Cmb MPG). 
    **************************************************************************/
    public String numberCylinders;     // column Cyl
    public int mpg;                 // column Cmb MPG
    
    // getters
    public String getNumberCylinders() {return numberCylinders;}
    public int getMPG() {return mpg;}
    
    // setters
    public void setNumberCylinders(String numberCylinders) {
        this.numberCylinders = numberCylinders;
    }
    public void setMPG(int mpg) {
        this.mpg = mpg;
    }
    
    // default constructor
    public GasCar() {
        String numberCylinders;     // column Cyl
        int mpg;                 // column Cmb MPG
    }
    
    // base class constructor
    public GasCar(Car baseCar) {
        GasCar gasCar = new GasCar();
        model = (baseCar.getModel());
        displ = baseCar.getDispl();
        cylinders = baseCar.getCylinders();
        transmission = baseCar.getTransmission();
        drive = baseCar.getDrive();
        fuelType = baseCar.getFuelType();
        certRegion = baseCar.getCertRegion();
        stnd = baseCar.getStnd();
        stndDescription = baseCar.getStndDescription();
        underhoodID = baseCar.getUnderhoodID();
        vehicleClass = baseCar.getVehicleClass();
        pollutionScore = baseCar.getPollutionScore();
        cityMPG = baseCar.getCityMPG();
        hwyMPG = baseCar.getHwyMPG();
        cmbMPG = baseCar.getCmbMPG();
        greenhouseScore = baseCar.getGreenhouseScore();
        smartWay = baseCar.getSmartWay();
        combCO2 = baseCar.getCombCO2();
        
        this.numberCylinders = gasCar.getCylinders();
        this.mpg = cmbMPG;
    }
}
