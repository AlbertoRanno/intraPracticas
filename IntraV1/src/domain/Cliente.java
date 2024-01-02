package domain;

import java.util.Date;

public class Cliente extends Persona {

    //Atributos
    private int idCliente;
    private static int acumuladorCliente;
    private Date fechaRegistro;
    private boolean vip;

    //Constructor vacio
    public Cliente(String horacio, String m, int par, String perdriel_34, Date from, boolean par1) {
        System.out.println("Constructor vacio de la clase Cliente");
    }

    //Constructor con argumentos
    public Cliente(String nombre, char genero, int edad, String direccion, Date fechaRegistro, boolean vip) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.acumuladorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

//    public void setIdCliente(int idCliente) {
//        this.idCliente = idCliente;
//    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
