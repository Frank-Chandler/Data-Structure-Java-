package 课堂.线性表;

public class test {
    public int gcd(int a,int b) {
        //while (b!=0){
        //    int temp=a%b;
          //  a=b;
           // b=temp;
        //}
        if (a<b) {
            return gcd(b,a);
        }
        else if(b==0){
        return a;
        }else{
            return gcd(b,a%b);
        }

    }

    public static void main(String[] args) {
        test t1=new test();
        int lest;
        lest = t1.gcd(91,49);
        System.out.println(lest);
    }
}
