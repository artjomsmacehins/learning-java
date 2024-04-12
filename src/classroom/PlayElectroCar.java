package classroom;

public class PlayElectroCar {
    public static void main(String[] args) {

        ElectroCar tesla = new ElectroCar("Model S", "black");
        System.out.println(tesla.getModelName());
        System.out.println(tesla.getColor());

        System.out.println(tesla);
        tesla.drive();
        tesla.drive();
        tesla.drive();
        tesla.drive();
        tesla.drive();
        System.out.println(tesla.getCurrentEnergy());
        tesla.energy();
        tesla.drive();

        tesla.drive(5);
        tesla.drive(4);
        tesla.drive(4);
        tesla.drive(4);
        System.out.println(tesla.getCurrentEnergy());

        tesla.charge(4);
        System.out.println(tesla.getCurrentEnergy());;
        tesla.charge(1);
        System.out.println(tesla.getCurrentEnergy());
        tesla.charge(20);
        System.out.println(tesla.getCurrentEnergy());
    }
}
