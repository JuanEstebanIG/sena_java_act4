# Java OOP - Implementación de Clases: Product

Proyecto de práctica en Java que demuestra el uso de clases, constructores, métodos getter y setter, y encapsulamiento mediante la clase `Product`.

---

## Descripción

Este proyecto implementa una clase `Product` que representa un producto con múltiples atributos. Se utilizan los conceptos fundamentales de la Programación Orientada a Objetos (POO) en Java:

- Atributos de instancia con encapsulamiento (`private`)
- Constructor por defecto con valores predeterminados
- Constructor parametrizado
- Métodos getter y setter públicos
- Sobreescritura del método `toString()`
- Clase `Main` de demostración

---

## Estructura del Proyecto

```
├── Product.java   # Clase principal con atributos, constructores y métodos
├── Main.java      # Clase de demostración con ejemplos de uso
└── README.md
```

---

## Atributos de la Clase `Product`

| Atributo  | Tipo      | Descripción              |
|-----------|-----------|--------------------------|
| `type`    | `String`  | Categoría del producto   |
| `name`    | `String`  | Nombre del producto      |
| `brand`   | `String`  | Marca del producto       |
| `price`   | `double`  | Precio unitario          |
| `inStock` | `boolean` | Disponibilidad en tienda |
| `stock`   | `int`     | Cantidad en inventario   |

---

## Cómo Compilar y Ejecutar

### Requisitos

- Java Development Kit (JDK) 8 o superior
- Terminal / línea de comandos

### Compilar

Desde la carpeta raíz del proyecto, ejecuta:

```bash
javac Product.java Main.java
```

### Ejecutar

```bash
java Main
```

---

## Salida Esperada

Al ejecutar el programa, la consola mostrará:

```
precio: 1000.0 stock: 10
Marca: Samsung El tipo de producto es: Electronics
Product [type=Electronica, name=Laptop, brand=Dell, price=1000.0, inStock=true, stock=10]
Product [type=Electronics, name=Smartphone, brand=Samsung, price=750.0, inStock=true, stock=20]
```

---

## Ejemplo de Uso

```java
// Constructor por defecto (valores predeterminados)
Product product1 = new Product();

// Constructor parametrizado
Product product2 = new Product("Electronics", "Smartphone", "Samsung", 800.0, true, 20);

// Uso de setter para modificar un atributo
product2.setPrice(750.0);

// Uso de getters para leer atributos
System.out.println(product1.getPrice());   // 1000.0
System.out.println(product2.getBrand());   // Samsung

// toString() para ver todos los atributos
System.out.println(product1.toString());
System.out.println(product2.toString());
```