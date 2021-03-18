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
        checkKeyPress();
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
            Greenfoot.playSound("slurp.wav");
    
        }  
    }
    
    /*
     * Check whether a user has pressed the keyboard key
     * If so, turn the crab
     */
    public void checkKeyPress()
    {
        if( Greenfoot.isKeyDown("left") )
        {
            turn(-4);
        }
        if( Greenfoot.isKeyDown("right") )
        {
            turn(4);
        }
    }
}
   