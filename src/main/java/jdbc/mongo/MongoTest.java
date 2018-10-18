package jdbc.mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

import java.util.Iterator;

public class MongoTest {
    private MongoDatabase database;

    private void connect() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoCredential credential = MongoCredential.createCredential("ujo", "myDb", "uniko".toCharArray());
        System.out.println("Connected");
        database = mongoClient.getDatabase("myDb");
        System.out.println("Credential :: " + credential);
    }

    private void createCollection() {
        database.createCollection("myTempCollection");
        System.out.println("Created collection");
    }

    private MongoCollection<Document> retrieveCollection() {
        return database.getCollection("myTempCollection");
    }

    private void retrieveAllCollections() {
        MongoCollection<Document> collection = database.getCollection("myTempCollection");
        System.out.println("Collection myTempCollection selected succesfully");
        FindIterable<Document> iterable = collection.find();

        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private void addDocument() {
        Document document = new Document("Title", "MongoDb");
        document.append("id", 1)
                .append("description", "database")
                .append("likes", 100)
                .append("url", "http://www.tutorialspoint.com/mongodb/")
                .append("by", "tutorials point");


        MongoCollection<Document> collection = retrieveCollection();
        collection.insertOne(document);
        System.out.println("Document inserted sucessfully");
    }

    private void updateDocument() {
        MongoCollection<Document> collection = retrieveCollection();
        collection.updateOne(Filters.eq("id", 1), Updates.set("likes", 150));
        System.out.println("Document updated successfully....");
    }


    private void deleteDocument() {
        MongoCollection<Document> collection = retrieveCollection();
        collection.deleteOne(Filters.eq("id", 1));
        System.out.println("Deleted");
    }

    private void dropCollection() {
        MongoCollection<Document> collection = retrieveCollection();
        collection.drop();
        System.out.println("Collection dropped");
    }

    public static void main(String[] args) {
        MongoTest mongoTest = new MongoTest();
        mongoTest.connect();
        mongoTest.createCollection();
        mongoTest.addDocument();
        mongoTest.retrieveAllCollections();
        mongoTest.updateDocument();
        mongoTest.retrieveAllCollections();
        mongoTest.deleteDocument();
        mongoTest.retrieveAllCollections();
        mongoTest.dropCollection();
        mongoTest.retrieveAllCollections();
    }
}
