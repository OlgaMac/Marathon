package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int SALARY = 80;
    private Warehouse ware;
    private boolean isPayed;

    public Picker(Warehouse ware) {
        this.ware = ware;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += SALARY;
        ware.rechnerPickedOrders();
    }

    @Override
    public void bonus() {
        if (ware.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if(isPayed){
            System.out.println("Бонус уже начислен");
            return;
        }
        salary += 70000;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "заработная плата " + salary + " был выплачен бонус " + isPayed;
    }
}
