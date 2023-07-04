public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()()";
        boolean ans = solution(s);
        System.out.println("Ans: " + ans);
    }

    static boolean solution(String s) {
        Stack stack = new Stack(s.length());
        for (int i = 0; i < s.length(); i++) {
            stack.printStack();
            char st = s.charAt(i);
            if (st == '(' || st == '[' || st == '{') {
                stack.push(st);
            } else {
                char st2 = stack.pop();
                if (st2 == ' ') {
                    return false;
                }
                if (st == ')') {
                    if (st2 != '(') {
                        return false;
                    }
                } else if (st == ']') {
                    if (st2 != '[') {
                        return false;
                    }
                } else if (st == '}') {
                    if (st2 != '{') {
                        return false;
                    }
                }
            }

        }
        if (stack.tos != -1)
            return false;
        return true;
    }
}

class Stack {
    char[] stack;
    int tos;

    Stack(int length) {
        this.stack = new char[length];
        this.tos = -1;
    }

    public int push(char element) {
        this.tos++;
        this.stack[tos] = element;
        return this.tos;
    }

    public char pop() {
        if (this.tos == -1) {
            return ' ';
        }
        char return_element = stack[tos];
        this.tos--;
        return return_element;
    }

    public void printStack() {
        for (int i = 0; i <= this.tos; i++) {
            System.out.print(this.stack[i] + " ");
        }
        System.out.println();
    }
}
