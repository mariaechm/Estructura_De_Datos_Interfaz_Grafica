import java.util.List;

public class Nodo implements INodo{

    private int valor;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public boolean agregar(int valor) {
        if (this.valor > valor){
            if(this.izquierda == null) {
                this.izquierda = new Nodo(valor);
                return true;
            }else {
                this.izquierda.agregar(valor);
            }
        }else{
            if(this.derecha == null) {
                this.derecha = new Nodo(valor);
                return true;
            }else {
                this.derecha.agregar(valor);
            }
        }
        return false;
    }
    public void postOrden(List<Integer> resultado) {
        if (this.izquierda != null) {
            this.izquierda.postOrden(resultado);
        }
        if (this.derecha != null) {
            this.derecha.postOrden(resultado);
        }
        resultado.add(this.valor);
    }

    public void preOrden(List<Integer> resultado) {
        resultado.add(this.valor);
        if (this.izquierda != null) {
            this.izquierda.preOrden(resultado);
        }
        if (this.derecha != null) {
            this.derecha.preOrden(resultado);
        }
    }

    public void inOrden(List<Integer> resultado) {
        if (this.izquierda != null) {
            this.izquierda.inOrden(resultado);
        }
        resultado.add(this.valor);
        if (this.derecha != null) {
            this.derecha.inOrden(resultado);
        }
    }
    }
