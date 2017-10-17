@file:JvmName("Application")

package com.natevaughan.kmongo

import org.mongodb.morphia.Morphia
import com.mongodb.MongoClient
import com.mongodb.MongoClientOptions
import com.mongodb.MongoClientURI
import com.natevaughan.kmongo.App.log
import com.natevaughan.kmongo.model.PersistableNumber
import org.slf4j.LoggerFactory

object App {
    val log = LoggerFactory.getLogger(this::class.java)
}

fun main(args: Array<String>) {
    val dbName = "kmongo"

    val mongoClientOptionsBuilder = MongoClientOptions.Builder()
    mongoClientOptionsBuilder.connectTimeout(1000)
    val mongo = MongoClient(MongoClientURI("mongodb://localhost:27017", mongoClientOptionsBuilder))


    val morphia = Morphia()
    val datastore = morphia.createDatastore(mongo, dbName)

    val board = PersistableNumber()
    board.number = 20
    val savedCustomer = datastore.save(board)
    log.info("ObjectId: ${savedCustomer.getId()}")
}
