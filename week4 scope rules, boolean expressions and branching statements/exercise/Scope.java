public class Scope
{
    private static int x = 1;
    
    public Scope(){}
    
    public void increaseX(){
        x += 5;
        System.out.println(x);
    }
}