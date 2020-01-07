package com.haulmont.sample.petclinic.web.visit.visit;

import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.pet.Pet;
import com.haulmont.sample.petclinic.entity.visit.Visit;
import com.haulmont.sample.petclinic.web.WithDeactivatableAttributes;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@UiController("petclinic_Visit.edit")
@UiDescriptor("visit-edit.xml")
@EditedEntityContainer("visitDc")
@LoadDataBeforeShow
public class VisitEdit extends StandardEditor<Visit> implements WithDeactivatableAttributes {

    @Inject
    protected LookupPickerField<Pet> petField;
    @Inject
    protected DateField<Date> visitDateField;

    @Override
    public List<Component.Editable> attributesToDeactivate() {
        return Arrays.asList(
            petField, visitDateField
        );
    }
}