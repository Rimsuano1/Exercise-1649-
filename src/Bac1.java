public class Bac1 {
    public static void PTB1(int a, int b) { //ax+b=0
        //code
        if(a ==0){
            if(b ==0)
                System.out.println("PT vo so nghiem.");
            else   //b != 0
                System.out.println("Pt vo nghiem.");
        }
        else //a !=0
            System.out.println("Pt co 1 nghiem: x= " + ((float)-b/a));
    }
}

