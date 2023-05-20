import javax.swing.JOptionPane;
import PessoaT.Pessoa;
import PessoaT.NomePessoa;
/**
 * Armazenador - classe para implementar operacoes de persistencia 
 * em memoria.
 *
 * @author Julio Arakaki
 * @version 05/2023
 */
public class CadastroAlunos{
    IArmazenador cadastro;
    private Aluno cad;
    private Disciplina disc[];
    int k;
    /**
     * CadastroClientes Construtor para armazenar objetos em memoria
     *
     */
    CadastroAlunos(int k){
        //this.cadastro = new VetDin();   // em VetDin
        this.cadastro = new ListaArray(); // em ArrayList
        //this.cadastro = new ListaLigadaSimples();
        setK(k);
    }
    
     private void setK(int k)   
    {
        this.k=k;   
    }  

    /**
     * salvarCliente em memoria
     *
     * @param client Cliente a ser adicionada no armazenador
     */
    public void inserir(Aluno aluno){
        cadastro.adicionar(aluno);
    }
    
    public boolean testeVazio(){
     return cadastro.estaVazia();
    }

    public void remover(String raremov){

        Aluno alunos = null;
        int find=0;
        
        if(!cadastro.estaVazia()){ // se cadastro nao estiver vazia
            for(int i = 0; i < cadastro.getQtd(); i++){
                // busca cliente no armazenador
                alunos = (Aluno)cadastro.buscar(i);
                // verifica se o sal eh negativo
                if(alunos.getRa().equals(raremov)){
                    if(k == 1)
                    {
                        JOptionPane.showMessageDialog(null,"Aluno(a) " + alunos.getNome() + " removido(a) com sucesso\n");
                    }
                    else
                    {
                        System.out.println("Aluno(a) " + alunos.getNome() + " removido(a) com sucesso\n");
                    }
                    
                    cadastro.remover(i);
                    find=1;
                }
            } 
            if(find==0){ // se não encontrar, quer dizer que o RA não existe na lista
                
                if(k == 1)
                    {
                        JOptionPane.showMessageDialog(null,"RA inválido, tente novamente\n");
                    }
                    else
                    {
                        System.out.println("RA inválido, tente novamente\n");
                    }
            }
        }   else if(k == 1)
                    {
                        JOptionPane.showMessageDialog(null,"Lista vazia! \n");
                    }
                    else
                    {
                        System.out.println("Lista vazia! \n");
                    }
    }
    
    /**
     * listarSaldoNegativo - imprime os clientes com saldo negativo
     *
     * @return O valor de retorno
     */
    public void listar(){
        int lvazia=1;
        int i=0;
        String s = "";
        if(!cadastro.estaVazia()){
            do{
                cad= (Aluno)cadastro.buscar(i); 
                if(k == 1)
                    {
                        JOptionPane.showMessageDialog(null,cad);
                    }
                    else
                    {
                        System.out.println(cad);
                    }
                

                listarMaterias(cad,disc); // para imprimir as materias correspondentes as dos alunos certos, passamos como parametro tanto o vetor como um todo como o índice atual da varredura

                i++;
            }while(i<cadastro.getQtd());
        }else if(k == 1)
                    {
                        JOptionPane.showMessageDialog(null,"Lista vazia! \n");
                    }
                    else
                    {
                        System.out.println("Lista vazia! \n");
                    }
           

    }

    public void listarMaterias (Aluno cad,Disciplina[] disc){
        int j=0;

        if(k == 1)
                    {
                        JOptionPane.showMessageDialog(null,"Materias do aluno: " +cad.getNome());
                    }
                    else
                    {
                        System.out.println("Materias do aluno: " +cad.getNome());
                    }
        
        for (j=0; j<cad.disc.length;j++){
            if((cad.disc[j]!=null)){ //acessamos o array disc por meio do array cad para verificar se as matérias associadas ao aluno não estão vazias
                
                if(k == 1)
                    {
                        JOptionPane.showMessageDialog(null,cad.disc[j]);
                    }
                    else
                    {
                        System.out.println(cad.disc[j]);
                    }
            }
        }
        System.out.println("\n\n");
    }

    public boolean boolRA(String ra){

        Aluno alunos = null;
        String s = "";
        boolean teste = true;
        if(!cadastro.estaVazia()){ // se cadastro nao estiver vazia
            for(int i = 0; i < cadastro.getQtd(); i++){
                // busca cliente no armazenador
                alunos = (Aluno)cadastro.buscar(i);
                // verifica se o sal eh negativo

                if(alunos.getRa().equals(ra))
                    teste=false;

            }
        }    
        return teste;
    }

    /**
     * toString imprime dados do cadastro
     *
     * @return String com os clientes
     */
    public String toString(){
        String s = "";
        if(cadastro != null){
            s = "\nAlunos: " + cadastro;
        }
        return s;
    }


}
