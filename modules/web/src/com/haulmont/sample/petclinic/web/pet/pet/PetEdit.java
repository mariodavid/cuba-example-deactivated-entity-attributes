package com.haulmont.sample.petclinic.web.pet.pet;

import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.pet.Pet;

import javax.inject.Inject;

@UiController("petclinic_Pet.edit")
@UiDescriptor("pet-edit.xml")
@EditedEntityContainer("petDc")
@LoadDataBeforeShow
public class PetEdit extends StandardEditor<Pet> {


    @Inject
    protected TextField<String> identificationNumberField;

    @Subscribe
    protected void onInitEntity(InitEntityEvent<Pet> event) {
        identificationNumberField.setEditable(true);
    }


}