package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;

    private static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        TV.numTV++;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal<121 && canal>1)
            this.canal = canal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public void turnOn() {
        estado = true;
    }

    public void turnOff() {
        estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp(){
        if (getEstado() && getCanal()<120)
            setCanal(getCanal()+1);
    }

    public void canalDown(){
        if (getEstado() && getCanal()>1)
            setCanal(getCanal()-1);
    }

    public void volumenUp(){
        if (getEstado() && getVolumen()<7)
            setVolumen(getVolumen()+1);
    }

    public void volumeDown(){
        if (getEstado() && getVolumen()>0)
            setVolumen(getVolumen()-1);
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
}