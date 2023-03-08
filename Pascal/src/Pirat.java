import GLOOP.*;

public class Pirat extends Schneemann {
    public Pirat(double pRadius, String pTextur, double pX, double pZ) {
        super(pRadius, pTextur, pX, pZ);

        GLTorus augenklappe = new GLTorus(pX, this.gibKugelY("3"), pZ, this.gibKugelRadius("3"), pRadius * 0.05);
        augenklappe.setzeFarbe(0, 0, 0);
        augenklappe.setzeDrehung(35, 55, 0);

        this.sichtbarkeitAugeLinks(false);
    }
}
