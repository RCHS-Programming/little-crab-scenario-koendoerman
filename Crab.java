import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
       if( isAtEdge() )
       {
       turn(50);
       }   
       move(15);
       
    }
    
    public void move( )
    {
        move(5);
    }
}


