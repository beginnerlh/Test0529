/*
对于一个字符串，请设计一个高效算法，找到第一次重复出现的字符。
给定一个字符串(不一定全为字母)A及它的长度n。请返回第一个重复出现的字符。保证字符串中有重复字符，字符串的长度小于等于500。
测试样例：
输入:
"qywyer23tdd",11
输出：
返回：y
*/
package lianxi0529;

public class Test0529 {
    public static void main(String[] args) {
        FirstRepeat f = new FirstRepeat();
        String s = "qywyer23tdd";
        int n = 11;
        System.out.println(f.findFirstRepeat(s,n));
    }
}

class FirstRepeat {
    public char findFirstRepeat(String s, int n) {
        int min = n;
        int count =n;
        for(int i = 0;i<n-1;i++){
            int a = i;
            int b = s.substring(i+1).indexOf(s.charAt(i));
            if(b == -1){
                continue;
            }else{
                b = b+1+i;
                if( count > b){
                    min = a;
                    count = b;

                }
            }
        }
        return s.charAt(min);
    }
}
