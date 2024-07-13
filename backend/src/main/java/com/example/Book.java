package com.example;

//si creamos la clase como record , podemos pasarle las variables de esta manera
//ademas automaticamente ya tiene el constructor, los getter y setters...
//para apps sencillas. si es con bd no nos serviria porque no se pueden modificar los parametros

public record Book(Long id, String title) {


}
