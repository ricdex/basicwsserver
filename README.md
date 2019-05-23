# Plantila basica para crear un servidor de servicios web
Un proyecto base para crear servicios web con spring web

## Para que sirve?
Una plantilla que nos va a servir exponer servicios web a partir de clases java que previamente fueron generados a partir de un wsdl (con wsdl4java)

### Prerequisitos

Puedes usar una libreria como Apache CXF que ya tiene el ejecutable wsdl4java

```
./wsdl2java -p com.demo.ws hello_world.wsdl
```

### Tecnologias

- Spring 4.3
- CXF 3.1.6

### Uso

La clase ServiceConfiguration es la que configura el cxf con spring. Luego escanea las implementaciones que tengan la anotacion @Webservice y las expone.
