public class ktnguyento {
    static boolean nguyento (int n){
        if (n < 2){
            return false;
        }
        for (int i = 2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    private static Scanner scan = new Scanner(System.in);

}
