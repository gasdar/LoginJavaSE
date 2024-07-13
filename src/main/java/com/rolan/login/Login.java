package com.rolan.login;

import com.rolan.login.igu.InterLogin;

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
    agregada a nuestro proyecto, y luego configuramos JPA (la unidad de
    persistencia y la clases JPA), que será la configuración de nuestra
    aplicación en Java para obtener los datos de las tablas de MySQL, en
    otras palabras, configuramos las clases que hacen referencia a Tablas o
    Entidades en la base de datos. Estas son integradas en una 'Unidad
    de Persistencia'.
    
    NOTAS:
    1. Las relaciones de la lógica entre las clases, puede variar un poco entre
    las relaciones de la persistencia en la BD. En la lógica normalmente,
    tendremos que implementar la relación 'bidireccional', por ejemplo, en
    una relación entre la clase 'User' y la clase 'Role', para saber los roles
    que tiene un usuario y los usuarios que tiene un rol, debemos específicar
    el tipo de relación de la clase 'User' con la clase 'Role' y específicar
    el tipo de relación de la clase 'Role' con la clase 'User', sino puede
    que tengamos un resultado no esperado.
    
    2. La interfaz de esta aplicación trabaja con Java Swing y se borra el
    ejecutable de las interfaces, ya que, anteriormente se trabaja con
    programación orientada a objetos, pero ahora manejamos la aplicación
    desde el main()
    
    */
    
    
    public static void main(String[] args) {
        InterLogin interfazLogin = new InterLogin();
        interfazLogin.setVisible(true);
        interfazLogin.setLocationRelativeTo(null);
    }
    
}
