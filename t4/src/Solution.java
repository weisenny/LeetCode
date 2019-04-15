import java.nio.ByteBuffer;

public class Solution {
    public static void main (String [] args){
        byte [] ba=new byte[]{2,3,3};
        ByteBuffer bb= ByteBuffer.wrap(ba);

        int a1=333;
        int a2=333;
        System.out.println(a1==a2);//true
        //int 基本类型，相当于equal

      //  Integer de=new Integer(23);
        Integer i1 = new Integer(127);
        int i2 = 127;
        System.out.println(i1 == i2);//true
        //// int 和Integer在进行比较的时候，Integer会进行拆箱，转为int值与int进行比较。

        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);//false new Integer在堆中

        Integer a1=128;
        Integer a2=128;
        System.out.println(a1==a2);//
        //false -128~127为  Integer常量池  ，


        Integer a1=127;
        Integer a2=127;
        System.out.println(a1==a2);//
        //true -128~127为  Integer常量池  ，



    }
}
