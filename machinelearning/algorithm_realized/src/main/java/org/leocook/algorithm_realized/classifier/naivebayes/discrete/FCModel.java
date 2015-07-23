package org.leocook.algorithm_realized.classifier.naivebayes.discrete;

import java.util.List;
import java.util.TreeMap;

public class FCModel {
	private TreeMap<KeyValuePair, Float> model = new TreeMap<KeyValuePair, Float>();
	private FCIndex fcIndex;
	private KeyValuePair temp = new KeyValuePair();
	
	private List<Integer> getClassify(List<Integer> feature) {
		for(Integer integer : fcIndex.getClassifyIndex().keySet()){
//			temp.setKey(key);
			
		}
		
		return null;
	}

	public FCIndex getFcIndex() {
		return fcIndex;
	}
	public void setFcIndex(FCIndex fcIndex) {
		this.fcIndex = fcIndex;
	}
}
