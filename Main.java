package sk.keakademia.deco.palindrom;

public class Main {
    public static void main(String[] args) {
        //sucet cisel s rozdielnymi ciframi
        int x=101;
        int count=0;
        while (x>100&&x<1000){
            int c1=(x/100)%10;
            int c2=(x/10)%10;
            int c3=x%10;
            if (c1!=c2&&c1!=c3&&c2!=c3){
                count=count+x;
                System.out.print(x+"+");
            }
            x++;
        }
        System.out.println("="+count);
        //sucet mocnin cisla 2
        /*int x;
        int count=0;
        for (int i=0;i<=16;i++){
            x= (int) Math.pow(2,i);
            count=count+x;
            System.out.print(x+"+");
        }
        System.out.println("="+count);*/
    }
}
