package test.T.usage;

/**
 * Created by mzlin on 14-12-19.
 */
public class Tclass <T> {
    public T data;

    public T testMethod()
    {
        return this.data;
    }
    public void setData(T x){
        data = x;
    }
    public static <T> Tclass getSample()
    {
        return new Tclass();
    }
    public static void main(String args[])
    {
        Tclass tc = new Tclass<String>();

    }
}
