package org.leocook.mahout.recommendation;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

public class RecommenderIntro {
	public static void main(String[] args) throws IOException, TasteException {
//		File file = new File("E:\\git\\machinelearning\\machinelearning\\mahout-recommendation\\src\\main\\resources\\intro.csv");
							//E:\\git\\machinelearning\\machinelearning\\mahout-recommendation\\src\\main\\resources
		File file = new File("src/main/resources/intro.csv");
		System.out.println(file.getAbsolutePath());
		DataModel model = new FileDataModel(file);
		UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
		UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);
		Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);
		List<RecommendedItem> recommendedItems = recommender.recommend(1, 1);
		for(RecommendedItem recommendedItem:recommendedItems){
			System.out.println(recommendedItem);
		}
		
	}
}
