package com.vaccine.slot.controller;


import com.vaccine.slot.entities.Slot;
import com.vaccine.slot.service.BookSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookSlotController {

    private BookSlotService bookSlotService;

    @Autowired
    public BookSlotController(BookSlotService bookSlotService) {
        this.bookSlotService = bookSlotService;
    }
//getMApping (/availableSlot) based on age and gender
    @GetMapping("/slot")
    public Slot bookSlot(Slot slot){
        return bookSlotService.bookSlot(slot);
    }


}
