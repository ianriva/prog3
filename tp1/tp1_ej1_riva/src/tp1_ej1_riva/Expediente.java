package tp1_ej1_riva;

import java.util.ArrayList;
import java.util.List;

public class Expediente {

    private int id;
    private String letra;
    private int numero;
    private String descripcion;
    private String tipo;
    private String ambito;
    private Expediente expedientePadre;
    private List<Expediente> expedientesHijos;
    private List<Control> controles;

    public boolean getEstadoControles() {
        boolean todosAprobados = true;
        for (Control control : controles) {
            if (!(control.getEstadoControl().isAprobado())) {
                todosAprobados = false;
                break;
            }
        }
        return todosAprobados;
    }

    public List<Control> getControles() {

        return controles;
    }

    public void setControles(List<Control> controles) {
        this.controles = controles;
    }

    public List<Expediente> listaExpedientes() {
        List<Expediente> listaRecursiva = new ArrayList<Expediente>();
        listaExpedientesRecursion(this, listaRecursiva);
        return listaRecursiva;
    }

    public void listaExpedientesRecursion(Expediente ex, List<Expediente> lista) {
        lista.add(ex);
        if (ex.getExpedientesHijos() != null) {
            for (Expediente exHijo : ex.getExpedientesHijos()) {
                listaExpedientesRecursion(exHijo, lista);
            }
        }

    }

    public String getCaratulaExpediente() {
        return (String.valueOf(numero) + "-" + letra + "-" + descripcion);
    }

    public String getControlesObligatorios() {
        String lista = "";
        if (controles != null) {
            for (Control control : controles) {
                lista += control.getDenominacion() + ", ";
            }
        }
        return lista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public Expediente getExpedientePadre() {
        return expedientePadre;
    }

    public void setExpedientePadre(Expediente expedientePadre) {
        this.expedientePadre = expedientePadre;
    }

    public List<Expediente> getExpedientesHijos() {
        return expedientesHijos;
    }

    public void setExpedientesHijos(List<Expediente> expedientesHijos) {
        this.expedientesHijos = expedientesHijos;
    }
}
