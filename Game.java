import java.util.Scanner;
class Car{
    public int gear;
    public boolean status;
    public String color, trafficator, owner, location;
    public Scanner scanner;
   public  Car(){
        gear = 0;
        color = "Black";
        trafficator="Straight";
        owner = "Johnson Smith";
        location="Lagos";
        status=true;
        scanner= new Scanner(System.in);
        details();
    }
    // public car(int gear){

    // }
    public void details(){
        System.out.println("This is 5 gears engine, it is owned by "+ owner+" and located in "+location+" it is "+color+" in color");
        startengine();
    }
    public void startengine (){
        System.out.println("The car is started and ready for move. \n please select gear 1");
        gear = scanner.nextInt();
        if(gear==1){
            driveCar();
        }else{
            System.out.println("The car cannot take off select gear. Please select gear 1");
            startengine();
        }
    }
    public void driveCar(){
        System.out.println("This is moving at gear "+gear+ " and is moving " + trafficator+ " direction. \n press C to change gear \n D change direction \n P. pack");
        String user = scanner.nextLine();
        if(user.toUpperCase().equals("C")){
            changeGear();
        }else if(user.toUpperCase().equals("D")){
            changeDirection();
        }else if (user.toUpperCase().equals("P")){
            packcar();
        }else{
            System.out.println("Invalid selection");
            driveCar();
        }
    }
    public void changeGear()    {
        System.out.println("Select the new gear");
        gear= scanner.nextInt();
        driveCar();
    }

    public void changeDirection(){
        System.out.println("Select the new direction");
        trafficator = scanner.nextLine();
        driveCar();
    }

    public void packcar(){
        System.out.println("This car is resetting your gear back to neutral...\n The car has packed\n The application has exited");
        System.exit(0);
    }

}
public class Game{
    public static void main(String[] args) {
        Car cr = new Car();
    }
}
 