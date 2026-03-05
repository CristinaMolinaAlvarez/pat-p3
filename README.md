# Práctica 3 – API REST Carrito con Persistencia

## Descripción
En esta práctica se amplía la API REST desarrollada en la Práctica 2 incorporando **persistencia con Spring Data JPA** y separando la aplicación en las capas típicas de una aplicación Spring:

- **Entity**: modelo de datos persistente.
- **Repository**: acceso a la base de datos.
- **Service**: lógica de negocio.
- **Controller**: exposición de los endpoints REST.

En la práctica anterior los datos se almacenaban en un **HashMap en memoria**.  
En esta versión los recursos se guardan en una **base de datos mediante JPA**.

## Modelo de datos
La aplicación utiliza tres entidades:

- **Usuario**: propietario del carrito.
- **Carrito**: representa una compra en curso asociada a un usuario.
- **Articulo**: representa una línea del carrito con un producto.

El controlador principal es **CarritoController**, encargado de exponer los endpoints de la API.

## Endpoints

| Método | Ruta | Descripción |
|------|------|-------------|
| POST | /api/carrito/{idUsuario} | Crear carrito para un usuario |
| GET | /api/carrito | Obtener todos los carritos |
| GET | /api/carrito/{idCarrito} | Obtener un carrito |
| DELETE | /api/carrito/{idCarrito} | Eliminar un carrito |
| POST | /api/carrito/{idCarrito}/articulos | Añadir artículo al carrito |
| DELETE | /api/articulos/{idArticuloLinea} | Eliminar artículo del carrito |
