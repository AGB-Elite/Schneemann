import java.util.Arrays;
import java.util.Scanner;

class Mainclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double[] paramDoubleValues;
        final String[] calls;

        String answer = input.nextLine();
        input.close();

        calls = answer.split(",");
        paramDoubleValues = Arrays.stream(calls).mapToDouble(Double::parseDouble).toArray();
        if (paramDoubleValues.length == 1) {
            scenes(paramDoubleValues[0]);
        } else if (paramDoubleValues.length == 2) {
            scenes(paramDoubleValues[0], paramDoubleValues[1]);
        } else if (paramDoubleValues.length == 3) {
            scenes(paramDoubleValues[0], paramDoubleValues[1], paramDoubleValues[2]);
        } else if (paramDoubleValues.length == 4) {
            scenes(paramDoubleValues[0], paramDoubleValues[1], paramDoubleValues[2], paramDoubleValues[3]);
        } else {
            System.out.println("Ungültige Eingabe");
        }

    }

    public static void scenes(double pRadius) {
        new SchneemannSzene(pRadius);
    }

    public static void scenes(double radius1, double radius2) {
        Runnable r1 = () -> new SchneemannSzene(radius1);

        Runnable r2 = () -> new SchneemannSzene(radius2);

        Thread schneemann1 = new Thread(r1);
        Thread schneemann2 = new Thread(r2);

        schneemann1.start();
        schneemann2.start();
    }

    public static void scenes(double radius1, double radius2, double radius3) {

        Runnable r1 = () -> new SchneemannSzene(radius1);

        Runnable r2 = () -> new SchneemannSzene(radius2);

        Runnable r3 = () -> new SchneemannSzene(radius3);

        Thread schneemann1 = new Thread(r1);
        Thread schneemann2 = new Thread(r2);
        Thread schneemann3 = new Thread(r3);

        schneemann1.start();
        schneemann2.start();
        schneemann3.start();
    }

    public static void scenes(double radius1, double radius2, double radius3, double radius4) {

        Runnable r1 = () -> new SchneemannSzene(radius1);

        Runnable r2 = () -> new SchneemannSzene(radius2);

        Runnable r3 = () -> new SchneemannSzene(radius3);

        Runnable r4 = () -> new SchneemannSzene(radius4);

        Thread schneemann1 = new Thread(r1);
        Thread schneemann2 = new Thread(r2);
        Thread schneemann3 = new Thread(r3);
        Thread schneemann4 = new Thread(r4);

        schneemann1.start();
        schneemann2.start();
        schneemann3.start();
        schneemann4.start();
    }

}