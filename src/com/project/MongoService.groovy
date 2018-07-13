package com.project

@Grab('org.mongodb:mongodb-driver:3.8.0')

import com.mongodb.MongoClient
import com.mongodb.DBCollection
import com.mongodb.DB

class MongoService {
    private static MongoClient mongoClient
    private static host = "localhost"    //your host name
    private static port = 27017      //your port no.
    private static databaseName = "mongo"

    public static MongoClient client() {
        if(mongoClient == null){
            return new MongoClient(host,port)
        }else {
            return mongoClient
        }
    }

    public DBCollection collection(collectionName) {
        DB db = client().getDB(databaseName)
        return db.getCollection(collectionName)
    }
}