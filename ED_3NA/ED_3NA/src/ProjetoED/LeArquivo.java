package ProjetoED;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author leona
 */
public class LeArquivo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        ListaEncadeada2 lst = new ListaEncadeada2();
        //lst.CompactaArquivo("descompactado.txt");

        lst.descompactarArqV2("compactado.txt");

    }
}
