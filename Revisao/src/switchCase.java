import java.util.Scanner;
public class switchCase {
        public static void main(String[] args) throws Exception {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite o horário: "); 
            int hora = in.nextInt();
            
            switch(hora)
            {
                case 0 || 1 || 3 || 4 || 5:
                System.out.println("Boa madrugada!");
                break;

                case 6, 7, 8, 9, 10, 11:
                System.out.println("Bom dia!");
                break;

                case 12, 13, 14, 15, 16, 17:
                System.out.println("Boa tarde!");
                break;

                case 18, 19, 20, 21, 22, 23, 24:
                System.out.println("Boa noite!");
                break;
            }

}
}
