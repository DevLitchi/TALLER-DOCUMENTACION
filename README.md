# Sobre el Proyecto


Este proyecto pertenece a la materia de **Estructura de Datos** de la carrera de **Ingeniería de Software** de la **Universidad Autónoma de Baja California**. El objetivo del proyecto es implementar un **Árbol Binario** en **Java** con las funciones de **insertar, eliminar, buscar, mostrar y contar niveles**. El proyecto se realizó en **Abril de 2024**

# Lenguaje de Programación utilizado
# [[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/es/) = 100%]
## Árbol Binario en Java

Este proyecto implementa un árbol binario en Java, donde cada nodo puede tener hasta dos hijos como máximo. Basado en una lista doble.

## Descripción
El árbol binario se implementa mediante las clases `Tree` y `Nodo`. 

### Clase Tree

La clase `Tree` representa el árbol binario y contiene los siguientes métodos:

- `Tree()`: Constructor de la clase.
- `creditos()`: Muestra los créditos del programa.
- `CD()`: Limpia la pantalla.
- `PEPC()`: Pausa el programa hasta que el usuario presione Enter.
- `ILE()`: Verifica si el árbol está vacío.
- `DT()`: Elimina todo el árbol.
- `CN(Nodo aux)`: Cuenta los niveles del árbol.
- `Pausa()`: Pausa el programa hasta que el usuario presione Enter.
- `EA(int qty)`: Inserta elementos aleatorios en el árbol.
- `BE(int element)`: Busca un elemento en el árbol.
- `I(int element)`: Inserta un elemento en el árbol.
- `DE(int element)`: Elimina un elemento específico del árbol.
- `MT(Nodo aux)`: Muestra el árbol en preorden.
- `Stio(Nodo aux)`: Muestra el árbol en inorden.
- `Stpo(Nodo aux)`: Muestra el árbol en postorden.
- Métodos adicionales para mostrar el árbol invertido en preorden, inorden y postorden.
- Método para eliminar todos los nodos duplicados.

### Clase Nodo

La clase `Nodo` representa un nodo del árbol binario y contiene los siguientes atributos y métodos:

- `element`: Valor del nodo.
- `left`, `right`: Referencias al hijo izquierdo y derecho, respectivamente.
- `Nodo(int element)`: Constructor de la clase.
- `getElement()`: Devuelve el valor del nodo.

### Clase Main

La clase `Main` contiene el método `main()` donde se realiza la interacción con el usuario. Permite realizar las siguientes operaciones:

## Menú de Operaciones

| Opción | Descripción                                          |
|--------|------------------------------------------------------|
| 1      | Insertar un elemento en el árbol.                   |
| 2      | Mostrar el árbol en preorden y preorden invertido.  |
| 3      | Mostrar el árbol en inorden y inorden invertido.    |
| 4      | Mostrar el árbol en postorden y postorden invertido.|
| 5      | Eliminar un elemento del árbol.                     |
| 6      | Reiniciar el árbol (eliminar todos los elementos).  |
| 7      | Buscar un elemento en el árbol.                     |
| 8      | Contar los niveles del árbol.                       |
| 9      | Insertar elementos aleatorios en el árbol.          |
| 10     | Limpiar todos los nodos duplicados del árbol.       |
| 0      | Salir del programa.                                 |

# CAPTURA DE PANTALLA DEL MENU
![Captura de pantalla del menú](
    Menu.png
)



## Funciones Importantes

- **Insertar Elemento (`I(int element)`)**: Inserta un elemento en el árbol.
- **Eliminar Elemento (`DE(int element)`)**: Elimina un elemento específico del árbol.
- **Mostrar Árbol (`MT(Nodo aux)`, `Stio(Nodo aux)`, `Stpo(Nodo aux)`)**: Muestra el árbol en preorden, inorden y postorden respectivamente.
- **Contar Niveles (`CN(Nodo aux)`)**: Cuenta los niveles del árbol.
- **Insertar Elementos Aleatorios (`EA(int qty)`)**: Inserta elementos aleatorios en el árbol.
- **Buscar Elemento (`BE(int element)`)**: Busca un elemento en el árbol.
- **Eliminar Árbol (`DT()`)**: Elimina todo el árbol.

# Trozos de Código Relevantes

### Método para Contar Niveles

```java
public int CN(Nodo aux) {
    if (aux == null) {
        return 0;
    } else {
        int izq = CN(aux.left);
        int der = CN(aux.right);
        if (izq > der) {
            return izq + 1;
        } else {
            return der + 1;
        }
    }
}
```

### Método para Mostrar el Árbol en Preorden:
```java
public void MT(Nodo aux) {
    if (aux != null) {
        System.out.print(aux.getElement() + " ");
        MT(aux.left);
        MT(aux.right);
    }
}
```

### Método para Insertar Elementos:
```java
public void I(int element) {
    Nodo nuevo = new Nodo(element);
    if (Root == null) {
        Root = nuevo;
    } else {
        Nodo aux = Root;
        Nodo ant = null;
        while (aux != null) {
            ant = aux;
            if (element < aux.getElement()) {
                aux = aux.left;
            } else {
                aux = aux.right;
            }
        }
        if (element < ant.getElement()) {
            ant.left = nuevo;
        } else {
            ant.right = nuevo;
        }
    }
}
```

### Método para Eliminar Elementos:
```java
public void DE(int element) {
    Nodo aux = Root;
    Nodo ant = null;
    while (aux != null) {
        if (aux.getElement() == element) {
            // Lógica para eliminar el nodo
            return;
        }
        ant = aux;
        if (element < aux.getElement()) {
            aux = aux.left;
        } else {
            aux = aux.right;
        }
    }
    System.out.println("El elemento " + element + " no ha sido encontrado");
}
```

# MEJORAS POR REALIZAR
- [x] Insertar elementos aleatorios en el árbol.
- [x] Buscar un elemento en el árbol.
- [x] Contar los niveles del árbol.
- [x] Mostrar el árbol en preorden, inorden y postorden.
- [x] Eliminar un elemento del árbol.
- [x] Reiniciar el árbol (eliminar todos los elementos).
- [ ] Limpiar todos los nodos duplicados del árbol.
- [ ] Soporte Multi-lenguaje 
    - [ ] Ingles
    - [x] Spanish

# LICENCIA:
# USO COMPLETAMENTE LIBRE

## Autor

Programa realizado por **Dali Leonardo Basilio Torres**, estudiante de Ingeniería de Software en la Universidad Autónoma de Baja California, el 22 de Abril de 2024.

