package com.rolan.login;

import com.rolan.login.igu.InterfazLogin;

public class Login {

    /*
    
    1. Lo primero que sea ha de realizar es la estructuración del proyecto,
    o la división de capas, que busca implementar algún patrón de diseño
    o arquitectura como el MVC (Modelo, Vista, Controlador). En este caso,
    se utiliza el MC (Modelo de Capas), muy parecido al MVC
    
    2. Realizamos una interfaz sencilla creando una clase JFrame la interfaz
    del ingreso de sesión de un usuario del sistema.
    
    3. Tener en cuenta que debemos tener configurado una base de datos para
    la aplicación.
    
    4. Crear una base de datos sin agregarle información, ya que, crearemos
    las tablas y entidades a través de la configuración de JPA con MySQL.
    Para ello nos aseguramos de tener la dependecia del driver de MySQL
    agregada a nuestro proyecto, y luego configuramos JPA que será la
    configuración de nuestra aplicación en Java con las clases que se
    comunicaran con el servicio de MySQL, en otras palabras configuramos
    las clases que hacen referencia a Tablas o Entidades en la base de datos.
    estas son integradas en una 'Unidad de Persistencia'.
    
    */
    
    
    public static void main(String[] args) {
        
        InterfazLogin interfazLogin = new InterfazLogin();
        interfazLogin.setVisible(true);
        interfazLogin.setLocationRelativeTo(null);
        
    }
    
}
