// //alert("Hola Mundo 3");
// // comentario 
// /* Comentario de otro tipo */

// let primera;
// let correcta = "ok";
// let precio = 4.2;
// let valid = true;

// let nombre = 0;
// alert(nombre === "0");
// alert(isNaN(34));
// alert(isNaN("dani"));

// const CONSTANTE = 2;

// let prueba1 = "hola" + "Ganivet";
// let prueba2 = "Nota: " + 10;
// let prueba3 = "7" + 5;


// alert(prueba1);
// alert(prueba2);
// alert(prueba3);

// let string  = 'Hola';
// alert (string[2]);

// let a = 5;
// let b = 10;

// let A = 'Quince es ' + (a+b) + ' y no ' + (2* a) + '.';
// //Con templates mas sencillo 
// let B = `Quince es ${a+b} y no ${2 * a+b}.`;


// alert(A);
// alert(B);

// let x = 1;

// console.log("log");
// console.log("info");
// console.info("warn");
// console.warn("warn");
// console.error("error");
// console.debug("debug");


// let names = prompt("Cual es tu nombre?");
// console.log(names);
// confirm("Estas seguro?");

// let cab = document.getElementById("cabecera")
// cab.innerHTML= "<h1>ADIOS</h1";


// const parrafo =document.getElementById("cabecera");
// parrafo.style.background = "pink";
// parrafo.style.fontSize = "2em";
// parrafo.style.border = "solid red 2px"; 

const parrafos = document.getElementsByTagName("p");
parrafos[0].innerHTML = "Soy del Brighton";
parrafos[parrafos.length - 1].style.background = "red";

for (let i = 0; i < parrafos.length - 1; ++i) {
    parrafos[i].style.color = "green";
}

document.addEventListener("keydown",
    (event) => {
        switch (event.key) {
            case "ArrowUp":
                alert("Tecla arriba presionada");

                break;
            case "ArrowDown":
                alert("Tecla abajo presionada");

                break;
            case "ArrowLeft":
                alert("Tecla izquierda presionada");

                break;
            case "ArrowRight":
                alert("Tecla derecha presionada");

                break;

            default:
                alert("Tecla no reconocida");
                break;
        }
    });
