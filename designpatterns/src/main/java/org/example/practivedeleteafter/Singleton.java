package org.example.practivedeleteafter;

public class Singleton  implements Cloneable{


    private static Singleton instance;
    private Singleton()  {
        if(instance!=null)
        {
            throw new RuntimeException("Use get instance");
        }
        instance=new Singleton();
    }

    public  Singleton getInstance()  {
        if(instance!=null)
        {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
     return instance;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException("not");
    }



}
