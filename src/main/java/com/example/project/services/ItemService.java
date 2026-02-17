package com.example.project.services;


import com.example.project.globalExceptionHandler.ResourceNotFoundException;
import com.example.project.models.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ItemService {

    private static final Logger log =LoggerFactory.getLogger(ItemService.class);

    private final List<Items> itemList = new ArrayList<>();
    private long nextId = 1;

    // add items
    public Items addItem(Items items){

        items.setId(nextId++);
        itemList.add(items);
        log.debug("item ADDED with id = {} " , items.getId());
        return items;
    }

    // get all items
    public List<Items> getAllItems(){
        return itemList;
    }

    // search items by id

    public Items getItemById(long id){
        log.info("searching items of id ={}" ,id);

        for(Items item:itemList){
            if(item.getId().equals(id)){
                log.debug("item found with id = {} " , id);
                return item;
            }
        }
        // error handling
        log.warn("item not found with id= {}" ,id);
        throw new ResourceNotFoundException("item not found with id = "+id);
    }
}
