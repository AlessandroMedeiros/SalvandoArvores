
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 *
 * @author Alessandro Medeiros
 */
public class SalvandoArvore {

    static ArrayList list = new ArrayList<>();
    
    static void montaArvore(ArrayList list){
        int cont;
        String palavra;
        BinaryTree bt = new BinaryTree();
        for (int i=0; i<list.size(); i++){
            palavra = list.get(i).toString();
            bt.add(palavra);
        }
        BinaryTree teste = bt;
        cont = teste.getContador()/2;
        System.out.println("tamanho: " + cont);
    }

    public static void main(String[] args) {
        String palavra;
        String linha = "";
        list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Alessandro Medeiros\\Desktop\\alest2 t1\\casos_t1\\caso.txt"));
            while (br.ready()) {
                linha = br.readLine();
                String[] splitted = linha.split(" ");
                for (int i = 0; i < splitted.length; i++) {
                    palavra = splitted[i];
                    list.add(palavra);
                }
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        montaArvore(list);
        System.out.println("Alessandro");
    }
}
