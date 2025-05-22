class Solution {
    public String reverseWords(String s) {
        Stack<String>  stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        s.trim();
        String arr[] = s.split("\\s+");
        for(String word : arr){
            stack.push(word);
        }
    while(!stack.isEmpty()){
        ans.append(stack.pop());
        if(!stack.isEmpty()) ans.append(" ");
    }
       return ans.toString().trim();
    }
}