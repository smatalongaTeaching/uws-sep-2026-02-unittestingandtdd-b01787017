public class StringUtils {

    public int countVowels(String input) {
        int count = 0;

        for (int index = 0; index < input.length(); index++) {
            char character = Character.toLowerCase(input.charAt(index));
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                count++;
            }
        }

        return count;
    }
    
}
