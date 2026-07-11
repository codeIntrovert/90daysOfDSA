public class atoi {
    public static void main(String[] args) {

        atoi converter = new atoi();
        int result = converter.atoiConverter("btwrbn r@#%^$ fcvrbvgt123 werfvr");
        System.out.println("Result: " + result);
    }

    public int atoiConverter(String s) {
        int res = 0;
        StringBuilder temp = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch) || (ch == '-' && temp.length() == 0)) {
                temp.append(ch);
            }
        }

        if (temp.length() > 0) {
            res = Integer.parseInt(temp.toString());
        }

        return res;
    }
}
