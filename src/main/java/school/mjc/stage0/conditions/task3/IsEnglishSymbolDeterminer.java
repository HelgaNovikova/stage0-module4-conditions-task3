package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        String allLetters = "qwertyuiopasdfghjklzxcvbnm";
        if (allLetters.indexOf(Character.toLowerCase(symbol)) != -1){
            System.out.println("English");
        }
        else {
            System.out.println("Non English");
        }
    }
}
