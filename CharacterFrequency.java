public class CharacterFrequency {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char targetChar = 'l';

        int frequency = findCharacterFrequency(inputString, targetChar);

        System.out.println("The character '" + targetChar + "' appears " + frequency + " times in the string.");
    }

    public static int findCharacterFrequency(String input, char target) {
        int frequency = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                frequency++;
            }
        }

        return frequency;
    }
}
