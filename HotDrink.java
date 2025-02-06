public class HotDrink extends BottleOfWater {

    private int temp;

    public HotDrink(String name, int price, int volume) {
        super(name, price, volume);
    }

    public HotDrink(String name, int price, int volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "temp=" + temp + ", volume=" + getVolume() + ", name=" + getName() +
                '}';
    }
}
