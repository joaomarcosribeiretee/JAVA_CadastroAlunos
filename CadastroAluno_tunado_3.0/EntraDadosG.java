import javax.swing.JOptionPane;
/**
 * Classe destinada a perguntar e recerber a resposta do usuaria e analizar se a prorpia é possivel.(via caixas de diálogo)
 * 
 * @author André Cavalcanti Teles dos Santos,João Marcos Ribeirete Garbelini,Mateus Neves Erédia,Vitor Assunção Silva 
 * @version 20/04/2023
 */

public class EntraDadosG implements Interface {

    String aux=null;
    boolean TestBool;
    /**
     * lerTotalAlunos() - Rebece o valor do usuario e testa se ele é possivel.
     *
     * @return int, numero recebido pelo usuario.
     */

    

    public int lerOpcao() {
        int opcao = 0;
        TestBool = false;
        do{
            try {
                aux = JOptionPane.showInputDialog("Digite uma opção: \n1 – Inserir \n2 – Remover \n3 – Listar\n4 – SAIR");
                opcao = Integer.parseInt(aux);
                TestBool = true;
            } catch (NumberFormatException e ) {
                if (aux == null) { // Caso o usuário clique no botão cancelar
                    JOptionPane.showMessageDialog(null,"Programa fechado");
                    System.exit(0);
                } else if (aux.trim().isEmpty()) { // Se o nome digitado está vazio ou contém apenas espaços em branco
                    JOptionPane.showMessageDialog(null,"Obrigatório digitar uma das opções (1,2,3,4), tente novamente");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de formato do numero, tente novamente");
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
                nome = JOptionPane.showInputDialog("Forneca o nome do aluno");
                if (nome == null) { //Caso o usuário clique no botão cancelar
                    
                    //System.exit(0);
                    return null;
                } else if (nome.trim().isEmpty()) { // Se o nome digitado está vazio ou contém apenas espaços em branco
                    JOptionPane.showMessageDialog(null,"Obrigatório digitar um nome, tente novamente");
                } else {
                    TestBool = true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        } while (!TestBool);

        return nome;
    }

    public String lerRA() {
        String ra = null;
        TestBool = false;
        do {
            try {
                ra = JOptionPane.showInputDialog("Forneca o ra do aluno");
                if (ra == null) { //Caso o usuário clique no botão cancelar
                    
                    //System.exit(0);
                    return null;
                } else if (ra.trim().isEmpty()) { // Se o nome digitado está vazio ou contém apenas espaços em branco
                    JOptionPane.showMessageDialog(null,"Obrigatório digitar o RA(numero), tente novamente");
                } else {
                    TestBool = true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        } while (!TestBool);

        return ra;
    }

    public String lerRemover(){
        String raremov= null;
        TestBool = false;
        do{
            try{
                raremov = JOptionPane.showInputDialog("Insira o ra do aluno");
                if(raremov==null){
                    
                    //System.exit(0);
                    return null;
                }else if(raremov.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Obrigatório digitar o RA(numero), tente novamente");
                } else {
                    TestBool = true;
                }
            }catch(NumberFormatException e){
                if(raremov.trim().isEmpty())
                    JOptionPane.showMessageDialog(null,"Erro: " + e.getMessage());
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
                aux = JOptionPane.showInputDialog("Forneca a idade do aluno: ");

                idade = Integer.parseInt(aux);

                if(idade<=0)
                {
                    JOptionPane.showMessageDialog(null,"Valor inválido");
                }else
                {
                    TestBool = true;
                }

            }catch(NumberFormatException e){
                if(aux==null){
                    
                    return 0;
                    //System.exit(0);
                }else if(aux.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Obrigatório digitar a idade(numero), tente novamente");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de formato do numero, tente novamente");
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
        TestBool=false;
        int total = 0;
        do{
            try{
                aux = JOptionPane.showInputDialog("Forneca a quantidade de disciplinas cursadas pelo aluno: ");

                total = Integer.parseInt(aux);

                if(total<=0)
                {
                    JOptionPane.showMessageDialog(null,"Valor inválido");
                }else
                {
                    TestBool = true;
                }

            }catch(NumberFormatException e){
                if(aux==null){
                    
                    //System.exit(0);
                    return 0;
                }else if(aux.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Obrigatório digitar a quantidade(numero), tente novamente");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de formato do numero, tente novamente");
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
                disciplina= JOptionPane.showInputDialog("Insira o nome da matéria");

                if(disciplina==null){
                    
                    //System.exit(0);
                    return null;
                }else if(disciplina.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Obrigatório digitar o nome da matéria, tente novamente");
                } else {
                    TestBool = true;
                }
            }catch(NumberFormatException e){
                if(disciplina.trim().isEmpty())
                    JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }while(!TestBool);

        return disciplina;
    } 

    public float lerNota(){ 
        float nota = -1;
        TestBool = false;
        do{
            try{
                aux = JOptionPane.showInputDialog("Forneca a nota do aluno: ");

                nota = Float.parseFloat(aux);
                if((nota <  0) || (nota>10)){
                    JOptionPane.showMessageDialog(null,"Obrigatório digitar uma nota (0 >= nota <= 10), tente novamente");                   
                }else{
                    TestBool = true;
                }
            }catch(Exception e){
                if (aux == null){
                    
                    //System.exit(0);
                    return -1;
                }else if(aux.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Obrigatório digitar uma nota (0 <= nota <= 10), tente novamente");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de formato do numero, tente novamente");
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
                aux = JOptionPane.showInputDialog("Forneca o período do aluno: ");
                ano=Integer.parseInt(aux);

                if(ano<=0)
                {
                    JOptionPane.showMessageDialog(null,"Valor inválido");
                }else
                {
                    TestBool = true;
                }

            }catch(NumberFormatException e){
                if(aux==null){
                    
                    //System.exit(0);
                    return 0;
                }else if(aux.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Obrigatório digitar um numero do período, tente novamente");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Erro de formato do numero, tente novamente");
                }
            }
        }while(!TestBool);

        return ano;
    }

}

