/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author L E N O V O
 */
class Fan extends ElectricalAppliance {
    public Fan(String brand) {
        super(brand);
    }

    public void operate() {
        if (isOn()) {
            System.out.println(getBrand() + " is spinning to cool the air.");
        } else {
            System.out.println("Please turn on " + getBrand() + " first.");
        }
    }
}

