package Test;

import java.util.Objects;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("1");
        String str2 = "1";
        String str3 = new String("1");
        String str4 = str1;
        String str5 = "1";

        if(str1 == str2){
            System.out.println("1과 2는 같다."); // O
        }
        else{
            System.out.println("1과 2는 다르다.");
            System.out.println("str1 hash :" + System.identityHashCode(str1));
            System.out.println("str2 hash :" + System.identityHashCode(str2));
        }

        if(str1 == str3){
            System.out.println("1과 3은 같다.");
        }
        else{
            System.out.println("1과 3은 다르다."); // O
            System.out.println("str1 hash :" + System.identityHashCode(str1));
            System.out.println("str3 hash :" + System.identityHashCode(str3));
        }

        if(str2 == str3){
            System.out.println("2와 3은 같다.");
        }
        else{
            System.out.println("2와 3은 다르다."); // O
            System.out.println("str2 hash :" + System.identityHashCode(str2));
            System.out.println("str3 hash :" + System.identityHashCode(str3));
        }

        System.out.println(System.identityHashCode(str4));

        System.out.println(System.identityHashCode(str5));
    }
}
