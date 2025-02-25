/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author L E N O V O
 */
class WashingMachine implements ElectronicDevice {
    private String brand;
    private boolean isOn;

    public WashingMachine(String brand) {
        this.brand = brand;
        this.isOn = false;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(brand + " is now ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(brand + " is now OFF.");
    }

    @Override
    public void operate() {
        if (isOn) {
            System.out.println(brand + " is washing clothes.");
        } else {
            System.out.println("Please turn on " + brand + " first.");
        }
    }
}

