class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for(String op : operations){
            if(op.equals("+")){
                int top = s.pop();
                int second = s.peek();
                s.push(top);
                s.push(top+second);
            }
            else if(op.equals("D")){
                s.push((s.peek()) * 2);
            }
            else if(op.equals("C")){
                s.pop();
            }
            else {
                s.push(Integer.parseInt(op));
            }
        }
        int sum =0;
        for(int i : s){
            sum+=i;
        }
        return sum;
    }
}