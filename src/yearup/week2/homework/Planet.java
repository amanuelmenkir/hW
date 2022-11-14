package yearup.week2.homework;

public class Planet implements Calculator{

protected String myStar;
private String planetName;
private double planetRadius;


public String getMyStar(){
    return this.myStar;
    }


    public static void main(String[]arg){

    }

    @Override
    public double calculateArea(double length, double width) {
        return 0;
    }

    @Override
    public double calculateSum(double value1, double value2) {
        this.planetRadius = value1 * value2 * 3.14;
        return 0;
    }

    @Override
    public double calculateVolume(double length, double width, double height) {
        return 0;
    }
}
