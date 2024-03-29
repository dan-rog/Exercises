package codingBat.warmup;

public class Warmup2 {
    /*
    Hello there, this is my personal battle with enormous amount of tasks placed on site codebat.com.
    Prepare your shield.
     */

    public String stringTimes(String str, int n) {
        String output = str;
        try {
            output = (str.repeat(n));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        if (n == 0) {
            return "";
        } else {
            return output;
        }
    }

    public String frontTimes(String str, int n) {
        String front;
        if (str.length() > 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        if (n < 0) {
            System.err.println("Integer value lower than zero, " +
                    "there is no exceptions because Math.max was used.");
        }
        return front.repeat(Math.max(0, n));
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("xx", i)) {
                count++;
            }
        }
        return count;
    }

    boolean doubleX(String str) {
        int indexOfFirstX = str.indexOf('x');

        if (indexOfFirstX == -1) { // case when x was not found
            return false;
        }

        if (indexOfFirstX == str.length() - 1) { // case when 'x' is a last char
            return false;
        }

        return str.charAt(indexOfFirstX) == str.charAt(indexOfFirstX + 1);
    }

    public String stringBits(String str) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            output.append(str.charAt(i));
        }
        return output.toString();
    }

    public String stringSplosion(String str) {
        StringBuilder stro = new StringBuilder();
        for (int i = 1; i < str.length() + 1; i++) {
            stro.append(str, 0, i); // second int argument is endindex EXCLUSIVE, thus we +1 str.length() in loop
        }
        return stro.toString();
    }

    public int last2(String str) {
        String lastTwo;
        if (str.length() < 3) {
            return 0;
        } else lastTwo = str.substring(str.length() - 2);

        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == lastTwo.charAt(0) && str.charAt(i + 1) == lastTwo.charAt(1)) {
                count++;
            }
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9 && i < 4) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int count = 0;
        int shorter = Math.min(a.length(), b.length());

        for (int i = 0; i < shorter - 1; i++) {
            String asub = a.substring(i, i + 2);
            String bsub = b.substring(i, i + 2);
            if (asub.equals(bsub)) {
                count++;
            }
        }
        return count;
    }

    public String stringX(String str) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'x' || (i == 0) || i == str.length() - 1) {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }

    public String altPairs(String str) {
        if (str.length() < 3) {
            return str;
        }
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            out.append(str, i, end);
        }
        return out.toString();
    }

    public String stringYak(String str) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 2 && (str.charAt(i) == 'y' && str.charAt(i + 2) == 'k')) {
                i = i + 2;
            } else {
                out.append(str.charAt(i));
            }
        }
        return out.toString();
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] + 5 == nums[i + 1] && Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }
}
