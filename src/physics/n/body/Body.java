package physics.n.body;

import java.awt.Graphics2D;

/**
 *
 * @author Manoj
 */
public abstract class Body
{

    public double mass;
    Vector3D position;
    Vector3D velocity;
    Vector3D acceleration;

    public void applyForce(Vector3D force)
    {
        acceleration = force.divide(mass);
    }
    
    public void update()
    {
        velocity = velocity.add(acceleration);
        position = position.add(velocity);
        
        acceleration.zero();
    }
    
    public abstract void draw(Graphics2D graphics);
}
