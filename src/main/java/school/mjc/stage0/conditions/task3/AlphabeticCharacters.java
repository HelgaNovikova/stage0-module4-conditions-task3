package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String allVowels = "eyuioa";
        String allConsonant = "qwrtpsdfghjklzxcvbnm";
        if (allVowels.indexOf(Character.toLowerCase(character)) != -1){
            System.out.println("Vowel");
        }
        else if (allConsonant.indexOf(Character.toLowerCase(character)) != -1){
            System.out.println("Consonant");
        }
        else System.out.println("wrong alphabet!");
    }
}
