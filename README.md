# 🚀 Mi Primer Pipeline Spring Boot

# 📝 Descripción

Proyecto Spring Boot con pipeline completo de CI usando GitHub Actions. Demuestra:

✅ Test unitario del controlador REST
✅ Compilación Maven automática
✅ Generación de JAR ejecutable
✅ Publicación de artifacts
✅ Workflow verde en GitHub Actions

# 🏗️ Estructura del proyecto

text
spring-boot-ci/
├── .github/
│   └── workflows/
│       └── ci.yml          # Pipeline CI completo
├── src/
│   ├── main/
│   │   └── java/com/...
│   │       └── controller/
│   │           └── HelloController.java  # REST endpoint /hello
│   └── test/
│       └── java/com/...
│           └── controller/
│               └── HelloControllerTest.java # Test JUnit
├── pom.xml                 # Dependencias Maven
└── README.md

# 🚀 Uso local
## Clonar el repositorio

bash
git clone https://github.com/HerrecuDev/mi_primer_PipeLine_Spring_Boot.git
cd mi-primer-PipeLine_Spring-Boot

## Compilar y probar

bash
mvn clean test              # ✅ Tests pasan
mvn clean package           # ✅ Genera JAR
java -jar target/*.jar      # ✅ Servidor en puerto 8080

## Endpoint disponible

text
GET http://localhost:8080/hello
Respuesta: "Hola desde mi primer PipeLine con Spring Boot!!"

## 🔄 Pipeline CI/CD

El pipeline se ejecuta automáticamente en:

    Push a ramas main o develop

    Pull Requests hacia main

## Jobs del pipeline

    Checkout 🔍 - Descarga código

    Java 21 🟢 - Configura JDK 21 (Temurin)

    Tests 🧪 - mvn test (JUnit)

    Build JAR 🏗️ - mvn package

    Artifact 📦 - Sube JAR ejecutable

## 📊 Métricas

    Tiempo promedio del pipeline: ~2 minutos

    Tests ejecutados: 1 (HelloControllerTest)

    Artifact generado: app-jar.zip con JAR ejecutable


## ✅ Check	Estado
Tests locales	mvn test ✅
JAR generado	target/*.jar ✅
Servidor local	Endpoint responde ✅
GitHub Actions	Workflow verde ✅
Artifact	Descargable ✅

## Autor
Pablo Herrera curso 2ºDAW


