import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( isAtEdge());
        randomTurn();
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
   