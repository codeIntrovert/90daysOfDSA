//https://leetcode.com/problems/defanging-an-ip-address/

public class DefangIPAddress {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");

    }

    public static void main(String[] args) {
        DefangIPAddress dp = new DefangIPAddress();

        // Test cases
        String address1 = "1.1.1.1";
        System.out.println("Input: " + address1);
        System.out.println("Output: " + dp.defangIPaddr(address1)); // Expected: "1[.]1[.]1[.]1"

        String address2 = "255.100.50.0";
        System.out.println("Input: " + address2);
        System.out.println("Output: " + dp.defangIPaddr(address2)); // Expected: "255[.]100[.]50[.]0"
    }
}
