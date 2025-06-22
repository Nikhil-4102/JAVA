package DSA.DecimalToBinary;

public class decToBin {

    public static String decToBinary(int decNum){
         int pow = 0 ;
         int binNum =  0;
         while(decNum>0){
            int lastDigit = decNum%2;
            binNum = binNum + (lastDigit * (int)Math.pow(10 ,pow));
            pow++;
            decNum = decNum/2;
         } 
         return String.valueOf(binNum);
    }
    
    public static void main(String[] args) {
        int decNum =8;
        String binaryNum = decToBinary(decNum);
        System.out.println("Decimal: " + decNum + " in Binary: " + binaryNum);
    }
}
