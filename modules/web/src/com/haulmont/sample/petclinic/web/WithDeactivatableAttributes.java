package com.haulmont.sample.petclinic.web;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.EntityStates;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.screen.*;

import java.util.List;

/**
 * Screen Mixin that allows to define a list of entity attributes, that should be
 * deactivated once an entity was created and is in edit mode
 */
public interface WithDeactivatableAttributes {


    /**
     * the list of Entity attributes that will be deactivated
     */
    List<Component.Editable> attributesToDeactivate();


    @Subscribe
    default void onInit(Screen.BeforeShowEvent event) {
        EntityStates entityStates = Extensions.getBeanLocator(event.getSource()).get(EntityStates.class);
        Entity editedEntity = ((StandardEditor) event.getSource()).getEditedEntity();

        if (!entityStates.isNew(editedEntity)) {
            attributesToDeactivate().forEach(
                    editable -> editable.setEditable(false)
            );
        }
    }

}
