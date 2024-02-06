package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        character = Character.toLowerCase(character);
        if (!((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z') )) {System.out.println("wrong alphabet!");}
        else if (character == 'a' || character == 'o' || character == 'e' || character == 'u' || character == 'i' || character == 'y') {System.out.println("Vowel");}
        else {System.out.println("Consonant");}
    }
}
