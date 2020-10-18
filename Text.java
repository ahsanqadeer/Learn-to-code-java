
package pkginterface.vs.pkgabstract.pkgclass;

interface A
{
    void a();
    void b();
}
interface B extends A
{
    void c();
    void d();
}
abstract class C implements B
{
    public void b()
    {
        System.out.println("Method b");        
    }
    public void d()
    {
        System.out.println("Method d");        
    }
}
        
class Implementor extends C
{
    public void a()
    {
        System.out.println("Method a");
    }
    
    public void c()
    {
        System.out.println("Method c");        
    }
    
}

public class Test  
{
    
    public static void main(String[] args) {
        A ob=new Implementor();
        B ob1=new Implementor();
        
        ob.a();
        ob.b();
        ob1.c();
        ob1.d();
        
    }
    
}
