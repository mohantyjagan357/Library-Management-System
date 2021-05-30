package com.example.library_management.Controller;

import com.example.library_management.Model.IssuedBook;
import com.example.library_management.Repository.IssuedBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class IssuedBookController {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @Autowired
    IssuedBookRepository repository;


    @GetMapping("/issuedBooks")
    List<IssuedBook> findAll() {
        return repository.findAll();
    }

    @PostMapping(value = "/issueBook")
    @ResponseStatus(HttpStatus.CREATED)
    public IssuedBook issueBook(@RequestBody IssuedBook issuedBook) throws Exception{
        try {
            //validator for issued books object which you are going to receive from the client
            issuedBook.setStatus("issued");
            return repository.save(issuedBook);
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception();
        }
    }

    @GetMapping(value = "/searchIssuedBooksByUser")
    public List<IssuedBook> searchIssuedBooksByUser(@RequestParam(value = "q") String userId){
        LOGGER.info("searchIssuedBooksByUser called with userId "+userId);
        List<IssuedBook> books = repository.findAll();
        ArrayList<IssuedBook> list = new ArrayList<IssuedBook>();
        for(IssuedBook book : books){
            int id = Integer.parseInt(userId);
            if(book.getUser_id()==id){
                list.add(book);
            }
        }
        return list;
    }

}
