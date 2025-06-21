package DSA.BinaryToDecimal;

public class binTODec {

    public static int binaryToDecimal(int binNum) {
       int pow = 0 ;
       int decNum =  0; 
       while(binNum>0){
        int lastDight = binNum%10;
        decNum= decNum + (lastDight * (int)Math.pow(2,pow));
        pow++;
        binNum = binNum/10;
       }
       return decNum;
    }
    
    public static void main(String[] args) {
        int binNum = 1010;
        int decimalNum = binaryToDecimal(binNum);
        System.out.println("Binary: " + binNum + " in Decimal: " + decimalNum);
    }
}
