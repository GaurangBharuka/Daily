class Multiply{
    public int mul(int x,int y){
        int r=x*y;
        return r;
    }    
}
public class b10 {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        Multiply cal=new Multiply();
        int result=cal.mul(a,b);
        System.out.println(result);
    }
}
