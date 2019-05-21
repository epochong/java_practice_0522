/**
 * @author wangchong
 * @date 2019/5/22 3:55
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
class B {
    public B(String B) {
        System.out.println(B);
    }
}

public class Test{
    public Test(String C) {
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test("C");
    }
}
