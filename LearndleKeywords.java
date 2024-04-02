//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;

public class LearndleKeywords {
    private static final String[] keywordsLength4 = new String[]{"data", "java", "code", "byte", "html", "json", "disk", "wifi", "file", "ajax", "rest", "soap", "void", "long", "case", "char", "else", "enum", "goto", "this"};
    private static final String[] keywordsLength5 = new String[]{"while", "throw", "false", "break", "super", "short", "float", "catch", "final", "super", "class", "super", "throw", "email", "https", "linux", "stack", "react", "adobe", "adhoc", "codec", "query", "regex", "virus", "flask", "gnome", "scala", "unity", "cloud", "fetch", "error", "apple", "codec", "mysql"};
    private static final String[] keywordsLength6 = new String[]{"static", "import", "native", "public", "throws", "return", "double", "server", "socket", "assert", "switch", "nodejs", "cookie", "iframe", "router", "kotlin"};

    public LearndleKeywords() {
    }

    private static int generateNumber(int var0, int var1) {
        int var2 = var1 - var0 + 1;
        return (int)(Math.random() * (double)var2 + (double)var0);
    }

    public static String generateRandomKeywordLength4() {
        return keywordsLength4[generateNumber(0, keywordsLength4.length - 1)];
    }

    public static String generateRandomKeywordLength5() {
        return keywordsLength5[generateNumber(0, keywordsLength5.length - 1)];
    }

    public static String generateRandomKeywordLength6() {
        return keywordsLength6[generateNumber(0, keywordsLength6.length - 1)];
    }

    public static String generateUniqueKeywordLength5() {
        String var0 = "while";

        do {
            var0 = keywordsLength5[generateNumber(0, keywordsLength5.length - 1)];
        } while(!hasUniqueCharacters(var0));

        return var0;
    }

    private static boolean hasUniqueCharacters(String var0) {
        ArrayList var1 = new ArrayList();
        char[] var2 = var0.toCharArray();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            char var5 = var2[var4];
            if (var1.contains(var5)) {
                return false;
            }

            var1.add(var5);
        }

        return true;
    }

    public static String generateRandomKeyword(int var0) {
        if (var0 == 4) {
            return generateRandomKeywordLength4();
        } else if (var0 == 5) {
            return generateRandomKeywordLength5();
        } else {
            return var0 == 6 ? generateRandomKeywordLength6() : null;
        }
    }
}
