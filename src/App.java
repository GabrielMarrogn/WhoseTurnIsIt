import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int soma = 0;
        

        for(int i = 0; i < a; i++){
            String b = br.readLine();
            String[] nome = b.split(" ");

            String c = br.readLine();
            String[] num = c.split(" ");
            int num1 = Integer.parseInt(num[0]);
            int num2 = Integer.parseInt(num[1]);

            soma = num1 + num2;

            if(soma%2 ==0){
                if(nome[1].equals("PAR")){
                    System.out.println(nome[0]);
                }else{
                    System.out.println(nome[2]);
                }
            }else if(soma%2 != 0){
                if(nome[1].equals("IMPAR")){
                    System.out.println(nome[0]);
                }else{
                    System.out.println(nome[2]);
                }
            }
        }
    }
}
