import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario(10);
        arbol.agregar(5);
        arbol.agregar(6);
        arbol.agregar(15);
        arbol.agregar(12);
        arbol.agregar(28);
        arbol.agregar(8);
        arbol.agregar(3);
        List<Integer> inOrden = arbol.inOrden();
        List<Integer> postOrden = arbol.postOrden();
        List<Integer> preOrden = arbol.preOrden();

        System.out.println("InOrden: " + inOrden);
        System.out.println("PostOrden: " + postOrden);
        System.out.println("PreOrden: " + preOrden);

    }
}