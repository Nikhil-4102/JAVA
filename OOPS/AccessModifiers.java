package oops;

public  class AccessModifiers {

    public  class Car {
        public String color ;
        public String model ;
        private double fuelLevel ;
        private long costOfPurchase ;

        public Car() {

        }

        public Car(String color, String model, double fuelLevel, long costOfPurchase) {
            this.color = color;
            this.model = model;
            this.fuelLevel = fuelLevel;
            this.costOfPurchase = costOfPurchase;
        }



        @Override
        public String toString() {
            return "Car [color=" + color + ", model=" + model + ", fuelLevel=" + fuelLevel + ", costOfPurchase="
                    + costOfPurchase + "]";
        }

       
    }

    public  static class AccessTest {
        public static void main(String[] args) {
            Car car = new Car();
            car.color = "red";
            car.model= "Swift";
            car.fuelLevel= 3 ;
            car.costOfPurchase = 450000;
            System.out.println(car);

            Car newCar = new Car("black" , "BMW" , 1,30000);
            System.out.println(newCar);

        }
    }
}
