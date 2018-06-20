
package projeto;
import java.util.Scanner;

public class RemoverProduto {
    private float alcoolicar;
    private float naoAlcoolicar;
    private String codigor;
    private String nomer;
    private float valorr;
    
    
    public void RemoverProduto(float _alcoolicar, float _naoAlcoolicar, String _codigor, String _nomer, float _valorr){
        
        this.naoAlcoolicar = _naoAlcoolicar;
        this.alcoolicar = _alcoolicar;
        this.codigor = _codigor;
        this.nomer = _nomer;
        this.valorr = _valorr;        
    System.out.println("Escolha como remover:");
    }

    public float getAlcoolicar() {
        return alcoolicar;
    }

    public void setAlcoolicar(float alcoolicar) {
        this.alcoolicar = alcoolicar;
    }

    public float getNaoAlcoolicar() {
        return naoAlcoolicar;
    }

    public void setNaoAlcoolicar(float naoAlcoolicar) {
        this.naoAlcoolicar = naoAlcoolicar;
    }

    public String getCodigor() {
        return codigor;
    }

    public void setCodigor(String codigor) {
        this.codigor = codigor;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public float getValorr() {
        return valorr;
    }

    public void setValorr(float valorr) {
        this.valorr = valorr;
    }
    Scanner entrada = new Scanner(System.in);
    int remover = entrada.nextInt();
    
}