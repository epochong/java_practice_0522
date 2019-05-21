import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/22 4:11
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01_MaxLenDigitalInStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < string.length() - 1; i++) {
            if ((stringBuilder.charAt(i) <= '9' && stringBuilder.charAt(i) >= '0') && (stringBuilder.charAt(i + 1) > '9')) {
                stringBuilder.insert(i + 1,'-');
                i++;
            } else if ((stringBuilder.charAt(i) > '9')&&(stringBuilder.charAt(i + 1) <= '9' && stringBuilder.charAt(i + 1) >= '0')  ){
                stringBuilder.insert(i + 1, '-');
                i++;
            } else {
                continue;
            }
        }
        String[] strings = String.valueOf(stringBuilder).split("-");
        String max = "m";
        String s = null;
        for (int i = 0; i < strings.length; i++) {
            try {
                s = String.valueOf(Integer.parseInt(strings[i]));
            } catch (NumberFormatException e) {
                continue;
            }

            if (s.length() > max.length()) {
                max = s;
            }
        }
        System.out.println(stringBuilder.toString());
        System.out.println(max);
    }
}
