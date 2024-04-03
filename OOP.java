public class OOP{
    public String name, model, color, engine;
    public OOP(){
        name = "Toyota";
        model = "2013 CRV";
        color = "Gray";
        engine = "V8";
        details();
    }


    public OOP(String name){
        System.out.println("The name of the car is "+name);
    }
    public OOP(String name, String color){
        System.out.println("The name of the car is "+name+" and the color is "+color);
    }

    public OOP(String name, String color, int year ){
        System.out.println("The name of the car is "+name+" and the color is "+color+" in the year "+year);
    }
    public void details(){
        System.out.println(name+ " is the "+model+" model. The color is "+color+" and the engine is "+engine);
        startengine();
    }
    
    public void startengine(){
        System.out.println("Engine started press turtle to move.");
    }
    public static void main(String[] args){
        OOP ca = new OOP();
        ca.details();
        OOP ca2 = new OOP("Mecedes", "gold", 2024);
        // ca.name="Lambogini Urus";
        // System.out.println(ca.name);
    }
}