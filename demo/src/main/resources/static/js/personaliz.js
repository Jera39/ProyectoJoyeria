    function carga() {
        var comboBox = document.getElementById("tipoJoya");
        var cuadroTexto = document.getElementById("miCuadroTexto");

        // Verifica si el item seleccionado en el ComboBox es el que quieres
        if (comboBox.value === "anillo") {
            document.getElementById('Mens').innerHTML="  Talla del Anillo:  ";
            cuadroTexto.style.display = "flex";
        } else if (comboBox.value === "collar") {
            document.getElementById('Mens').innerHTML="  Longitud del Collar:  ";
            cuadroTexto.style.display = "flex"; 
            mensaje.style.display = "block"; 
        } else if (comboBox.value === "pulsera") {
            document.getElementById('Mens').innerHTML="  Longitud de Pulsera:  ";
            cuadroTexto.style.display = "flex"; 
            mensaje.style.display = "block";
        } else {
            cuadroTexto.style.display = "none"; // Oculta el cuadro de texto
            mensaje.style.display = "none"; // Oculta el mensaje
        }
    }

    function mostrarPiedras() {
        var roca = document.getElementById("roca");
        var piedras2 = document.getElementById("piedras2");
        var prueba1 = document.getElementById("prueba1");
        


        // Verifica qué radio button está seleccionado
        if (roca.checked) {
            prueba1.style.display = "block"; // Muestra el cuadro de texto
            mensaje.style.display = "none"; // Oculta el mensaje
        } else if (piedras2.checked) {
            prueba1.style.display = "none"; // Oculta el cuadro de texto
            mensaje.style.display = "block"; // Muestra el mensaje
        } else {
            cuadroTexto.style.display = "none"; // Oculta el cuadro de texto
            mensaje.style.display = "none"; // Oculta el mensaje
        }
    }