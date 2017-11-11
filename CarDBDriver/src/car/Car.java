/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Stealth Pro
 */
public class Car {
    public String model;           // column Model
    public String displ;           //
    public String cylinders;
    public String transmission;
    public String drive;
    public String fuelType;
    public String certRegion;
    public String stnd;
    public String stndDescription;
    public String underhoodID;
    public String vehicleClass;    // column Veh Class
    public int pollutionScore;     // column Air Pollution Score
    public int cityMPG;
    public int hwyMPG;
    public int cmbMPG;
    public int greenhouseScore;
    public String smartWay;
    public int combCO2;
    
    // default constructor
    public Car () {
        model = "default";           // column Model
        String displ = "default";           //
        String cylinders = "default";
        String transmission = "default";
        String drive = "default";
        String fuelType = "default";
        String certRegion = "default";
        String stnd = "default";
        String stndDescription = "default";
        String underhoodID = "default";
        String vehicleClass = "default";    // column Veh Class
        int pollutionScore = 0;     // column Air Pollution Score
        int cityMPG = 0;
        int hwyMPG = 0;
        int cmbMPG = 0;
        int greenhouseScore = 0;
        String smartWay = "default";
        int combCO2 = 0;
    }
    
    public Car(Car baseCar) {
        this.model = (baseCar.getModel());
        this.displ = baseCar.getDispl();
        this.cylinders = baseCar.getCylinders();
        this.transmission = baseCar.getTransmission();
        this.drive = baseCar.getDrive();
        this.fuelType = baseCar.getFuelType();
        this.certRegion = baseCar.getCertRegion();
        this.stnd = baseCar.getStnd();
        this.stndDescription = baseCar.getStndDescription();
        this.underhoodID = baseCar.getUnderhoodID();
        this.vehicleClass = baseCar.getVehicleClass();
        this.pollutionScore = baseCar.getPollutionScore();
        this.cityMPG = baseCar.getCityMPG();
        this.hwyMPG = baseCar.getHwyMPG();
        this.cmbMPG = baseCar.getCmbMPG();
        this.greenhouseScore = baseCar.getGreenhouseScore();
        this.smartWay = baseCar.getSmartWay();
        this.combCO2 = baseCar.getCombCO2();
    }
    
    public String getModel() {return model;}
    public String getDispl() {return displ;}
    public String getCylinders() {return cylinders;}
    public String getTransmission() {return transmission;}
    public String getDrive() {return drive;}
    public String getFuelType() {return fuelType;}
    public String getCertRegion() {return certRegion;}
    public String getStnd() {return stnd;}
    public String getStndDescription() {return stndDescription;}
    public String getUnderhoodID() {return underhoodID;}
    public String getVehicleClass() {return vehicleClass;}
    public int getPollutionScore() {return pollutionScore;}
    public int getCityMPG() {return cityMPG;}
    public int getHwyMPG() {return hwyMPG;}
    public int getCmbMPG() {return cmbMPG;}
    public int getGreenhouseScore() {return greenhouseScore;}
    public String getSmartWay() {return smartWay;}
    public int getCombCO2() {return combCO2;}
    
    // setters
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setDispl(String displ) {
        this.displ = displ;
    }
    
    public void setCylinders(String cylinders) {
        this.cylinders = cylinders;
    }
    
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    
    public void setDrive(String drive) {
        this.drive = drive;
    }
    
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
    public void setCertRegion(String certRegion) {
        this.certRegion = certRegion;
    }
    
     public void setStnd(String stnd) {
        this.stnd = stnd;
    }
    
    public void setStndDescription(String stndDescription) {
        this.stndDescription = stndDescription;
    }
    
    public void setUnderhoodID(String underhoodID) {
        this.underhoodID = underhoodID;
    }
    
    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }
    
    public void setPollutionScore(int pollutionScore) {
        this.pollutionScore = pollutionScore;
    }
    
    public void setCityMPG(String cityMPG) {
        Character ch2 = new Character('/');
        for (int i = 0; i < cityMPG.length(); i++) {
            Character ch1 = cityMPG.charAt(i);
            if (ch1.compareTo(ch2) == 0) {
                cityMPG = cityMPG.substring(0, i);
                break;
            }
        }
        this.cityMPG = Integer.parseInt(cityMPG);
    }
    
    public void setHwyMPG(String hwyMPG) {
        Character ch2 = new Character('/');
        for (int i = 0; i < hwyMPG.length(); i++) {
            Character ch1 = hwyMPG.charAt(i);
            if (ch1.compareTo(ch2) == 0) {
                hwyMPG = hwyMPG.substring(0, i);
                break;
            }
        }
        this.hwyMPG = Integer.parseInt(hwyMPG);
    }
    
    /**************************************************************************
    For cars with two values for Cmb MPG 
    the value used should be the first value (to the left of the "/").
    **************************************************************************/
    public void setCmbMPG(String cmbMPG) {
        Character ch2 = new Character('/');
        for (int i = 0; i < cmbMPG.length(); i++) {
            Character ch1 = cmbMPG.charAt(i);
            if (ch1.compareTo(ch2) == 0) {
                cmbMPG = cmbMPG.substring(0, i);
                break;
            }
        }
        this.cmbMPG = Integer.parseInt(cmbMPG);
    }
    
    public void setGreenhouseScore(int greenhouseScore) {
        this.greenhouseScore = greenhouseScore;
    }
    
    public void setSmartWay(String smartWay) {
        this.smartWay = smartWay;
    }
    
    public void setCombCO2(String combCO2) {
        Character ch2 = new Character('/');
        for (int i = 0; i < combCO2.length(); i++) {
            Character ch1 = combCO2.charAt(i);
            if (ch1.compareTo(ch2) == 0) {
                combCO2 = combCO2.substring(0, i);
                break;
            }
        }
        this.combCO2 = Integer.parseInt(combCO2);
    }
}

