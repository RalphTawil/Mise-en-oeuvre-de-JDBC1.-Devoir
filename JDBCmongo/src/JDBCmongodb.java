import com.mongodb.DB;
import com.mongodb.MongoClient;


public class JDBCmongodb {

	   public static void main( String args[] ){
		      try{   
				MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
				System.out.println("Database Connection Successful!");
		        DB db = mongoClient.getDB( "testdb" );
			    }catch(Exception e){
			     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			  }
		   }

}
