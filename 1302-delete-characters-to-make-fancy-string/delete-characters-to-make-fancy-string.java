/*class Solution {
    public String makeFancyString(String s) {
        int count = 0;
        int idx=1;
        while(idx<s.length){
            for(int i=0; i<s.length; i++){
            if(s.charAt(idx) = s.charAt(1) ){
                count++;
            }
            if(count==3) 
        }
        }
        
    }
}*/
class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        char last = s.charAt(0);
        ans.append(last);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == last) {
                count++;
                if (count < 3)
                    ans.append(c);
            } else {
                last = c;
                count = 1;
                ans.append(c);
            }
        }
        return ans.toString();
    }
}