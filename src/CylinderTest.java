class CylinderTest {
    public static void main(String[] args) {
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;
        double result = Cylinder.getVolume(radius,height);
        System.out.println(expected==result);
    }
}