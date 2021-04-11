package day11.task1;

import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        Process(picker);
        System.out.println(picker);
        System.out.println(warehouse);
        Process(courier);
        System.out.println(courier);
        System.out.println(warehouse);

        Warehouse warehouseTwo = new Warehouse();
        Picker pickerTwo = new Picker(warehouseTwo);
        Courier courierTwo = new Courier(warehouseTwo);
        pickerTwo.doWork();
        System.out.println(pickerTwo);
        System.out.println(warehouseTwo);
        courierTwo.doWork();
        System.out.println(courierTwo);
        System.out.println(warehouseTwo);
    }

    public static void Process(Worker worker) {
        for (int i = 1; i <= 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
