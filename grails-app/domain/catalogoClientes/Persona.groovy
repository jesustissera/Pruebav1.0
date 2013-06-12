package catalogoClientes

class Persona {
	String nombre
	String apellidoPaterno
	String apellidoMaterno
	String direccion
	String email
	String telefono
	String codigoPostal
	int edad
	static constraints = {
		nombre(blank:false)
		apellidoPaterno(blank:false)
		apellidoMaterno(blank:false)
		email(email:true)
	}
}