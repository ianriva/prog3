/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.List;

public class Empleado {

    private String nombre;
    private long cuit;
    private String domicilio;
    private String email;

    private List<Asistencia> asistencias;
    private List<Tardanza> tardanzas;
    private RegimenHorario regimenhorario;

    public List<Asistencia> getDiasAsistenciaXMesXAnio(int mes, int anio) {
        List<Asistencia> asistenciasPorFecha = null;
        if (asistencias != null) {
            for (Asistencia asistencia : asistencias) {
                if (asistencia.getFecha().getYear() == anio && asistencia.getFecha().getMonth() == mes) {
                    asistenciasPorFecha.add(asistencia);
                }
            }
        }
        return asistenciasPorFecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(List<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }

    public List<Tardanza> getTardanzas() {
        return tardanzas;
    }

    public void setTardanzas(List<Tardanza> tardanzas) {
        this.tardanzas = tardanzas;
    }

    public RegimenHorario getRegimenhorario() {
        return regimenhorario;
    }

    public void setRegimenhorario(RegimenHorario regimenhorario) {
        this.regimenhorario = regimenhorario;
    }
}
