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
import com.hp.hpl.jena.tdb.TDBFactory;
import com.hp.hpl.jena.update.GraphStore;
import com.hp.hpl.jena.update.UpdateExecutionFactory;
import com.hp.hpl.jena.update.UpdateFactory;
import com.hp.hpl.jena.update.UpdateProcessor;
import com.hp.hpl.jena.update.UpdateRequest;
import com.hp.hpl.jena.util.FileManager;

public class DeleteAllTriplesInAdapterTriplestore {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void start() {
				// load model from triplestore
				String directory = TriplestoreUtil.getTriplestoreLocation();
				Dataset dataset = TDBFactory.createDataset(directory);
				
				// Create a query
				String queryString = 
					"" +
					"" +
					"DELETE{?s ?p ?o .}" +
					"WHERE {" +
					"    ?s  ?p ?o . }";
				UpdateRequest query = UpdateFactory.create(queryString);

				// Execute the query and obtain results
				UpdateProcessor qe = UpdateExecutionFactory.create(query, (GraphStore) dataset.asDatasetGraph());
				qe.execute();

				dataset.close();
			}
		};
		thread.start();
		try {
			thread.join();
			System.out.println("All triples deleted in triplestore");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
