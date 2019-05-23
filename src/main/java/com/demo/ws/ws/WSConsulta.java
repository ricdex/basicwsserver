package com.demo.ws.ws;


import javax.jws.WebService;
import javax.xml.ws.Holder;
import java.util.List;

/*
En esta clase se coloca los endpoint que apuntan al porttype para que jale los servicios
web y publicarlos

 */

@WebService(
        serviceName = "BookService",
        portName = "BookPort",
        name = "BookService",
        endpointInterface = "com.demo.ws.ws.BookService",
        targetNamespace = "http://www.cleverbuilder.com/BookService/")
public class WSConsulta implements BookService {

    @Override
    public void getBook(Holder<String> id, Holder<String> title, Holder<String> author) {

    }

    @Override
    public String addBook(String title, String author) {
        return null;
    }

    @Override
    public List<GetAllBooksResponse.Book> getAllBooks() {
        return null;
    }

}
