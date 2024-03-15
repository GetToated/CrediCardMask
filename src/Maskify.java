public class Maskify {
    public static String maskify(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        int largo = str.length();
        if (largo <= 4) {
            return str;
        }
        String guardar = "";
        for (int i = 0; i < largo - 4; i++) {
            guardar += "#";
        }
        guardar += str.substring(largo - 4);
        return guardar;
    }
    public static void main(String[] args) {
        String numero = "436576545";
        String otro = "Hola me llamo lucas";
        String si = "05HolaSi";
        System.out.println(maskify(numero));
        System.out.println(maskify(otro));
        System.out.println(maskify(si));
    }
}
