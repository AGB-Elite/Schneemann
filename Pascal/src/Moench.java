import GLOOP.*;

public class Moench extends Schneemann {
    
    private GLZylinder zylinder1;
    
    
    public Moench(double pRadius, String pTextur, double pX, double pZ) {
        super(pRadius, pTextur, pX, pZ);
        
        zylinder1 = new GLZylinder(pX, this.gibKugelY("3") + (this.gibKugelRadius("3")*0.75), pZ, this.gibKugelRadius("3"), pRadius/10);
        zylinder1.setzeDrehung(90,0,0);
        zylinder1.setzeFarbe(0,0,0);
    }
}
