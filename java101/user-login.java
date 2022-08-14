import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password, select, newPassword;
        boolean state = true;

        while (state) {
            System.out.println("Kullancı adı giriniz: ");
            username = scanner.nextLine();
            System.out.println("Şifre giriniz: ");
            password = scanner.nextLine();

            if (username.equals("patika")) {
                if (password.equals("java123")) {
                    System.out.println("Giriş Başarılı!");
                    state = false;
                } else {
                    System.out.println("Bilgileriniz Yanlış!");
                    System.out.println("Şifrenizi Sıfırlamak İster Misniz?(Evet/Hayır)");
                    select = scanner.nextLine();
                    while (true) {
                        if (select.equals("Evet")) {
                            System.out.println("Yeni şifre giriniz: ");
                            newPassword = scanner.nextLine();
                            if (newPassword.equals("java123")) {
                                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                            } else {
                                System.out.println("Şifre oluşturuldu.");
                                state = false;
                                break;

                            }
                        } else if (select.equals("Hayır")) {
                            state = false;
                            break;
                        } else {
                            System.out.println("Hatalı seçim yaptınız.");
                            System.out.println("Şifrenizi Sıfırlamak İster Misniz?(Evet/Hayır)");
                            select = scanner.nextLine();
                        }
                    }
                }
            }else {
                System.out.println("Kullanıcı adı veya şifre yanlış.");
            }

        }

    }
}
