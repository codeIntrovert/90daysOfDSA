public class LastWord {

    /*
     * Here we will be given a string,
     * we need to find the lenght of last word
     * we use trim() to remove spaces from end and front
     * we use String[] words = trimmedString.split("")
     * this will split the words on spaces " ";
     * and store them in an array of words
     */
    public static void main(String[] args) {

        String input = "Hello this is introvertCoder speaking I love cats";
        // should output 4
        System.out.println(LastWord(input));
    }

    public static int LastWord(String s) {

        String trimmedString = s.trim();

        String[] words = trimmedString.split(" ");
        int lenght = words[words.length - 1].length();

        return lenght;
    }

}
