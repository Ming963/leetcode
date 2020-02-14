package byteDancing.stringTest;
/*
题干：
给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
示例 1:
输入: num1 = "2", num2 = "3"
输出: "6"

想法 ：拆分每一位再模拟竖式
总结地址：https://blog.csdn.net/qq_43491066/article/details/104232594
 */
public class multiply {

        public String multiply(String num1, String num2) {
            if (num1.equals("0") || num2.equals("0")) {
                return "0";
            }
            int[] res = new int[num1.length() + num2.length()];
            for (int i = num1.length() - 1; i >= 0; i--) {
                int n1 = num1.charAt(i) - '0';
                for (int j = num2.length() - 1; j >= 0; j--) {
                    int n2 = num2.charAt(j) - '0';
                    int sum = (res[i + j + 1] + n1 * n2);
                    res[i + j + 1] = sum % 10;
                    res[i + j] += sum / 10;
                }
            }

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < res.length; i++) {
                if (i == 0 && res[i] == 0) continue;
                result.append(res[i]);
            }
            return result.toString();
        }
    }



