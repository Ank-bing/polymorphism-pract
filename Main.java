package enterprise.ankur;
class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }



    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine() {
        return "Car ->> startEngine()";
    }
    public String accelerate() {
        return "Car ->> accelerate()";
    }
    public String brake() {
        return "Car ->> brake()";
    }
}
class Maruti extends Car {
    public Maruti(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Maruti ->> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Maruti ->> accelerate()";
    }

    @Override
    public String brake() {
        return "Maruti ->> brake()";
    }
}
 class Tata extends Car {
    public Tata(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "tata ->> startEngine()";
    }

    @Override
    public String accelerate() {
        return "tata ->> accelerate()";
    }

    @Override
    public String brake() {
        return "tata ->> brake()";
    }
}
 class Hyundai extends Car {
    public Hyundai(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "hyundai ->> startEngine()";
    }

    @Override
    public String accelerate() {
        return "hyundai ->> accelerate()";
    }

    @Override
    public String brake() {
        return "hyundai ->> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	Car car = new Car(4,"CAR");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

    Maruti maruti = new Maruti(5,"alto");
        System.out.println(maruti.startEngine());
        System.out.println(maruti.accelerate());
        System.out.println(maruti.brake());

    Tata tata = new Tata(7,"safari");
        System.out.println(tata.startEngine());
        System.out.println(tata.accelerate());
        System.out.println(tata.brake());

    Hyundai hyundai = new Hyundai(6,"i 20");
        System.out.println(hyundai.startEngine());
        System.out.println(hyundai.accelerate());
        System.out.println(hyundai.brake());
    }

}
