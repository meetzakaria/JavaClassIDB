package Class5;

public class TestRandomCharacter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_lINE = 25;

        for(int i = 0 ; i < NUMBER_OF_CHARS; i++){
            char ch = RandomCharacter.getRandomLoweCaseLetter();
            if ((i+1)% CHARS_PER_lINE == 0) {
                System.out.println();
            }
            else {
                System.out.print(ch);
            }        }
    }
}
