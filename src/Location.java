import static java.lang.StrictMath.sqrt;

/**
 * Created by amikhalnyuk on 11.03.2016.
 */
public class Location {

    Location (double xcoord, double ycoord) {
        x = xcoord;
        y = ycoord;
    }

    double x;
    double y;

    double distanceTo (Location other) {
        double dx = other.x - x;
        double dy = other.y - y;
        return sqrt (dx * dx + dy * dy);
    }

}
