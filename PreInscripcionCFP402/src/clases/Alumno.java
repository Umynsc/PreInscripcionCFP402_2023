package clases;

public class Alumno {

    String nombre, apellido, tipo_dni, num_dni, nacionalidad, fecha_nac, lugar, inscribio, fecha, telefono, domicilio, localidad, cp;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String tipo_dni, String num_dni, String nacionalidad, String fecha_nac, String lugar, String inscribio, String fecha, String telefono, String domicilio, String localidad, String cp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_dni = tipo_dni;
        this.num_dni = num_dni;
        this.nacionalidad = nacionalidad;
        this.fecha_nac = fecha_nac;
        this.lugar = lugar;
        this.inscribio = inscribio;
        this.fecha = fecha;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.cp = cp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo_dni() {
        return tipo_dni;
    }

    public void setTipo_dni(String tipo_dni) {
        this.tipo_dni = tipo_dni;
    }

    public String getNum_dni() {
        return num_dni;
    }

    public void setNum_dni(String num_dni) {
        this.num_dni = num_dni;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getInscribio() {
        return inscribio;
    }

    public void setInscribio(String inscribio) {
        this.inscribio = inscribio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return ("\nNombre: " + nombre + " \nApellido: "
                + apellido + "\n" + tipo_dni + ": " + num_dni + "\nNacionalidad: "
                + nacionalidad + "\nFecha de nacimiento: " + fecha_nac + "\nLugar: "
                + lugar + "\nInscribio: " + inscribio + "\nFecha: " + fecha
                + "\nTelefono: " + telefono + "\nDomicilio: " + domicilio + "\nLocalidad: "
                + localidad + " CP:" + cp + "\n");
    }

}
