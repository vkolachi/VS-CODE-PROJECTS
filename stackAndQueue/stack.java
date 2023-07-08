import java.util.Stack;

public class stack{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.add(1);
        st.add(22);
        System.out.println(st.pop());
        System.out.println(st.add(111));
        System.out.println(st);
        System.out.println("first project");
        //all the stack operations will take 0(1) time
        System.out.println(st);
        st.add(111);
        System.out.println(st.peek());

        //void do(Stack<Integer> st)   like this it will be defined
        //anything that is initialized with new keyword tht will be stored in heap memory(dynamic memory)
        //others (int ,string ) these will be stored in stack memory(static memory)
         
        
    }
   
}