package Lab2;


/**
 * Write a description of class Lock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lock
{
    // instance variables 
    private int correctKey;
    private boolean locked = false;
    
    public Lock()
    {
        // initialise instance variables
        
    }

    public void setLock(int newKey){
        this.correctKey = newKey;
    }
    
    public void lock(int key){
        if (key == this.correctKey){
            this.locked = true;
        }
        
    }
    
    public void unlock(int key){
        if (key == this.correctKey){
            this.locked = false;
        }
        
    }
    
    public boolean locked(){
        return this.locked;
        
    }
    
    
    
    }
    

