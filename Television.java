/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author L E N O V O
 */
class Television extends ElectricalAppliance {
    public Television(String brand) {
        super(brand);
    }

    public void operate() {
        if (isOn()) {
            System.out.println(getBrand() + " is displaying channels.");
        } else {
            System.out.println("Please turn on " + getBrand() + " first.");
        }
    }
}
