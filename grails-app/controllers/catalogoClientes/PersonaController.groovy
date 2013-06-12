package catalogoClientes

class PersonaController {

	def scaffold = catalogoClientes.Persona

	def mostrarUno()
	{
		def resultado = Persona.executeQuery("select nombre from Persona");
		render(template:'list',collection:resultado,var:'cada');
	}

}