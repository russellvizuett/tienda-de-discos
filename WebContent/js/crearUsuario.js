$(document).ready(function(){
	$('#crear_usuario').validate(
			 {
			  rules: {
			    nombre: {
			      minlength: 2,
			      required: true
			    },
			    edad: {
			      minlength: 2,
			      required: true,
			      number: true
			    },
			    telefono: {
				  minlength: 2,
				  required: true,
				  number: true
				},
				ubicacion: {
				  minlength: 2,
				  required: true,
				},
				correo: {
					minlength: 2,
					required: true,
					email: true
				},
				password: {
					minlength: 5,
					required: true
				}
			  },
			  highlight: function(element) {
			    $(element).closest('.control-group').removeClass('success').addClass('error');
			  },
			  success: function(element) {
			    element
			    .text('OK!').addClass('valid')
			    .closest('.control-group').removeClass('error').addClass('success');
			  }
			 });
});