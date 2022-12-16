$(document).ready(function (){

	$('#loader').hide();
	
});

function prueba(texto){
	console.log('Impresión de prueba: ' + texto);
	
	var nombre = $('#nombre').val();
	
	console.log('Impresión de prueba de get input: ' + nombre);
}

function mayus(id){
	document.getElementById(id).value = document.getElementById(id).value.toUpperCase();
}