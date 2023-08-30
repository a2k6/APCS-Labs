//Code by Adrian Panezic
public class Easter {

        public static String date(){
            int year = 2021;
            int a = year % 19;
            int b = year / 100;
            int c = year % 100;
            int d = b / 4;
            int e = b % 4;
            int f = (b + 8) / 25;
            int g = (b - f + 1) / 3;
            int h = (19 * a + b - d - g + 15) % 30;
            int i = c / 4;
            int k = c % 4;
            int r = (32 + 2 * e + 2 * i -h - k) % 7;
            int m = (a + 11 * h + 22 * r) / 451;
            int n = (h + r - 7 * m + 114) / 31;
            int p = (h + r - 7 * m + 114) % 31;
            return("The date of Easter in " + year + " is " + n + "/" + (p + 1));
        }
        public static void main(String[] args)
        {
           System.out.println(Easter.date());
        }
}
