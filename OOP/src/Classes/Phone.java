package Classes;

public class Phone {
    private String number, model;
    private double weight;

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " (" + number + ")");
    }

    public void sendMessage(String[] numbers) {
        System.out.println("Номера телефонов:");
        for (String s: numbers) {
            System.out.println(s);
        }
    }

    @Override
    public String toString() {
        return "number = " + number + ", model = " + model + ", weight = " + weight;
    }

    public static void main(String[] args) {
        Phone ph = new Phone("+79005368966", "Redmi 9", 230.15);
        ph.receiveCall("Алексей");
        System.out.println(ph.getNumber());
        Phone ph2 = new Phone("+79231230098", "Redmi 10");
        Phone ph3 = new Phone();
        ph.receiveCall("Алексей", "+71234567890");
        String[] nums = {"+79001234567", "+79062397845", "+79999999999"};
        ph.sendMessage(nums);
        System.out.println(ph.toString());
        System.out.println(ph2.toString());
        System.out.println(ph3.toString());
    }
}
