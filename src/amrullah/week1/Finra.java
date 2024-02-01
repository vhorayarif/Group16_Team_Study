package amrullah.week1;

public class Finra{
    public static void finra( ){
        for (int i=1; i<=30; i++ ){

            if (i%15==0){
                System.out.print("FINRA ");
            } else if (i%5==0) {
                System.out.print("RA ");
            } else if (i%3==0) {
                System.out.print("FIN ");
            }else {
                System.out.print(i+" ");
            }
        }

    }

}