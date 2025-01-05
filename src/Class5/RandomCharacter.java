package Class5;

public class RandomCharacter {
    public static char getRandomcharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

        public static char getRandomLoweCaseLetter() {
            return getRandomcharacter('a', 'z');
        }

            public static char getRandomUpperCaseLetter() {
                return getRandomcharacter('A', 'Z');
            }

                public static char getrandomDigitCharacter() {
                    return getRandomcharacter('0', '9');
                }

                    public static char getrandomcharacter() {
                        return getRandomcharacter('\u0000', '\uFFFF');
                    }

}
