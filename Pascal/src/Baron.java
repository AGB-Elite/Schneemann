import GLOOP.*;

public class Baron extends Schneemann {

    private GLZylinder zylinder1;
    private GLZylinder zylinder2;

    public Baron(double pRadius, String pTextur, double pX, double pZ) {
        super(pRadius, pTextur, pX, pZ);
        
        zylinder1 = new GLZylinder(pX, this.gibKugelY("3") + (this.gibKugelRadius("3")*0.75), pZ, this.gibKugelRadius("3"), pRadius/10);
        zylinder1.setzeDrehung(90,0,0);
        zylinder1.setzeFarbe(0,0,0);
        zylinder2 = new GLZylinder(pX, zylinder1.gibY() + (pRadius*0.4), pZ, this.gibKugelRadius("3")*0.75, pRadius*0.8);
        zylinder2.setzeDrehung(90,0,0);
        zylinder2.setzeFarbe(0,0,0);
    }
}
