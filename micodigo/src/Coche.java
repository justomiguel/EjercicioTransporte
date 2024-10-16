public class Coche extends MedioTransporte {

    public Coche() {
        setMultplicador(10);
    }

    @Override
    public void estacionar(){
        System.out.println("Estacione el coche");
    }
}
