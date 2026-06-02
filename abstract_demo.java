abstract class Demo
{
    public int i,j;
    public int Add(int a, int b)     //Concrete Method
    {
        return a+b;
    }
}

class abstract_demo
{
    public void main(String A[])
    {
        Demo dobj = new Demo();    //Error
    }
}