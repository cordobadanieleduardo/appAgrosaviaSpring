function envaluacionanimales() {
	var total = 0;


	$(".collapse1").each(function() {
		if (isNaN(parseFloat($(this).val()))) {
			total += 0;
		} else {
			total += parseFloat($(this).val());
		}
	});
}

let url = "http://localhost:8080/evaluacion/animales/get/json";
let xhr = new XMLHttpRequest();
xhr.open("GET", url);
xhr.setRequestHeader("Accept", "application/json");
xhr.setRequestHeader("Content-Type", "application/json");
xhr.onreadystatechange = function() {
	if (xhr.readyState === 4) {
		console.log(xhr.responseText);
	}
};

let data = {
  "Id": document.getElementById('collapse1').value,
  "Customer": "Jason Sweet",
  "Quantity": 1,
  "Price": 18.00
};

console.log(data);
