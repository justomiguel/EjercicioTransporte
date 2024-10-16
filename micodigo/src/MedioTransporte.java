public abstract class MedioTransporte {

    private int multplicador;
    private int distancia;

    public int getMultplicador() {
        return multplicador;
    }

    public void setMultplicador(int multplicador) {
        this.multplicador = multplicador;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double calcularCosto(int distancia){
        setDistancia(distancia);
        return getMultplicador()*getDistancia();
    }

    public double calcularCosto(){
        return getMultplicador()*getDistancia();
    }

    public abstract void estacionar();

}
