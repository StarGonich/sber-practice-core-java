package Classes;

public class PizzaOrder {
    public enum Size {
        SMALL, MEDIUM, BIG

    }

    private String name;
    private Size size;
    private boolean sauce;
    private String address;
    private boolean isAccepted;

    public PizzaOrder(String name, Size size, boolean sauce, String address) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.address = address;
    }

    public void order() {
        if (isAccepted) {
            System.out.println("Заказ принят");
        } else {
            isAccepted = true;
            switch (size) {
                case SMALL:
                    System.out.print("Маленькая");
                    break;
                case MEDIUM:
                    System.out.print("Средняя");
                    break;
                case BIG:
                    System.out.print("Большая");
                    break;
            }
            System.out.print(" пицца «" + name + "»");
            if (sauce) {
                System.out.print(" с соусом");
            }
            System.out.println(" на адрес " + address + ".");
        }
    }

    public void cancel() {
        if (isAccepted) {
            System.out.println("Заказ отменён");
        } else {
            System.out.println("Заказ не был принят");
        }
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public boolean getSauce() {
        return sauce;
    }

    public String getAddress() {
        return address;
    }

    public boolean getIsAccepted() {
        return isAccepted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean setIsAccepted() {
        return isAccepted;
    }

    @Override
    public String toString() {
        return "name = " + name + ", size = " + size + ", sauce = " + true + ", address = " + address + ", isAccepted = " + isAccepted;
    }

    public static void main(String[] args) {
        PizzaOrder po = new PizzaOrder("Аль-Капчоне", Size.BIG, true, "Ярославская 101");
        po.order();
        po.order();
        po.cancel();
        System.out.println(po.toString());
    }
}
