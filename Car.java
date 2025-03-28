public class Car {
    private String id;

    public Car(String id) {
        this.id = id;
        System.out.println("Class Car");
    }

    public void vehicleType() {
        System.out.println("Vehicle Type: Car");
    }

    public String getId() {
        return id;
    }
}

class SEAT extends Car {
    private String model;

    public SEAT(String id, String model) {
        super(id);
        this.model = model;
        System.out.println("Class SEAT");
    }

    public void brand() {
        System.out.println("Brand: SEAT");
    }

    public void speed() {
        System.out.println("Max: 120Kmph");
    }

    public String getModel() {
        return model;
    }
}

class Arona extends SEAT {
    private String color;
    private int km;

    public Arona(String id, String model, String color, int km) {
        super(id, model);
        this.color = color;
        this.km = km;
        System.out.println("Class Arona");
    }

    public String getColor() {
        return color;
    }

    public int getKm() {
        return km;
    }

    public static void main(String[] args) {
        Arona myCar = new Arona("12345", "SEAT Arona", "Red", 15000);
        myCar.vehicleType(); // Mètode de la classe

    }
}