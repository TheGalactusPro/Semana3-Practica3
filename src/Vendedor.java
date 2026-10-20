public class Vendedor {
    private String nombre;
    private double ventas;
    private double comision;
    private boolean activo;

    //Setters

    public void setNombre(String nombre) {
        if(nombre!=null && !nombre.isBlank()){
            this.nombre = nombre;
        }
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setComision(double comision) {
        if(comision>=0 && comision<=100){
            this.comision = comision;
        }
    }

    public void setVentas(double ventas) {
        if(ventas>0){
            this.ventas = ventas;
        }
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public double getVentas() {
        return ventas;
    }

    public double getComision() {
        return comision;
    }


    public void mostrarInformacion(){
        System.out.println("Nombre: " +getNombre()+
                "\nVentas: " +getVentas()+
                "\nComision: " +getComision()+
                "\nEstado: " +(activo? "ACTIVADO":"DESACTIVADO"));
    }

    public void activar(){
        activo = true;
    }

    void desactivar(){
        activo = false;
    }

    public void registrarVenta(double cantidad){
        if(cantidad>=0){
            ventas=ventas+cantidad;
        }
    }
}
