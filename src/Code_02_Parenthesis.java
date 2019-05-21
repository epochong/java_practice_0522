import java.util.Stack;

/**
 * @author wangchong
 * @date 2019/5/22 4:47
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_02_Parenthesis {
    public static boolean chkParenthesis(String A) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '(') {
                stack.push('(');
            } else if (A.charAt(i) == ')'){
                if (i == 0) {
                    return false;
                }
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (chkParenthesis("()()()()")) {
            System.out.println("yes");
        }
    }
}
