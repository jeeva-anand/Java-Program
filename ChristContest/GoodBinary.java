package ChristContest;

public class GoodBinary {
    
    public static void goodBinary(String str){
        int maxCount = 0;
        int count = 0;
        int result = 0;

        for(char c:str.toCharArray()){
            if(c == '1'){
                count++;
            }else{
                count = 0;
            }
            maxCount = Math.max(maxCount,count);
        }

        for(int i=0;i<str.length();){
            int cnt = 0;
            char c = str.charAt(i);
            while( i < str.length() && str.charAt(i) == '0') {
                i++;
                
            }
            while(i < str.length() && str.charAt(i) == '1'){
                cnt+=1;
                i++;
            }

            if(cnt != maxCount){
                result += 1;
            }
        }
        System.out.println("Result: "+result);
    }

    public static void main(String[] args) {
        goodBinary("1101110110111");
    }
}
