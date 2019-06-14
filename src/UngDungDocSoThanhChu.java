import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        System.out.print("Moi nhap So ");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        char[] ch = num.toCharArray();
        String cachgoiso = "";
        switch (num.length()) {
            case 1:
                cachgoiso = check(ch[0]);
                break;
            case 2:
                cachgoiso = (check(ch[0])==" một "?" ":check(ch[0])) + " muoi " + check(ch[1]);
                break;
            case 3:
                cachgoiso = check(ch[0]) + " tram " + check(ch[1]) + " muoi " + check(ch[2]);
                break;
            default:
                cachgoiso = "ngoai pham vi";
        }
        System.out.print(cachgoiso);
    }

    public static String check(char num) {
        String TenSo = "";
        switch (num) {
            case '0':
                TenSo = "";
                break;
            case '1':
                TenSo = " một ";
                break;
            case '2':
                TenSo = " hai ";
                break;
            case '3':
                TenSo = " ba ";
                break;
            case '4':
                TenSo = " bốn";
                break;
            case '5':
                TenSo = " năm ";
                break;
            case '6':
                TenSo = " sáu ";
                break;
            case '7':
                TenSo = " bảy ";
                break;
            case '8':
                TenSo = " tám ";
                break;
            case '9':
                TenSo = " chín ";
                break;
        }
        return TenSo;
    }
}
