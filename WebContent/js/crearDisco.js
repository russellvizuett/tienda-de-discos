$(document).ready(function(){
	$('.lista').on('keyup', '.cancion', function(){
		canciones = [];
		
		$('.cancion').each(function(){
			cancion = $(this).val();
			canciones.push(cancion);
		});
		
		canciones = canciones.join(',');
		$('#lista-canciones').val(canciones);
	});
	
	$('.add').on('click', function(){
		console.log("as");
		$('.add').before('<input type="text" class="input-xlarge cancion">');
	});
	
	$('#crear_disco').validate(
			 {
			  rules: {
			    1: {
			      minlength: 2,
			      required: true
			    },
			    2: {
			      minlength: 2,
			      required: true,
			    },
			    3: {
			      minlength: 2,
			      required: true
			    },
			    4: {
				  required: true,
				  number: true
				},
				5: {
				  required: true,
				  number: true
				},
				7: {
					required: true,
					number: true
				},
				8: {
					required: true,
					number: true
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