package codingBat.string2;

public class String2 {
    public String doubleChar(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(i));
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    public String oneTwo(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i += 3) {
            if (i + 3 > str.length()) {
                builder.append(str.substring(i));
                break;
            }
            String sub = str.substring(i, i + 3);
            builder.append(sub.substring(1)).append(sub.charAt(0));
        }
        return builder.toString();
    }

    public String zipZap(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            if (i + 2 < str.length()) {
                if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                    builder.append("zp");
                    i += 2;
                    continue;
                }
            }

            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    /**
     * Return true if the string "cat" and "dog" appear the same number of times in the given string.
     */
    public boolean catDog(String str) {
        if (str == null) {
            return false;
        }

        int cdog = 0;
        int ccat = 0;
        for (int i = 0; str.length() > 2; ) {
            if (str.startsWith("cat")) {
                ccat++;
                str = str.substring(3);
                continue;
            } else if (str.startsWith("dog")) {
                cdog++;
                str = str.substring(3);
                continue;
            }
            str = str.substring(1);
        }
        return cdog == ccat;
    }

    /**
     * Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
     */
    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) {
            return "";
        } else if (count == 1) {
            return word;
        }
        StringBuilder builder = new StringBuilder(word);
        for (int i = 1; i < count; i++) {
            builder.append(sep).append(word);
        }
        return builder.toString();
    }

    /**
     * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceded by a period (.). So "xxyz" counts but "x.xyz" does not.
     */
    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            int index = str.indexOf("xyz");
            if (index == -1) {
                return false;
            }

            if (index == 0 || str.charAt(index - 1) != '.') {
                return true;
            }

            str = str.substring(index);
        }
        return false;
    }
}
