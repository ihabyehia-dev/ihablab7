package ihab_lab7;

public class Charstack {
    public int top;
    public int size;
    public char[] data;

    public Charstack(int size) {
        this.size =size;
        data=new char[size];
        top=-1;
    }

    public boolean isEmpty() {
        return top==-1;
    }
    public boolean isFull() {
        return top==size-1;
    }
    public void push(char c) {
        if (!isFull()){
         data[++top]=c;
        }
    }
public char pop() {
        if (!isEmpty()) {
            return data[top--];
        }
        return '\0';
    }
    public char peek(){
        if (!isEmpty()){
            return data[top];
        }
        return '\0';
    }
  
    public  boolean isMatching(char open,char close) {
    return (open=='{'&&close=='}'||open=='['&&close==']'||open=='('&&close==')');
    }
    
    public boolean isBalanced(String expr) {
        top = -1;
        for (int i = 0; i < expr.length(); i++) {
            char ihab=expr.charAt(i);
            if (ihab=='('||ihab=='{'||ihab=='[') {
                if (isFull()) {
                    return false;
                }
                push(ihab);
            }
            else if (ihab==')'||ihab=='}'||ihab==']') {

                if (isEmpty()) {
                    return false;
                }
                char open = pop();
                if (!isMatching(open,ihab)) {
                    return false;
                }
            }
        }
        return isEmpty();
    }
}
