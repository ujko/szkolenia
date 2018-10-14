package jdbc.mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

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

    private void addDocument() {
        Document document = new Document("Title", "MongoDb");
        document.append("1", "Dupa Jasio");
        document.append("2", "Jakiś inny dokument");

        MongoCollection<Document> collection = retrieveCollection();
        collection.insertOne(document);
    }

    public static void main(String[] args) {
        MongoTest mongoTest = new MongoTest();
        mongoTest.connect();
        mongoTest.createCollection();
    }
}
