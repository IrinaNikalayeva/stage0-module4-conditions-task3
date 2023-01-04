package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    String vowelSymbols = "aeiouAEIOU";
    public void vowelDeterminer(char character) {
        if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
            if (vowelSymbols.indexOf(character) >= 0) {
                System.out.println("Vowel");
            }
            else {
                System.out.println("Consonant");
            }
        }
        else {
            System.out.println("wrong alphabet!");
        }
    }
}
