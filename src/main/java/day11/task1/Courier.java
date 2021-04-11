package day11.task1;

public class Courier implements Worker{
    private int salary;
    private static final int SALARY = 100;
    private Warehouse ware1;
    private boolean isPayed;

    public Courier(Warehouse ware1) {
        this.ware1 = ware1;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += SALARY;
        ware1.rechnerDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (ware1.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if(isPayed){
            System.out.println("Бонус уже начислен");
            return;
        }
        salary += 50000;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "заработная плата " + salary + " был выплачен бонус " + isPayed;
    }
}
