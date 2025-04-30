function showHour() {
	var hoy = new Date();
	var hora = hoy.getHours() + ':' + hoy.getMinutes() + ':' + hoy.getSeconds();
	document.getElementById("hora").value = hora;
	setTimeout("showHour()", 1000)
}

showDate();
function showDate() {
	var hoy = new Date();
	var fecha = hoy.getFullYear() + '/' + (hoy.getMonth() + 1) + '/' + hoy.getDate();
	document.getElementById("fecha").value = fecha;
}

// Código para calcular sumatoria de animales
function sumar() {
	var total = 0;
	$(".sumAnimales").each(function() {
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
	else if (sumaAnimales <= 15) {
		document.getElementById('Muestra').value = 11;
	}
	else if (sumaAnimales <= 20) {
		document.getElementById('Muestra').value = 12;
	}
	else if (sumaAnimales <= 25) {
		document.getElementById('Muestra').value = 14;
	}
	else if (sumaAnimales <= 30) {
		document.getElementById('Muestra').value = 16;
	}
	else if (sumaAnimales <= 35) {
		document.getElementById('Muestra').value = 17;
	}
	else if (sumaAnimales <= 40) {
		document.getElementById('Muestra').value = 18;
	}
	else if (sumaAnimales <= 45) {
		document.getElementById('Muestra').value = 19;
	}
	else if (sumaAnimales <= 50) {
		document.getElementById('Muestra').value = 20;
	}
	else if (sumaAnimales <= 55) {
		document.getElementById('Muestra').value = 21;
	}
	else if (sumaAnimales <= 60) {
		document.getElementById('Muestra').value = 22;
	}
	else if (sumaAnimales <= 70) {
		document.getElementById('Muestra').value = 23;
	}
	else if (sumaAnimales <= 80) {
		document.getElementById('Muestra').value = 24;
	}
	else if (sumaAnimales <= 90) {
		document.getElementById('Muestra').value = 25;
	}
	else if (sumaAnimales <= 105) {
		document.getElementById('Muestra').value = 26;
	}
	else if (sumaAnimales <= 125) {
		document.getElementById('Muestra').value = 27;
	}
	else if (sumaAnimales <= 140) {
		document.getElementById('Muestra').value = 28;
	}
	else if (sumaAnimales <= 155) {
		document.getElementById('Muestra').value = 29;
	}
	else if (sumaAnimales <= 165) {
		document.getElementById('Muestra').value = 30;
	}
	else if (sumaAnimales <= 175) {
		document.getElementById('Muestra').value = 31;
	}
	else if (sumaAnimales <= 180) {
		document.getElementById('Muestra').value = 32;
	}
	else if (sumaAnimales <= 190) {
		document.getElementById('Muestra').value = 33;
	}
	else if (sumaAnimales > 190) {
		document.getElementById('Muestra').value = 34;
	}
}

function completarFinca() {
	var nombreFinca = document.getElementById("selectFinca").value;
	document.getElementById("selectFinca").value = nombreFinca;
}

/*
document.getElementById("hembrasVacias").value = 0;
document.getElementById("hembrasGestantes").value = 0;
document.getElementById("hembrasLactantes").value = 0;
document.getElementById("corderosMenores").value = 0;
document.getElementById("corderosMayores").value = 0;
document.getElementById("machosReproductores").value = 0;

function totalAnimales() {
	let hembrasVacias = parseInt(document.getElementById("hembrasVacias").value);
	let hembrasGestantes = parseInt(document.getElementById("hembrasGestantes").value);
	let hembrasLactantes = parseInt(document.getElementById("hembrasLactantes").value);
	let corderosMenores = parseInt(document.getElementById("corderosMenores").value);
	let corderosMayores = parseInt(document.getElementById("corderosMayores").value);
	let machosReproductores = parseInt(document.getElementById("machosReproductores").value);
	let sumaAnimales = hembrasVacias + hembrasGestantes + hembrasLactantes + corderosMenores + corderosMayores + machosReproductores;
	document.getElementById("totalAnimales").value = parseInt(sumaAnimales);
}*/