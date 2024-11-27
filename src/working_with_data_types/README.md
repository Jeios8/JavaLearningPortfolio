# Working with Java Data Types

This folder covers the fundamentals of working with Java's primitive and reference data types, as well as wrapper classes.

---

## Key Concepts
1. **Primitive Data Types**:
    - Basic building blocks of Java (e.g., `int`, `double`, `char`, `boolean`).
2. **Reference Types**:
    - Objects that store memory references, not the actual value.
3. **Wrapper Classes**:
    - Classes that encapsulate primitive types (e.g., `Integer`, `Double`).
    - Support autoboxing and unboxing.
4. **Object Lifecycle**:
    - Object creation and garbage collection.

---

## Wrapper Classes

Wrapper classes in Java provide a way to use primitive data types as objects. Each primitive type has a corresponding wrapper class in the `java.lang` package.

| Primitive Type | Wrapper Class |
|----------------|---------------|
| `byte`         | `Byte`        |
| `short`        | `Short`       |
| `int`          | `Integer`     |
| `long`         | `Long`        |
| `float`        | `Float`       |
| `double`       | `Double`      |
| `char`         | `Character`   |
| `boolean`      | `Boolean`     |

### **Why Use Wrapper Classes?**
- **Object-Oriented Contexts**: Many Java frameworks and libraries require objects instead of primitives.
- **Utility Methods**: Wrapper classes provide helpful methods for conversion and operations. For example:
    - `Integer.parseInt("42")`: Converts a `String` to an `int`.
    - `Double.isNaN(value)`: Checks if a `double` value is "Not a Number".
- **Collections**: You cannot directly store primitives in Java collections like `ArrayList` or `HashMap`. Wrapper classes allow these types to be stored.

---

### **Examples**

#### 1. **Autoboxing and Unboxing**
Autoboxing automatically converts a primitive to its corresponding wrapper class, and unboxing does the reverse.

```java
int primitiveInt = 42;
Integer wrappedInt = primitiveInt; // Autoboxing
int unwrappedInt = wrappedInt; // Unboxing

System.out.println("Primitive: " + primitiveInt);
System.out.println("Wrapped: " + wrappedInt);
System.out.println("Unwrapped: " + unwrappedInt);
```

#### 2. **Utility Methods**
Wrapper classes provide methods for type conversion, comparison, and more.

```java
String numberString = "123";
int number = Integer.parseInt(numberString); // Convert String to int
System.out.println("Parsed Number: " + number);

Integer num1 = 10, num2 = 20;
System.out.println("Comparison Result: " + Integer.compare(num1, num2)); // -1 (num1 < num2)
```

#### 3. **Nullability**
Unlike primitives, wrapper classes can hold null values. This can be useful but requires caution to avoid NullPointerException.

```java
Integer nullableInt = null;
System.out.println("Nullable Integer: " + nullableInt);
```

#### 4. **Working with Collections**
Wrapper classes are essential when using Java Collections, which do not support primitive types.

```java
import java.util.ArrayList;

ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(5); // Autoboxing
numbers.add(10);

for (Integer number : numbers) {
    System.out.println("Number: " + number); // Unboxing
}
```