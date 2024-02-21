import java.util.Stack;

public class Solution {

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        if (s.length() < 2){
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            char n = s.charAt(i);
            switch (n) {
                case '(', '{', '[' -> stack.push(n);
                case ')' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '(') {
                        stack.pop();
                        break;
                    } else return false;
                }
                case ']' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '[') {
                        stack.pop();
                        break;
                    } else return false;
                }
                case '}' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '{') {
                        stack.pop();
                        break;
                    } else return false;
                }
            }
        }
        return stack.isEmpty();
    }

//    public static boolean isValid(String s){
//        Stack<Character> stack = new Stack<>();
//        for (int i = s.length() - 1; i >= 0; i--){
//            stack.push(s.charAt(i));
//        }
//        char current; char previous = stack.peek();
//        stack.pop();
//        while (!stack.empty()) {
//            current = stack.peek();
//            stack.pop();
//            if (!check(previous, current)){
//                return false;
//            }
//            if(!stack.empty()){ previous = stack.peek(); stack.pop(); }
//        }
//        return true;
//    }
//
//    public static boolean check(char x, char y){
//        switch (x){
//            case '(':
//                if (y != ')') return false; break;
//            case '[':
//                if (y != ']') return false; break;
//            case '{':
//                if (y != '}') return false; break;
//        }
//        return true;
//    }

    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid(s));
    }
}
