import controllers.FuramaController;

public class Main {
    public static void main(String[] args) throws NumberFormatException{
        System.out.println("Hello world!");
//        FuramaController furama = new FuramaController();
//        furama.displayMenu();
        String s = "Cao đẳng";
        String s2 = s.toLowerCase();
        String s3 = "cao đẳng";

        System.out.println(s2 == s3);
        System.out.println(s2 + " " + s3);

    }
}