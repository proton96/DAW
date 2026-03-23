"use strict";

let div = document.getElementById("info");
div.addEventListener("click",
    () => {
        clearInterval(temporizador);
        div.innerText="Desactivado";
    });

// setTimeout(
//     ()=>{
//         div.innerText="BOOM¡¡¡¡¡";
//     },5000);

let tiempo = 10;
div.innerText = tiempo;
let temporizador = setInterval(
    () => {
        let posX = Math.floor(Math.random() * 1900);
        let posY = Math.floor(Math.random() * 900);
        div.style.left=posX + "px";
        div.style.top=posY + "px";

        // tiempo--;
        // if (tiempo > 0) {
        //     div.innerText = tiempo;
        // } else {
        //     clearInterval(temporizador);
        //     div.innerText = "BOOM¡¡¡";
        // }
    }, 1000);





// movimiento de la caja con el raton
// document.addEventListener("mousemove",
//     (evento) => {
//         div.innerText = `(${evento.pageX}, ${evento.pageY})`;
//         div.style.left = evento.pageX + "px";
//         div.style.top = evento.pageY + "px";
//     });
