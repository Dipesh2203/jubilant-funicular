package com.example.project.controllers;

import com.example.project.models.Items;
import com.example.project.services.ItemService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/items")
public class ItemController {

    private static final Logger log = LoggerFactory.getLogger(ItemController.class);

    private final ItemService itemService;

    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    // route to add new item
    @PostMapping("/add")
    public ResponseEntity<Items> addItem(@Valid @RequestBody Items items){
        log.debug("adding ITEM with id = {} " );
        return ResponseEntity.ok(itemService.addItem(items));
    }

    // get all items
    @GetMapping
    public ResponseEntity<List<Items>> getAllItems(){
        return ResponseEntity.ok(itemService.getAllItems());
    }


    // route to get item by id
    @GetMapping("/{id}")
    public ResponseEntity<Items> searchItemById(@PathVariable long id){
        log.debug("FINDING ITEM with id = {} " , id);
        return ResponseEntity.ok(itemService.getItemById(id));
    }
}
