
import java.util.Scanner;

/**
 *
 * @author Ephraim e Diogo
 * 
 * 
 */
public class main {
    
 /**
 *
 * Metodo responsavel por executar o app
 * @param args 
 * 
 * 
 */
    public static void main(String[] args) {
        //Scanner usado para que o usuario possa interagir ativamente com o uso do teclado
        Scanner leitor = new Scanner(System.in);
        
        Cliente c  = new Cliente();
        Filme f = new Filme();
        
        System.out.println("===BEM VINDO AO CINEMA===");
        
        //variavel inteita que define o que será executado a partir do switch
        int var = 0;
        
        System.out.println("1 Digite Nome,Ano e classificação do seu Filme que "
                + "queres assistir \n");
        System.out.println("2 Digite o seu Nome, sua Idade e seu cpf ");
        System.out.println("3 Mostrar dados do ingresso!");
        
        while (var!=0) { //repetidor que faz o switch ser repetido até que o usuário deseje sair
            var = leitor.nextInt();//variavel que manipula o switch executada de acordo com o while
        switch (var) {  //switch que define o que será feito
            case 1: 
                System.out.print("Nome do Filme: ");
                f.setNome(leitor.next());
                System.out.println("Ano do Filme: ");
                f.setAno(leitor.nextInt());
                System.out.println("Classificação: ");
                f.setClassificacao(leitor.nextInt());
                break;
            case 2:
                System.out.print("Nome: ");
                c.setNome(leitor.next());
                System.out.println("Idade: ");
                c.setIdade(leitor.nextInt());
                System.out.println("CPF: ");
                c.setCpf(leitor.next());
                break;
            case 3:
                c.setCodCliente(011);
                c.setDesconto("5%");
                c.setPreferencia("Bons Filmes Conhecidos!");
                System.out.println("-----------------");
                System.out.println("DADOS DO INGRESSO");
                System.out.println("Cliente: "+c.getNome()+", "+c.getIdade()
                        +" anos");
                System.out.println("Código do Cliente: "+c.getCodCliente());
                System.out.println("Filme: "+f.getNome()+", Ano:"+f.getAno());
                
                break;
            default:
                throw new AssertionError();
        }
    }    
            
        }
        
    
}
