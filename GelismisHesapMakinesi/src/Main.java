import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    static void plus() {
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = sc.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = sc.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void times() {
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = sc.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void divided() {
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = sc.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = sc.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void power() {
        System.out.print("Taban değeri giriniz: ");
        int base = sc.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int exponent = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç: " + result);
    }

    static void factorial() {
        System.out.print("Sayı giriniz: ");
        int n = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç: " + result);
    }

    static void modulus() {
        System.out.print("Modu alınacak sayıyı giriniz: ");
        int n = sc.nextInt();
        System.out.print(n + " sayısının kaça modunun alınmasını istiyorsunuz: ");
        int mod = sc.nextInt();
        System.out.println(n % mod);
    }

    static void areaAndPerimeter() {
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        int shortEdge = sc.nextInt();
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        int longEdge = sc.nextInt();
        System.out.println("Dikdörtgenin alanı: " + (shortEdge * longEdge));
        System.out.println("Dikdörtgenin çevresi" + 2 * (shortEdge + longEdge));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulus();
                case 8:
                    areaAndPerimeter();
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}