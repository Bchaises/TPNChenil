/*
 * Cette classe est présente à titre d'exemple, ne doit être ni modifiée ni rendue
 */
package interrochenil;

public class Client {
    private final int numClient;
    private String nomClient;

    public Client(int nu, String no) {
        this.numClient = nu;
        this.nomClient = no;
    }

    public int getNumClient() {
        return this.numClient;
    }

    public String getNomClient() {
        return this.nomClient;
    }

    public void setNomClient(String no) {
        this.nomClient = no;
    }

    @Override
    public String toString() {
        return "Client{" + "numClient=" + numClient + ", nomClient=" + nomClient + '}';
    }
    
}
