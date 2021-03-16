import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author Koen Doerman 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    
    public void act() 
    {
        isAtEdge();
        randomTurn();
        move();  
        lookForCrab();
    }
    
    public void move( )
    {
        move(5);
    }
    
    /*
     * Check whether we have stumbled upon a worm 
     * If we have, eat it. If not, do nothing
     */
    public void lookForCrab()
    {
        if(isTouching (Crab.class))
        {
            removeTouching(Crab.class );
    
        }  
    }
    
    /*
     * Make the crab turn randomly left or right between 0 and 45 degrees
     */
    public void randomTurn()
    {
        if( Greenfoot.getRandomNumber(100)<10)
        {
            turn( Greenfoot.getRandomNumber(91) - 45 );
        }
    }
    /*
     * 
     */
    public void turnAtEdge() 
    {
        if( isAtEdge() )
        {
            turn(17);
        }  
    }
}
