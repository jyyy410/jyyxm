package com.niit.字符串;

public class StringTest
{

    private static int first;
    private static int second;

    /**
     * [字符串去掉两头的空格] [字符串方法：char charAt[i]; indexOf("a") indexOf("c"),10  从10这个位置查找c第一次出现你的位置是什么 ]
     * 
     * @param args
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args) {
        String str = "   ab c      ";
        str = dealStr(str);
        System.out.println(str + "----" + str.length());

    }

    private static String dealStr(String str) {

        for (int i = 0; i <= str.length() - 1; i++) {
            if (!" ".equals(String.valueOf(str.charAt(i)))) {
                first = i;
                break;
            }
        }

        for (int j = str.length() - 1; j <= str.length() - 1; j--) {
            if (!" ".equals(String.valueOf(str.charAt(j)))) {
                second = j;
                break;
            }
        }
        return str.substring(first, second + 1);

    }

    public String deastrb(String str) {
        str.replace(" ", "");
        return str;

    }

    // 字符串变字符数组
    public static void changyongFangf(String str) {
        char[] chararray = str.toCharArray();
        for (int i = 0; i < chararray.length; i++) {
            System.out.println(chararray[i]);
        }
    }

    // 字符串变字符串数组
    public static void spitTest(String str) {
        String strr[] = str.split("\\.");
        for (int i = 0; i < strr.length; i++) {
            System.out.println(strr[i]);
        }
    }

    // 字符串变 字节数组
    public static void zijieshuzu(String str) {
        byte[] mybytes = str.getBytes();
        for (int i = 0; i < mybytes.length; i++) {
            System.out.println(mybytes[i]);
        }
    }

}
