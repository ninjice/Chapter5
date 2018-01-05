package Lab2;

public interface Lockable
{
    public void setkey(int key);
    public void lock(int key);
    
    public void unlock(int key);
    
    public boolean locked();
    
    }

