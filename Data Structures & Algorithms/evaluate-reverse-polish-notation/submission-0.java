class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String c : tokens){
            if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")  ){
                int a = st.pop();
                int b = st.pop();
                int ans = 0;
                switch(c){
                    case "+":
                    ans = a + b;
                    break;

                    case "-":
                        ans = b - a;
                        break;

                    case "*":
                        ans = a * b;
                        break;

                    case "/":
                        ans = b / a;
                        break;
                }
                st.push(ans);
            }
            else
            st.push(Integer.parseInt(c));
        }

        return st.peek();
    }
}