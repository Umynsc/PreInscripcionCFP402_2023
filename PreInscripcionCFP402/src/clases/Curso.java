package clases;

import java.util.ArrayList;

public class Curso {

    String profesor;
    String hora_entrada;
    String hora_salida;
    String dias;
    String mes;
    String duracion;
    int cantAlumnos;

    ArrayList<Alumno> ListaAlumnos = new ArrayList<Alumno>();

    public Curso() {
        this.cantAlumnos = 0;
    }

    public Curso(String profesor, String hora_entrada, String hora_salida, String dias, String mes, String duracion) {
        this.profesor = profesor;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.dias = dias;
        this.mes = mes;
        this.duracion = duracion;
        this.cantAlumnos = 0;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return ListaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> ListaAlumnos) {
        this.ListaAlumnos = ListaAlumnos;
    }

    public int getCantAlumnos() {
        return cantAlumnos;
    }

    public void setCantAlumnos(int cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setNuevoAlumno(Alumno alu) {
        this.ListaAlumnos.add(alu);
    }

    public boolean existeAlumno(Alumno a) {
        return this.ListaAlumnos.contains(a);
    }

    public Alumno getAlumno(int i) {
        return this.ListaAlumnos.get(i);
    }

    public void delAlumno(int i) {
        this.ListaAlumnos.remove(i);
    }

    @Override
    public String toString() {
        return "Profesor: " + profesor + "\nHorario:\nDe " + hora_entrada
                + " a " + hora_salida + " hs\n los dias: " + dias
                + "\nInicio del Curso: " + mes + "\nDuracion: " + duracion
                + "\nCantidad PreInscriptos: " + cantAlumnos;
    }

}
