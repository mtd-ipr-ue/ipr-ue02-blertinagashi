import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        
        int radius = 4;

        System.out.println("Geben Sie die X-Koordinate ein");
        double x = In.readDouble();

        System.out.println("Geben Sie die Y-Koordinate ein");
        double y = In.readDouble();

        double distance = Math.sqrt((x*x) + (y*y));

        if (distance <= radius && x > 0 && y > 0) {
            System.out.println("Es befindet sich im grünen Bereich.");
        } else {
            System.out.println("Es befindet sich nicht im grünen Bereich.");
        }


    }

}
