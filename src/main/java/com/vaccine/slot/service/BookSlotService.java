package com.vaccine.slot.service;

import com.vaccine.slot.entities.Gender;
import com.vaccine.slot.entities.Person;
import com.vaccine.slot.entities.Slot;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class BookSlotService {

    public Slot bookSlot(Slot slot) {

        //add logic for booking slot
        Person person = slot.getPerson();
        if (Gender.FEMALE.equals(person.getGender())) {
            if (slot.getTimeOfVaccine().contains(slot.getTime()) && slot.getTime().charAt(0) < '6') {
                slot.setAvailable(true);
                slot.getTimeOfVaccine().remove(slot.getTime());
            }else{
                slot.setAvailable(false);
            }
        }
            if(slot.getPerson().getAge() >= 60){
                    if(slot.getTimeOfVaccine().contains(slot.getTime()) && slot.getTime().charAt(0) < 3){
                        slot.setAvailable(true);
                        slot.getTimeOfVaccine().remove(slot.getTime());
                    }
                }

            if(slot.getPerson().isWorkingProfessional()){
                if(slot.getTimeOfVaccine().contains(slot.getTime()) &&  slot.getTime().charAt(0) > '4' && !(Calendar.DAY_OF_WEEK==Calendar.SATURDAY || Calendar.DAY_OF_WEEK==Calendar.SUNDAY)){
                    slot.setAvailable(true);
                    slot.getTimeOfVaccine().remove(slot.getTime());
                } else{
                    if(slot.getTimeOfVaccine().contains(slot.getTime()) && (Calendar.DAY_OF_WEEK == Calendar.SATURDAY || Calendar.DAY_OF_WEEK == Calendar.SUNDAY)){
                        slot.setAvailable(true);
                        slot.getTimeOfVaccine().remove(slot.getTime());
                    }
                }
            }



        return slot;
    }


}
