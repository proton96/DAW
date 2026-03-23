"use strict";

// SELECCIONAR ELEMENTOS PARA MOSTRAR INFORMACION
let value = document.querySelector(".value");


// SELECCIONAR BOTONES
let decreaseBtn = document.querySelector(".decrease");
let resetBtn = document.querySelector(".reset");
let increaseBtn = document.querySelector(".increase");

let counter = 0; // Valor inicial del contador

// PROGRAMAR CADA ACCION (decrease, reset, increase)
decreaseBtn.addEventListener("click", ()=>{
    counter--;
    updateCounter();
});

resetBtn.addEventListener("click", ()=>{
    counter = 0;
    updateCounter();
});

increaseBtn.addEventListener("click", ()=>{
    counter++;
    updateCounter();
    
});

// FUNCIÓN PARA ACTUALIZAR EL CONTADOR
function updateCounter() {
    value.textContent = counter;

    if (counter>0) {
        value.computedStyleMap.color= "green";
    
    } else if (counter<0) {
        value.computedStyleMap.color= "red";
        }else {
            value.computedStyleMap.color= "black";
        }
}
