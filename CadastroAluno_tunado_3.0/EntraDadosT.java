import java.util.Scanner;
/**
 * Classe destinada a perguntar e recerber a resposta do usuaria e analizar se a prorpia é possivel.(via janela de Terminal)
 * 
 * @author André Cavalcanti Teles dos Santos,João Marcos Ribeirete Garbelini,Mateus Neves Erédia,Vitor Assunção Silva
 * @version 20/04/2023
 */

public class EntraDadosT implements Interface {
    Scanner scanner = new Scanner(System.in);
    static String aux=null;
    boolean TestBool;
    /**
     * lerTotalAlunos() - Rebece o valor do usuario e testa se ele é possivel.
     *
     * @return int, numero recebido pelo usuario.
     */

    public int lerOpcao() {
        int opcao=0;
        TestBool = false;
        do{
            try {
                System.out.println("Digite uma opção: \n1 – Inserir \n2 – Remover \n3 – Listar\n4 – SAIR");
                aux = scanner.nextLine();

                opcao = Integer.parseInt(aux);
                TestBool = true;
            } catch (NumberFormatException e ) {
                if (aux == null) { 
                    System.out.println("Operação Negada!");
                } else if (aux.trim().isEmpty()) { // Se o nome digitado está vazio ou contém apenas espaços em branco
                    System.out.println("ERRO: Valor nulo");
                }else{
                    System.out.println("Erro de formato do numero,tente novamente");
                }
            }
        } while (!TestBool);

        return(opcao);
    }

    public String lerNome() {
        String nome = null;
        TestBool = false;

        do {
            try {
                System.out.println("Forneca o nome do aluno");
                nome = scanner.nextLine();
                if (nome == null) { 
                    System.out.println("Operação Negada!");
                } else if (nome.trim().isEmpty()) { // Se o nome digitado está vazio ou contém apenas espaços em branco
                    System.out.println("Obrigatório digitar um nome, tente novamente");
                } else {
                    TestBool = true;
                }
            } catch (Exception e) {
                System.out.println( "Erro: " + e.getMessage());
            }
        } while (!TestBool);

        return nome;
    }

    public String lerRA() {
        String ra = null;
        TestBool = false;

        do {
            try {
                System.out.println("Forneca o ra do aluno");
                ra = scanner.nextLine();
                if (ra == null) { 
                    System.out.println("Operação Negada!");
                } else if (ra.trim().isEmpty()) { // Se o nome digitado está vazio ou contém apenas espaços em branco
                    System.out.println("Obrigatório digitar um RA, tente novamente");
                } else {
                    TestBool = true;
                }
            } catch (Exception e) {
                System.out.println( "Erro: " + e.getMessage());
            }
        } while (!TestBool);

        return ra;
    }

    public String lerRemover(){
        String raremov= null;
        TestBool = false;
        do{
            try{
                System.out.println("Insira o ra do aluno");
                raremov = scanner.nextLine();
                if(raremov==null){
                    System.out.println("Operação Negada!");
                }else if(raremov.trim().isEmpty()){
                    System.out.println("Obrigatório digitar um RA, tente novamente");
                }else{
                    TestBool = true;
                }
            }catch(NumberFormatException e){
                if(raremov.trim().isEmpty())
                    System.out.println("Erro: " + e.getMessage());
            }
        }while(!TestBool);
        return raremov;
    } 

    /**
     * lerIdade - entrada de idade (grafica)
     *
     * @return int, idade fornecida
     */
    public int lerIdade(){ 
        int idade =0 ; 
        TestBool=false;
        do{
            try{
                System.out.println("Forneca a idade do aluno: ");
                aux = scanner.nextLine();

                idade = Integer.parseInt(aux);
                if(idade >= 0)
                {
                    TestBool = true;
                }else
                {
                    System.out.println("Não existe idade negativa, tente novamente");
                }

            }catch(NumberFormatException e){
                if(aux==null){
                    System.out.println("Operação Negada!");
                }else if(aux.trim().isEmpty()){
                    System.out.println("Obrigatório digitar uma idade, tente novamente");
                }else {
                    System.out.println("Erro de formato do numero, tente novamente");
                }
            }
        }while(!TestBool);

        return idade;
    }

    /**
     * lerNota - entrada de nota (grafica)
     *
     * @return float, nota fornecida
     * 
     */

    public int lerTotalDisciplinas(){ 
        int total = 0;
        TestBool=false;
        do{
            try{
                System.out.println("Forneca a quantidade de disciplinas cursadas pelo aluno: ");
                aux = scanner.nextLine();

                total = Integer.parseInt(aux);

                if(total <= 0)
                {
                    System.out.println("Quantidade de disciplinas invalida, tente novamente");
                }
                else
                {
                    TestBool = true;
                }

            }catch(NumberFormatException e){
                if(aux==null){
                    System.out.println("Operação Negada!");
                }else if(aux.trim().isEmpty()){
                    System.out.println("Obrigatório digitar um numero inteiro, tente novamente");
                }else{
                    System.out.println("Erro de formato do numero, tente novamente");
                }
            }
        }while(!TestBool);

        return total;
    }

    public String lerDisciplina(){
        String disciplina = null;
        TestBool = false;
        do{
            try{
                System.out.println("Informe o nome da matéria");
                disciplina = scanner.nextLine();
                if(disciplina==null){
                    System.out.println( "Operação Cancelada!");
                }else if(disciplina.trim().isEmpty()){
                    System.out.println("Obrigatório digitar um nome de matéria, tente novamente");
                } else {
                    TestBool = true;
                }
            }catch(NumberFormatException e){
                if(disciplina.trim().isEmpty())
                    System.out.println( "Erro: " + e.getMessage());
            }
        }while(!TestBool);

        return disciplina;
    } 

    public float lerNota(){ 
        float nota = -1;
        TestBool = false;
        do{
            try{
                System.out.println("Forneca a nota do aluno: ");
                aux = scanner.nextLine();

                nota = Float.parseFloat(aux);
                if((nota <  0) || (nota>10)){
                    System.out.println("Nota impossivel, tente novamente");                   
                }else{
                    TestBool = true;
                }
            }catch(Exception e){
                if (aux == null){
                    System.out.println("Canelamente bem sucedido!");
                }else if(aux.trim().isEmpty()){
                    System.out.println("Obrigatório digitar uma nota (0 >= nota <= 10), tente novamente");
                }else{
                    System.out.println("Erro de formato do numero, tente novamente");
                }
            }
        }while(!TestBool);

        return nota;
    }

    public int lerAno(){ 
        int ano = 0;
        TestBool=false;
        do{
            try{
                System.out.println("Forneca a período do aluno: ");
                aux = scanner.nextLine();
                ano=Integer.parseInt(aux);
                if(ano >= 0)
                {
                    TestBool = true;
                }
                else
                {
                    System.out.println("Periodo inexistente, tente novamente");
                }

            }catch(NumberFormatException e){
                if(aux==null){
                    System.out.println("Operação Negada!");
                }else if(aux.trim().isEmpty()){
                    System.out.println("Obrigatório digitar o numero, tente novamente");
                }
                else{
                    System.out.println("Erro de formato do numero, tente novamente");
                }
            }
        }while(!TestBool);

        return ano;
    }
}

