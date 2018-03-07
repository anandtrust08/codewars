package io.pello.codewars.bitcoin_statistics;

public class BitcoinStatistics {
	  public static double[][] getMinAvgMax(int discard, double[][] data) {
		  double [][] result = new double[data.length+1][3];
		  double max = data[0][discard];
		  double min = data[0][discard];
		  double sum = 0;
		  double avg = 0;
		  int count = 0;
		  
		  	for (int i = 0;i<data.length;i++) {
				max = data[i][discard];
				min = data[i][discard];
				sum = 0;
		  		
		  		for (int j = discard;j<data[i].length-discard;j++) {
		  			min = data[i][j]<min?data[i][j]:min;
		  			max = data[i][j]>max?data[i][j]:max;
		  			sum += data[i][j];
		  			avg += data[i][j];
		  			count++;
		  		} 
		  		result[i] = new double[]{min, sum/(data[i].length-(2*discard)), max}; 
		  	}
		  	

		  	
			   max = result[0][0];
			   min = result[0][0];
			   sum = 0;
			  
			for (int i = 0;i<result.length-1;i++) {
		  			min = result[i][0]<min?result[i][0]:min;
		  			max = result[i][2]>max?result[i][2]:max;
		  			sum += result[i][1];
		  	}

	  		result[result.length-1] = new double[]{min, avg/count, max}; 
//			for (int i = 0;i<result.length;i++) {
//			System.out.print("[");
//	  		for (int j = 0;j<result[i].length;j++) {
//	  			System.out.print(result[i][j]+", ");;
//	  		} 
//	  		System.out.println("]");
//	  	}
	  		
	  		return result;
		  }
}
