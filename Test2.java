package s202355;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //输入两行字符，一个为初始字符，一个为目标字符
        Scanner sc = new Scanner(System.in);
       while(true){
           String s1 = sc.next();
           String s2 = sc.next();
           boolean TT = TF(s1,s2);
           if(TT){
               System.out.println("可以");
           }else{
               System.out.println("不可以");
           }
           System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       }
    }
    //旋转操作
    public static Boolean TF(String s1,String s2){
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        int number = s1.length()-1;
        while (number>0){
            if(s1.length()!=s2.length()){
                return false;
            }
            if(s1.equals(s2)){
                return true;
            }
            else{
                char ss = sb.charAt(0);
                s1 = sb.append(ss).toString();
            }
            number--;
        }
        return false;
    }
}
