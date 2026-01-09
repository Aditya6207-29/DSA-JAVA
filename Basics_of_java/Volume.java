
/*
Volume Of Cone Java Program
Volume Of Prism
Volume Of Cylinder
Volume Of Sphere
Volume Of Pyramid
 */
import java.util.Scanner;

public class Volume {
    float pi = 3.14f;

    float coneVol(float r, float h) {
        float v = (1f / 3) * pi * r * r * h;
        return v;
    }

    float prismVol(float ba, float h) {
        float v = ba * h;
        return v;
    }

    float cylinderVol(float r, float h) {
        float v = pi * r * r * h;
        return v;
    }

    float sphereVol(float r) {
        float v = (4f / 3) * pi * r * r * r;
        return v;
    }

    float pyramidVol(float l, float w, float h) {
        float v = (l * w * h) / 3;
        return v;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Volume vol = new Volume();
        int choice;

        do {
            System.out.println("-----------------------------");
            System.out.println("----------MAIN MENU----------");
            System.out.println("-----------------------------");
            System.out.println("For volume of (cone): 1");
            System.out.println("For volume of (prism): 2");
            System.out.println("For volume of (cylinde): 3");
            System.out.println("For volume of (sphere): 4");
            System.out.println("For volume of (pyramid): 5");
            System.out.println("For (exit): 6");
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the cone: ");
                    float r = in.nextFloat();
                    System.out.print("Enter the height of the cone: ");
                    float h1 = in.nextFloat();
                    System.out.println("Volume of cone: " + vol.coneVol(r, h1));
                    break;

                case 2:
                    System.out.print("Enter the height:");
                    float h2 = in.nextFloat();
                    float ba;
                    int c;
                    do {
                        System.out.println("----------BASE  AREA----------");
                        System.out.println("-------------MENU-------------");
                        System.out.println("For base area of (rectangle): 1");
                        System.out.println("For base area of (square): 2");
                        System.out.println("For base area of (triangle): 3");
                        System.out.println("For base area of (circle): 4");
                        System.out.println("For (exit): 5");
                        System.out.println("------------------------------");
                        System.out.print("Enter your choice: ");
                        c = in.nextInt();

                        switch (c) {
                            case 1:
                                System.out.println("BASE AREA OF RECTANGLE");
                                System.out.print("Enter length of rectangle: ");
                                float len = in.nextFloat();
                                System.out.print("Enter breath of rectangle: ");
                                float bre = in.nextFloat();
                                ba = len * bre;
                                System.out.println("Volume of rectanglar prism: " + vol.prismVol(ba, h2));
                                break;
                            case 2:
                                System.out.println("BASE AREA OF SQUARE");
                                System.out.print("Enter side: ");
                                float s = in.nextFloat();
                                ba = s * s;
                                System.out.println("Volume of square prism: " + vol.prismVol(ba, h2));
                                break;
                            case 3:
                                System.out.println("BASE AREA OF TRIANGLE");
                                System.out.print("Enter the base of triangle: ");
                                float base = in.nextFloat();
                                System.out.print("Enter the height of triangle: ");
                                float height = in.nextFloat();
                                ba = 1f / 2 * base * height;
                                System.out.println("Volume of triangular prism: " + vol.prismVol(ba, h2));
                                break;
                            case 4:
                                System.out.println("BASE AREA OF CIRCLE");
                                System.out.print("Enter the radius of circle: ");
                                float radius = in.nextFloat();
                                ba = 3.14f * radius * radius;
                                System.out.println("Volume of circular prism: " + vol.prismVol(ba, h2));
                                break;
                            default:
                                System.out.println("Exiting base area menu...");
                        }
                    } while (c != 5);
                    break;
                case 3:
                    System.out.print("Enter radius of the cylinder: ");
                    float rc = in.nextFloat();
                    System.out.print("Enter height of the cylinder: ");
                    float hc = in.nextFloat();
                    System.out.println("Volume of cylinder: " + vol.cylinderVol(rc, hc));
                    break;
                case 4:
                    System.out.print("Enter the radius of sphere: ");
                    float rs = in.nextFloat();
                    System.out.println("Volume of sphere: " + vol.sphereVol(rs));
                    break;
                case 5:
                    System.out.print("Enter the length of pryamid: ");
                    float l = in.nextFloat();
                    System.out.print("Enter the width of pryamid: ");
                    float w = in.nextFloat();
                    System.out.print("Enter the height of pryamid: ");
                    float hp = in.nextFloat();
                    System.out.println("Volume of pyramid: " + vol.pyramidVol(l, w, hp));
                    break;
                case 6:
                    System.out.println("Exiting program..."); 
                    break;   
                default:
                    System.out.println("Invalid input!");
                    

            }

        } while (choice != 6);
        in.close();

    }

}
