"use strict";




let x=0, y=0, z=0, res=0;

// Elementos del DOM
// Los botones estan en clases en el HTML 

const b_sumar = document.querySelector(".increaseX");
const b_random = document.querySelector(".randomY");
const b_binario = document.querySelector(".binarioZ");
const resultado = document.querySelector("#resultado");

// Evento sumar 1 a la x. 
b_sumar.addEventListener("click",   
    () => {
        x++;
        if (x > 20) {
            x = 0;
        }
        resultado.textContent = x+y+z;
});


// Evento random boton Y Aleatorio de 1 a 100.


b_random.addEventListener("click",
    () => {
        y = Math.floor(Math.random() * 100) + 1;
        resultado.textContent = x+y+z;
    });

// Evento binario. Cada vez que se pulse si la variable z=0 se convierte en z=1 y si es z=1 se convierte en 0.

b_binario.addEventListener("click",

    () => {

        if (z==0) {
            z=1;            
        } else {
            z=0;
        }
       resultado.textContent = x+y+z;

});

