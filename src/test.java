public class test {
    public static void main(String[] args) {
        int[] crabpos = {1, 2, 3, 4, 5, 6};
        int crabpostotnew = 0;


            for(int k = 0; k < crabpos.length;k++){
                crabpostotnew = ((Math.abs(3 - crabpos[k])*Math.abs(3 - crabpos[k]+1))/2);

                System.out.println(crabpostotnew);

            }
        }
    }
