/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author L E N O V O
 */
abstract class ElectricalAppliance implements ElectronicDevice {
    private final String brand;
    private boolean isOn;

    public ElectricalAppliance(String brand) {
        this.brand = brand;
        this.isOn = false;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isOn() {
        return isOn;
    }


    public void turnOn() {
        isOn = true;
        System.out.println(brand + " is now ON.");
    }


    public void turnOff() {
        isOn = false;
        System.out.println(brand + " is now OFF.");
    }
}
