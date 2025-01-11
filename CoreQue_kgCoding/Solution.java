package CoreQue_kgCoding;
class Solution {
    public static void main(String [] args){
        String s = "III";

        romanToInt(s);
    }
   
    public static int romanToInt(String s) {
        
        int result = 0;
        int i=0;
        s = s +"00";
        while(true ){
         char c = s.charAt(i);   
         char next = s.charAt(i+1);
         switch(c){
            case 'V':
            return result = result + 5;
            break; 

            case 'L':
            return result = result + 50;
            break;

            case 'D':
            return result += 500;
            break;

            case 'M':
            return result += 1000;
            break;

            case'I':
            if(next=='V'){
               return result += 4;
               i++;
            }else if(next=='X'){
                return result += 9;
                i++;
            }
            return result += 1 ;
            break;

            case'X':
            if(next=='L'){
               return result += 40;
               i++;
            }else if(next=='C'){
                return result += 90;
                i++;
            }
            return result += 10 ;
            break;

            case'C':
            if(next=='D'){
               return result += 400;
               i++;
            }else if(next=='M'){
                return result += 900;
                i++;
            }
            return result += 100 ;
            break;   

            case 's':
            return result ;         
            
            }
            i++;
        }
        return 0 ;        
    }    
}



