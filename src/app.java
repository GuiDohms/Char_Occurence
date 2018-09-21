public class app {
    public static void main (String[] args){

        Char_Sequence one = new Char_Sequence("Passado");
        one.CharMostFrequent();
        one.result();

        Char_Sequence two = new Char_Sequence("aabbbccccc");
        two.CharMostFrequent();
        two.result();

        Char_Sequence three = new Char_Sequence("camelo");
        three.CharMostFrequent();
        three.result();

        Char_Sequence four = new Char_Sequence("aaa");
        four.CharMostFrequent();
        four.result();

        Char_Sequence five = new Char_Sequence("oooo");
        five.CharMostFrequent();
        five.result();

        Char_Sequence six = new Char_Sequence("Amoor");
        six.CharMostFrequent();
        six.result();

        Char_Sequence seven = new Char_Sequence("Corretor");
        seven.CharMostFrequent();
        seven.result();

        Char_Sequence eight = new Char_Sequence("Grêmiooooo");
        eight.CharMostFrequent();
        eight.result();
    }
}
