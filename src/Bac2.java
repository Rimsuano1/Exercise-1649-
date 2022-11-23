public class Bac2 {
    public static void PTB2(int a, int b, int c){
        if(a==0)
            Bac1.PTB1(b,c);
        else{
            float denta= b*b-(4*a*c);
            if(denta == 0) {
                System.out.println("PT co nghiem kep: x1=x2=  " + (-b) / (2 * a));
            }
            if(denta > 0){
                System.out.println("PT co' hai nghiem: ");
                System.out.println("x1= "+(-b+Math.sqrt(denta))/(2*a));
                System.out.println("x2= "+(-b-Math.sqrt(denta)/(2*a)));
            }
            else{
                System.out.println("vo nghiem");
            }

        }

    }

}
