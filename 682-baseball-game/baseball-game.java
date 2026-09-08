class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op : operations){
            if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(op.equals("+")){
                int x = stack.pop();
                int y = stack.peek();
                stack.push(x);
                stack.push(x+y);
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
         return stack.stream()
            .mapToInt(Integer::intValue)
            .sum();
    }
}