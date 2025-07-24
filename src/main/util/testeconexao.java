
public class testeconexao{

    public static void main  (String[] args){
        try{
            util.ConexDB.conectar();
        } catch (ClassNotFoundException e) {
            System.out.println ("Erro " + e.getMessage());
        }
    }
}