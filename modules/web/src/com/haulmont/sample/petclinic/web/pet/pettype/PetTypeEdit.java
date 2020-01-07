package com.haulmont.sample.petclinic.web.pet.pettype;

import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.pet.PetType;
import com.haulmont.sample.petclinic.web.WithDeactivatableAttributes;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

@UiController("petclinic_PetType.edit")
@UiDescriptor("pet-type-edit.xml")
@EditedEntityContainer("petTypeCt")
@LoadDataBeforeShow
public class PetTypeEdit extends StandardEditor<PetType> implements WithDeactivatableAttributes {

    @Inject
    protected TextField<String> nameField;

    @Override
    public List<Component.Editable> attributesToDeactivate() {
        return Collections.singletonList(nameField);
    }


    
    
}