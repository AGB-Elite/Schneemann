import GLOOP.*;

public class Schneemann {
    private GLKugel kugel1;
    private GLKugel kugel2;
    private GLKugel kugel3;
    private GLKugel augeLinks;
    private GLKugel augeRechts;
    private GLKegel nase;
    private double radius;
    private double radius2;
    private double radius3;
    private double kugel1Y;
    private double kugel2Y;
    private double kugel3Y;
    private double height;
    private double augenZ;

    public Schneemann(double pRadius, String pTextur, double pX, double pZ) {
        radius = pRadius;
        radius2 = radius * 0.75;
        radius3 = radius * 0.5;
        kugel1Y = radius / 2;
        kugel2Y = radius * 1.75;
        kugel3Y = radius * 2.65;

        height = Math.cos(68) * radius3;
        augenZ = Math.sin(68) * radius3;

        kugel1 = new GLKugel(pX, kugel1Y, pZ, radius);
        kugel1.setzeTextur(pTextur);
        kugel2 = new GLKugel(pX, kugel2Y, pZ, radius2);
        kugel2.setzeTextur(pTextur);
        kugel3 = new GLKugel(pX, kugel3Y, pZ, radius3);
        kugel3.setzeTextur(pTextur);

        nase = new GLKegel(pX, this.gibKugelY("3"), radius3 - (radius / 10) - pZ, radius / 15, radius / 4);
        nase.drehe(180, 0, 0, pX, this.gibKugelY("3"), radius3);
        nase.setzeFarbe(1, 0.6, 0.2);

        augeLinks = new GLKugel((-radius / 10) + pX, this.gibKugelY("3") + height, -augenZ + pZ, radius / 20);
        augeLinks.setzeFarbe(0, 0, 0);

        augeRechts = new GLKugel((radius / 10) + pX, this.gibKugelY("3") + height, -augenZ + pZ, radius / 20);
        augeRechts.setzeFarbe(0, 0, 0);
    }

    public void sichtbarkeitAugeLinks(boolean pSichtbarkeit) {
        augeLinks.setzeSichtbarkeit(pSichtbarkeit);
    }

    public double gibKugelRadius(String kugelIndex)
    {
        if ("1".equals(kugelIndex)) {
            return radius;
        } else if ("2".equals(kugelIndex)) {
            return radius2;
        } else if ("3".equals(kugelIndex)) {
            return radius3;
        }
        return 0;
    }

    public double gibKugelY(String kugelIndex) {
        if ("1".equals(kugelIndex)) {
            Float y = kugel1.gibY();
            return y.doubleValue();
        } else if ("2".equals(kugelIndex)) {
            Float y = kugel2.gibY();
            return y.doubleValue();
        } else if ("3".equals(kugelIndex)) {
            Float y = kugel3.gibY();
            return y.doubleValue();
        }
        return 0;
    }

    public double gibKugelX(String kugelIndex) {
        if ("1".equals(kugelIndex)) {
            Float x = kugel1.gibX();
            return x.doubleValue();
        } else if ("2".equals(kugelIndex)) {
            Float x = kugel2.gibX();
            return x.doubleValue();
        } else if ("3".equals(kugelIndex)) {
            Float x = kugel3.gibX();
            return x.doubleValue();
        }
        return 0;
    }

    public double gibKugelZ(String kugelIndex) {
        if ("1".equals(kugelIndex)) {
            Float z = kugel1.gibZ();
            return z.doubleValue();
        } else if ("2".equals(kugelIndex)) {
            Float z = kugel2.gibZ();
            return z.doubleValue();
        } else if ("3".equals(kugelIndex)) {
            Float z = kugel3.gibZ();
            return z.doubleValue();
        }
        return 0;
    }
}
