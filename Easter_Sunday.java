//Easetr sunday
package easter_sunday;

import java.util.Scanner;

public class Easter_Sunday {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter a year");
        
        int y = input.nextInt(); //Enter the year
        
        int a = y%19;
        
        int b = y/100;
        
        int c = y%100;
        
        int d = b / 4;
        
        int e = b%4;
        
        int g = (8*b+13)/25;
        
        int h = (19 * a + b - d - g + 15) % 30;
        
        int j= c / 4;
        
        int k=c%4;
        
        int m = (a + 11 * h) / 319;
        
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        
        int n = (h - m + r + 90) / 25;
        
        int p = (h - m + r + n + 19) % 32;
        
        if(y<2016 && n!=4){
        System.out.println("Easter fell on march " + p);
        }
        else if(y<2016 && n==4){
        System.out.println("Easter fell on april " + p);
        }
        else if(y>2015 && n!=4){
            System.out.println("Easter falls on march " + p);
        }
        else if(y>2015 && n==4){
            System.out.println("Easter falls on april " + p);
        }
    }
    
}
