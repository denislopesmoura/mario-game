import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedAnt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedAnt extends Character
{
    public RedAnt(String name, String url){
        this.name = name;
        this.urlPhoto = url;
    }
    
    public void act() 
    {
        // Add your action code here.
        moveCharacter();
        setImage();
    }    
}
