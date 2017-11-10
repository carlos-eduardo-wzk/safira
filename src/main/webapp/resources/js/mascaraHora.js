function Mascara_Hora(Hora, campo) {
			var hora01 = "";
			hora01 = hora01 + Hora;
			if (hora01.length == 2) {
				hora01 = hora01 + ':';
				campo.value = hora01;
			}
			
									
			if (hora01.length == 5) {
				Verifica_Hora(campo);
			}
												
			if (hora01.length > 5) {
				alert('Formato da hora inválido ');
			}
																		
		}

		function Verifica_Hora(campo) {
			hrs = (campo.value.substring(0, 2));
			min = (campo.value.substring(3, 5));

			estado = "";
			if ((hrs < 00) || (hrs > 23) || (min < 00) || (min > 59)) {
				estado = "errada";
			}

			if (campo.value == "") {
				estado = "errada";
			}

			if (estado == "errada") {
				alert("Hora inválida ! ");
				campo.focus();
			}
		}

		
		  function validarHora (h){			    
		        var horario = h;
		        var hora = horario.substr(0,2);
		        var minuto = horario.substr(3,2);
		        
		        ALERT("AAA");
		        
		        if(isNaN(hora)||isNaN(minuto)||hora>23||minuto>59){
		            return false;
		        }else{
		            return true;
		        }
		    }		 
		 
		  
		  function HoraToInteiro(Hora) {
			  
			  var hours = Math.floor( Hora / 3600 );  
			  var minutes = Math.floor( (Hora % 3600) / 60 );
			  var seconds = time % 60;
			  var result = "00:00";
			   
			  
			  hours = hours < 10 ? '0' + hours : hours;
			  
			  minutes = minutes < 10 ? '0' + minutes : minutes;
			   
			   
			  result = hours + ":" + minutes ;
			  
			  
			  return result; 
			  
		  }