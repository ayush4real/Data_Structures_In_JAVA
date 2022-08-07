package Strings;

public class DefangingIPAddress {
    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }

    public static void main(String[] args) {
        String str="255.100.50.0";
        System.out.println(str);
        System.out.println(defangIPaddr(str));
    }
}
