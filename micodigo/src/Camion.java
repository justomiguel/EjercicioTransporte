public class Camion extends MedioTransporte {

    public Camion() {
        setMultplicador(15);
    }

    @Override
    public void estacionar(){
        System.out.println("Estacione el camion");
    }
}
