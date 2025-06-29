
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder stack = new StringBuilder();

            track(n , 0 , 0 , stack , list);

        return list;
    }
    private void track ( int n ,int open, int close , StringBuilder stack, List<String> list ){
        if(open == n && close == n){
            list.add(stack.toString());
            return;
        }

     
        if(open < n){
            stack.append('(');//choose
            track(n , open + 1 , close , stack , list); //explore
             stack.deleteCharAt(stack.length() - 1);  //backtrack

        }
        if(close < open){
            stack.append(')'); //choose
            track(n , open , close + 1, stack ,list);//explore
            stack.deleteCharAt(stack.length() - 1); //backtrack  
        }    
     
    }
}