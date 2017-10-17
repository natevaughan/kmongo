package com.natevaughan.kmongo.model

import org.bson.types.ObjectId
import org.mongodb.morphia.annotations.Id
import org.mongodb.morphia.annotations.Property
import org.mongodb.morphia.annotations.Version

/**
 * Created by nate on 10/17/17
 */

abstract class BaseEntity {

    @Id
    @Property("id")
    var id: ObjectId? = null


    @Version
    @Property("version")
    var version: Long? = null

}