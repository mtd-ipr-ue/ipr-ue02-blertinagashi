import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Geben Sie die erste Zahl an");
        int Zahl1 = In.readInt();

        Out.println("Geben Sie die zweite Zahl an");
        int Zahl2 = In.readInt();

        Out.println("Geben Sie die dritte Zahl an");
        int Zahl3 = In.readInt();

        if (Zahl1 > Zahl2 && Zahl1 > Zahl3) {
            Out.println("Maximum beträgt:"+ Zahl1);
        }
            else if (Zahl2 > Zahl1 && Zahl2 > Zahl3) {
                Out.println("Maxmimum beträgt:" + Zahl3);
            }

                else {
                    Out.println("Maximum beträgt:" + Zahl3);
                
                }

    
    
    }
}
