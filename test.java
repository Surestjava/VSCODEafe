import java.util.Scanner;  // motivo: entrada de usuario 

public class test{

public static void main(String[] args) {
    
String login = "surest";
String password = "leo123";          //System.in le do teclado
Scanner account = new Scanner(System.in); //new — é uma palavra que cria o scanner na memória toda vez que voce usa uma classe mais complexa  

String attempt =  "";
String attemptPassword = "";
int tentativas = 0 ;
int limite  = 3;                                                                                   // ! significa nao esta certo
                                                                                                  // || significa "ou" o loop continua enquanto o login ou a senha estiver errado. &
while ((!attempt.equals(login) ||  !attemptPassword.equals(password)) && tentativas < limite)  { //cod pra pedir login - && lógico comparador de condições 
System.out.println("digite o login");
attempt = account.nextLine(); //nextLine le a proxima linha

System.out.println("digite a senha");
attemptPassword = account.nextLine();

// verifica os 2 juntos com o comando &&
if (attempt.equals(login) && attemptPassword.equals(password)) {
    System.out.println("login de usuario correto");
} else {
    tentativas++;
    System.out.println("login incorreto, poxa vida. Tentativas restantes:" + (limite - tentativas));
    }
}

if (tentativas == limite ) {  
    System.out.println("Conta bloqueada! excesso de tentativas.");

}


account.close();

         }
   }
