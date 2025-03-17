class vehicle {
    public void details1() {
        System.out.println("Car model is BMW");
    }
}

class Cars extends vehicle {
    public void price() {
        System.out.println("Car price is 40 Lac");
    }
}

public class Vehicle_inheritance {
    public static void main(String[] args) {
        vehicle carObj = new vehicle();

        Cars carsObj = new Cars();
        carsObj.price();
        carObj.details1();

    }
}