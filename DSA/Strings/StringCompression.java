package DSA.Strings;

public class StringCompression {

    public static String compressString(String s){
        StringBuilder sb = new StringBuilder();
           Integer count = 1 ;  
        for(int i=0 ; i<s.length()-1;i++){
            
            if(s.charAt(i) == s.charAt(i+1)){
               count++;

               if(i+1==s.length()-1){
                sb.append(s.charAt(i));
                sb.append(count.toString());
               }

            }else{
                sb.append(s.charAt(i));
                if(count>1){
                  sb.append(count.toString());
                }
                count = 1 ;
            }
        }
        return sb.toString();
        
    }
    
    public static void main(String[] args) {
        String str = "aaabbccddeee";
        String compressed = compressString(str);
        System.out.println("Original String: " + str);
        System.out.println("Compressed String: " + compressed);
    }
}
