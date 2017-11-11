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
public class GreenCar extends Car {
    /**************************************************************************
    A GreenCar is a car with Fuel either Hydrogen or Electricity. 
    GreenCar will have the property fuelType (column Fuel). 
    This will either be "Hydrogen" or "Electricity".
    **************************************************************************/
    public String fuelType;         // column Fuel
    
    // getters
    public String getFuelType() {return fuelType;}
    
    // setters
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
    // default constructor
    public GreenCar() {
        String fuelType;         // column Fuel
    }
    
    // base class constructor
    public GreenCar(Car baseCar) {
        GreenCar greenCar = new GreenCar();
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
        
        this.fuelType = baseCar.getFuelType();
    }
}
