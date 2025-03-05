public class Phone {
    String number;
    int model;
    int weight;
    int price;


    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public int getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public Phone(int price, int weight, int model) {
        this.price = price;
        this.weight = weight;
        this.model = model;
        this.number = number;
    }
}
