import java.util.ArrayList;
import java.util.List;

public class ArbolBinario implements EstructuraDeDato {

    private Nodo raiz;
    
    public ArbolBinario(int valor) {
        this.raiz = new Nodo(valor);  
    }

    @Override
    public boolean agregar(int valor) {
        return raiz.agregar(valor);
    }

    public List <Integer> inOrden() {
        List <Integer> resultado = new ArrayList<>();
        this.raiz.inOrden(resultado);
        return resultado;
    }

    public List <Integer> postOrden(){
        List <Integer> resultado = new ArrayList<>();
        this.raiz.postOrden(resultado);
        return resultado;
    }

    public List <Integer> preOrden() {
        List <Integer> resultado = new ArrayList<>();
        this.raiz.preOrden(resultado);
        return resultado;
    }

}
