package day15;

public class Goods {
    private String nameOfGood;
    private int sizeOfGood;
    private int count;

    public Goods(String nameOfGood, int sizeOfGood, int count) {
        this.nameOfGood = nameOfGood;
        this.sizeOfGood = sizeOfGood;
        this.count = count;
    }

    public String getNameOfGood() {
        return nameOfGood;
    }

    public int getSizeOfGood() {
        return sizeOfGood;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "\n" + nameOfGood + ", " + sizeOfGood + ", " + count;
    }
}
