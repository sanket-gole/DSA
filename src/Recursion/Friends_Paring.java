package Recursion;

public class Friends_Paring {
    public static int Pairing(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=Pairing(n-1);
        //pair
        int fnm2=Pairing(n-2);
        int pairways=(n-1)*fnm2;
        int totalWays=fnm1+pairways;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(Pairing(3));
    }
//    class Solution {
//        public long countFriendsPairings(int n) {
//            // code here
//            if(n==1 || n==2){
//                return n;
//            }
//            return countFriendsPairings(n-1)+(n-1)*countFriendsPairings(n-2);
//        }
//    }

}
