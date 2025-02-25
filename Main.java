/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

/**
 *
 * @author L E N O V O
 */
public class Main {
    public static void main(String[] args) {
        ElectronicDevice fan = new Fan("Panasonic");
        ElectronicDevice tv = new Television("Samsung");
        ElectronicDevice washingMachine = new WashingMachine("LG");
        
        try {
            fan.turnOn();
            fan.operate();
            fan.turnOff();
            
            tv.turnOn();
            tv.operate();
            tv.turnOff();
            
            washingMachine.turnOn();
            washingMachine.operate();
            washingMachine.turnOff();
            
            // Simulasi exception
            if (Math.random() > 0.5) {
                throw new Exception("Terjadi kesalahan saat mengoperasikan perangkat elektronik!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program selesai dijalankan.");
        }
    }
}
