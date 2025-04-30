// Código para calcular sumatoria de animales
function sumar() {
  var total = 0;
  $(".ponderarAnimales").each(function() {
    if (isNaN(parseFloat($(this).val()))) {
      total += 0;
    } else {
      total += parseFloat($(this).val());
    }
  });
  //alert(total);
  var sumaAnimales = document.getElementById('sumaAnimales').value = total;

	if (sumaAnimales <= 10) {
		document.getElementById('Muestra').value = sumaAnimales;
	} 
	else if (sumaAnimales <= 15){
		document.getElementById('Muestra').value = 11;
	} 
	else if (sumaAnimales <= 20){
		document.getElementById('Muestra').value = 12;
	}
	else if (sumaAnimales <= 25){
		document.getElementById('Muestra').value = 14;
	}
	else if (sumaAnimales <= 30){
		document.getElementById('Muestra').value = 16;
	}
	else if (sumaAnimales <= 35){
		document.getElementById('Muestra').value = 17;
	}
	else if (sumaAnimales <= 40){
		document.getElementById('Muestra').value = 18;
	}
	else if (sumaAnimales <= 45){
		document.getElementById('Muestra').value = 19;
	}
	else if (sumaAnimales <= 50){
		document.getElementById('Muestra').value = 20;
	} 
	else if (sumaAnimales <= 55){
		document.getElementById('Muestra').value = 21;
	}
	else if (sumaAnimales <= 60){
		document.getElementById('Muestra').value = 22;
	}
	else if (sumaAnimales <= 70){
		document.getElementById('Muestra').value = 23;
	}
	else if (sumaAnimales <= 80){
		document.getElementById('Muestra').value = 24;
	}
	else if (sumaAnimales <= 90){
		document.getElementById('Muestra').value = 25;
	}
	else if (sumaAnimales <= 105){
		document.getElementById('Muestra').value = 26;
	}
	else if (sumaAnimales <= 125){
		document.getElementById('Muestra').value = 27;
	} 
	else if (sumaAnimales <= 140){
		document.getElementById('Muestra').value = 28;
	}
	else if (sumaAnimales <= 155){
		document.getElementById('Muestra').value = 29;
	}
	else if (sumaAnimales <= 165){
		document.getElementById('Muestra').value = 30;
	}
	else if (sumaAnimales <= 175){
		document.getElementById('Muestra').value = 31;
	}
	else if (sumaAnimales <= 180){
		document.getElementById('Muestra').value = 32;
	}
	else if (sumaAnimales <= 190){
		document.getElementById('Muestra').value = 33;
	}
	else if (sumaAnimales > 190){
		document.getElementById('Muestra').value = 34;
	}

}