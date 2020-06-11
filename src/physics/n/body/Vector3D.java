package physics.n.body;

/**
 *
 * @author Manoj
 */
public class Vector3D
{

    public double x;
    public double y;
    public double z;

    public Vector3D()
    {
    }

    public Vector3D(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D add(Vector3D v)
    {
        return new Vector3D(x + v.x, y + v.y, z + v.z);
    }

    public Vector3D subtract(Vector3D v)
    {
        return new Vector3D(x - v.x, y - v.y, z - v.z);
    }

    public Vector3D multiply(double mag)
    {
        return new Vector3D(mag * x, mag * y, mag * z);
    }

    public Vector3D divide(double mag)
    {
        return new Vector3D(x / mag, y / mag, z / mag);
    }

    public double dist(Vector3D v)
    {
        return Math.sqrt((x - v.x) * (x - v.x) + (y - v.y) * (y - v.y) + (z - v.z) * (z - v.z));
    }

    void zero()
    {
        x = y = z = 0;
    }
}
