public class Car {
    String Brand;
    String Model;
    String Color;
    int Year;
    int Speed;

    public String starts(){
        return "Started!";
    }
    public void accelerates(){
        Speed += 10;
    }
}
