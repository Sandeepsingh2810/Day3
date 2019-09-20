package com.lamton;



public class StringHandling {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;
        String s4 = new String("Hello");
        if (s1 == s2) {
            System.out.println("s1==s2");

        } else {
            System.out.println("s1!=s2");
        }
        if (s3 == s2) {
            System.out.println("s3==s2");
        } else {
            System.out.println("s3==s2");
        }

        if (s1 == s4) {
            System.out.println("s1==s4");
        } else {
            System.out.println("s1!=s4");
        }


        if (s1.equals(s4)) {
            System.out.println("s1==s4");
        } else {
            System.out.println("s1!=s4");
        }
        {
        System.out.println("s1");
        s1.toLowerCase();
        System.out.println("s1");
        s1.toUpperCase();


    }

    String collegeName = "Lambton College in Toronto";
        System.out.println( collegeName.length());
        System.out.println(collegeName.contains("College"));
        System.out.println(collegeName.indexOf("Toronto"));
        System.out.println(collegeName.toUpperCase());
        System.out.println(collegeName.toLowerCase());
        System.out.println(collegeName.charAt(10));
        System.out.println(collegeName.replace("Toronto","New York"));
        System.out.println(collegeName.subSequence(11,15));
        System.out.println(collegeName.toCharArray());
        System.out.println(collegeName.concat("267 Yorkland Blvd.,North York"));

}
}

