/**
 * OOPSBannerApp
 *
 * UC3: Prints the word "OOPS" in large banner format using String.join().
 *
 * @author Shweta
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                " *****  ", " *****  ", " ****** ", " ****** "));

        System.out.println(String.join(" ",
                "*     * ", "*     * ", "*     * ", "*      "));

        System.out.println(String.join(" ",
                "*     * ", "*     * ", "*     * ", "*      "));

        System.out.println(String.join(" ",
                "*     * ", "*     * ", "******  ", " ***** "));

        System.out.println(String.join(" ",
                "*     * ", "*     * ", "*       ", "      *"));

        System.out.println(String.join(" ",
                "*     * ", "*     * ", "*       ", "      *"));

        System.out.println(String.join(" ",
                " *****  ", " *****  ", "*       ", " ***** "));
    }
}