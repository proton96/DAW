"use strict";

let contenido = [
  "El arte de la conversación",
  "Explorando nuevas perspectivas",
  "Innovación y creatividad",
  "Descubriendo nuevos horizontes",
  "Conectando mentes brillantes",
  "Diversidad y unidad",
  "Explorando el cosmos",
  "Crecimiento personal",
  "Transformando el mundo",
  "Descubrimientos fascinantes",
  "Aventuras inesperadas",
  "Desafíos emocionantes",
  "Sueños por realizar",
  "Redefiniendo lo posible",
  "Explorando la naturaleza",
  "Cultivando el conocimiento",
  "Celebrando la vida",
  "Pasión por el aprendizaje",
  "Abrazando la diversidad",
  "Inspirando el cambio",
];


// a) Generar una lista
const lista = contenido.map((item) => {
  const li = document.createElement("li");
  li.textContent = item;
  return li;
});

const ul = document.createElement("ul");
lista.forEach((li) => ul.appendChild(li));
document.body.appendChild(ul);



// Separador

document.body.appendChild(document.createElement("br"));



// b) Generar una tabla con clase "formato" como estilo 
const tabla = document.createElement("table");
tabla.classList.add("formato");
const tbody = document.createElement("tbody");
contenido.forEach((item) => {
  const tr = document.createElement("tr");
  const td = document.createElement("td");
  td.textContent = item;
  tr.appendChild(td);
  tbody.appendChild(tr);
});
tabla.appendChild(tbody);
document.body.appendChild(tabla);
//Enseñar la tabla en el Html , he utilizado esto por eso sale una alerta.


// Separador
document.body.appendChild(document.createElement("br"));
