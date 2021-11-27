public final class NyString {

    private final String tekst;

    public NyString(String tekst){
        this.tekst = tekst;
    }

    public String forkorte() {
        String[] ord = tekst.split(" ");
        String s = "";
        for (String a : ord){
            s += a.charAt(0);
        }
        return s;
    }

    public String fjerne(char a) {
        String nyTekst = "";
        nyTekst = tekst.replaceAll(Character.toString(a), "");
        return nyTekst;
    }


    public static void main(String[] args) {
        NyString ns = new NyString("denne setningen kan forkortes");
        System.out.println(ns.forkorte());
        System.out.println(ns.fjerne('e'));
    }

}
