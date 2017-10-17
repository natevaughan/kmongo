package com.natevaughan.kmongo.model

import org.mongodb.morphia.annotations.Entity


/**
 * Created by nate on 10/17/17
 */
@Entity
class PersistableNumber: BaseEntity() {

    var number: Int? = null

}