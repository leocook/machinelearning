package org.leocook.algorithm_realized.classifier.naivebayes.discrete;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class FCIndex implements Serializable{
	private TreeMap<Integer, String> featureIndex = new TreeMap<Integer, String>();
	private Set<String> featureSet = new TreeSet<String>();
	
	private TreeMap<Integer, String> classifyIndex = new TreeMap<Integer, String>();
	private Set<String> classifySet = new TreeSet<String>();
	
	/**
	 * 记录feature
	 * @param feature
	 */
	private void addFeature(String feature){
		//查看该feature有没有被记录过
		if(!featureSet.contains(feature)){
			featureSet.add(feature);
			featureIndex.put(Integer.valueOf(featureIndex.size()), feature);
		}
	}
	
	/**
	 * 记录Classify
	 * @param classify
	 */
	private void addClassify(String classify){
		//查看该feature有没有被记录过
		if(!classifySet.contains(classify)){
			classifySet.add(classify);
			classifyIndex.put(Integer.valueOf(classifyIndex.size()), classify);
		}
	}

	public TreeMap<Integer, String> getFeatureIndex() {
		return featureIndex;
	}

	public void setFeatureIndex(TreeMap<Integer, String> featureIndex) {
		this.featureIndex = featureIndex;
	}

	public TreeMap<Integer, String> getClassifyIndex() {
		return classifyIndex;
	}

	public void setClassifyIndex(TreeMap<Integer, String> classifyIndex) {
		this.classifyIndex = classifyIndex;
	}
}
