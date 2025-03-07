package org.eclipse.lyo.adapter.tdb.clients;

import java.io.InputStream;



import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.shared.Lock;
import com.hp.hpl.jena.tdb.TDBFactory;
import com.hp.hpl.jena.util.FileManager;

public class QueryAdapterTriplestoreForAnyTriple {

	public static void main(String[] args) {
	
		
		Model model = null;
		try {
	
		
			// load model from triplestore
			String directory = TriplestoreUtil.getTriplestoreLocation();
			Dataset dataset = TDBFactory.createDataset(directory);
			model = dataset.getDefaultModel();
			model.enterCriticalSection(Lock.READ) ;  // or Lock.WRITE
		
		
		// Create a new query
		String queryString = 			
			"SELECT ?subject ?predicate ?object " +
			"WHERE {" +
			"    ?subject  ?predicate ?object . " +			
			"      }";
		Query query = QueryFactory.create(queryString);

		// Execute the query and obtain results
		QueryExecution qe = QueryExecutionFactory.create(query, model);
		ResultSet results = qe.execSelect();

		// Output query results	
		ResultSetFormatter.out(System.out, results, query);

		// Important - free up resources used running the query
		qe.close();
		} finally {
		    model.leaveCriticalSection() ;
		}
	}
}
