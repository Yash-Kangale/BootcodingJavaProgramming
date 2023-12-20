package Practice_Information.OOPS;
// Encapsulation is the bundling of data (attributes) and methods that operate on the data within a
// single unit or class. It helps to hide the internal details of an object and only expose what is necessary.
public class Encapsulation {
        private double radius;

        // Getter and setter methods for the radius
        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            if (radius > 0) {
                this.radius = radius;
            } else {
                System.out.println("Invalid radius");
            }
        }
    }


