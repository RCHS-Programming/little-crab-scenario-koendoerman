import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    public void act() 
    {
        if( Greenfoot.isKeyDown("left") )
        {
            
        }
        move();  
        lookForWorm();
    }
    
    public void move( )
    {
        move(5);
    }
    
    /*
     * Check whether we have stumbled upon a worm 
     * If we have, eat it. If not, do nothing
     */
    public void lookForWorm()
    {
        if(isTouching (Worm.class))
        {
            removeTouching(Worm.class );
    
        }  
    }
}
   