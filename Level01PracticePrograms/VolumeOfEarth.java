/*Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => (4/3) * pi * r^3____ and cubic miles is ____*/
public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusOfEarth = 6378;
        double pi = 3.14159;
        double volumeKm = (4.0 / 3) * pi * Math.pow(radiusOfEarth, 3);
        double volumeMiles = volumeKm * 0.239913;

        System.out.printf("The volume of Earth in cubic kilometers is " + volumeKm+ " and cubic miles is " + volumeMiles);
    }
}
		