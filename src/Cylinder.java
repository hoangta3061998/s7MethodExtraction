public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getArea(radius);
        double perimeter = getPerimetter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    private static double getArea(int radius){
        double area = Math.PI * radius *radius;
        return area;
    }
    private static double getPerimetter(int radius){
        double perimetter = Math.PI * 2 * radius;
        return perimetter;
    }
}
