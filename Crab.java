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
        if( isAtEdge() )
        {
            turn(17);
        }
        
        if( Greenfoot.getRandomNumber(100)<10)
        {
            turn( Greenfoot.getRandomNumber(91) - 45 );
        }
        
        move ();  
        
        if(isTouching (Worm.class))
        {
            removeTouching(Worm.class );
    
        }  
    }
    public void move( )
        {
            move(5);
        } 
    }
   