package cn.wdidada.test.mybatisspringbootstarter;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SpecialSymbolDetection {
    public static void main(String[] args) {
        String input = "- / \\ ";
        input = "- / \\ ";
        input = "1-张飒";
        input = "1 ";
        input = " ";

        boolean containsSpecialSymbol = checkForSpecialSymbol(input);
        System.out.println("Contains special symbol: " + containsSpecialSymbol);
    }

    public static boolean checkForSpecialSymbol(String input) {
        String regex = "[-/\\\\ ]"; // 正则表达式匹配特殊符号：-、/、\、空格
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.find(); // 如果找到匹配项，则返回 true
    }
}
