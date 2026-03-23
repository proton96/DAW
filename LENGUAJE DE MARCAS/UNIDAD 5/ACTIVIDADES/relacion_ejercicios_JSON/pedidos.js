const lista={
    "pedidos": [
      {
        "divisa":"EUR",
        "numero": 1,
        "cliente": {
          "nombre": "Juan Pérez",
          "direccion": "Avenida Central 456",
          "telefono": "+1234567890",
          "email": "juan@gmail.com"
        },
        "productos": [
          {
            "nombre": "camiseta de algodón",
            "precio_unitario": 20.99,
            "cantidad_solicitada": 2,
            "cantidad_disponible": 1
          },
          {
            "nombre": "par de zapatos deportivos",
            "precio_unitario": 59.99,
            "cantidad_solicitada": 1,
            "cantidad_disponible": 1
          }
        ],
        "fecha_pedido": "2024-03-08",
        "estado": "pendiente",
        "pagos": [
          {
            "cantidad": 41.97,
            "metodo": "tarjeta de crédito",
            "tipo":"VISA",
            "numero_de_tarjeta": "**** **** 1234",
            "fecha_de_caducidad": "mayo de 2025"
          },
          {
            "cantidad": 59.99,
            "metodo": "efectivo"
          }
        ]
      },
      {
        "divisa":"USD",
        "numero": 2,
        "cliente": {
          "nombre": "María García",
          "direccion": "Calle Rosas 789",
          "telefono": "+987654321",
          "email": "maria@hotmail.com"
        },
        "productos": [
          {
            "nombre": "pantalón vaquero",
            "precio_unitario": 39.99,
            "cantidad_solicitada": 1,
            "cantidad_disponible": 1
          },
          {
            "nombre": "gorra de béisbol",
            "precio_unitario": 14.99,
            "cantidad_solicitada": 2,
            "cantidad_disponible": 2
          }
        ],
        "fecha_pedido": "2024-03-29",
        "estado": "pendiente",
        "pagos": [
          {
            "cantidad": 39.99,
            "metodo": "tarjeta de crédito",
            "tipo":"MASTERCARD",
            "numero_de_tarjeta": "**** **** **** 5678",
            "fecha_caducidad": "07/25"
          },
          {
            "cantidad": 29.98,
            "metodo": "cheque al portador"
          }
        ]
      }
    ]
  }