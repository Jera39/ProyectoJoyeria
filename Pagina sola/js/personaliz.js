

    function carga() {
        var comboBox = document.getElementById("opciones");
        var cuadroTexto = document.getElementById("cuadroTexto");

        // Verifica si el item seleccionado en el ComboBox es el que quieres
        if (comboBox.value === "mostrar") {
            document.getElementById('Mens').innerHTML="  Talla del Anillo:  ";
            cuadroTexto.style.display = "flex"; // Muestra el cuadro de texto
        } else if (comboBox.value === "moscol") {
            document.getElementById('Mens').innerHTML="  Longitud del Collar:  ";
            cuadroTexto.style.display = "flex"; // Oculta el cuadro de texto
            mensaje.style.display = "block"; // Oculta el mensaje
        } else if (comboBox.value === "mospul") {
            document.getElementById('Mens').innerHTML="  Longitud de Pulsera:  ";
            cuadroTexto.style.display = "flex"; // Oculta el cuadro de texto
            mensaje.style.display = "block"; // Oculta el mensaje
        } else {
            cuadroTexto.style.display = "none"; // Oculta el cuadro de texto
            mensaje.style.display = "none"; // Oculta el mensaje
        }
    }