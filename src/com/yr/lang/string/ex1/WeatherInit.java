package com.yr.lang.string.ex1;

public class WeatherInit {

	private String info;

	public WeatherInit() {
		info="seoul, 맑음, 10, 20, 0.3, daejeon, 비, -22, 50, 0.1, incheon, 태풍, 56, 90, 22.2, jeju, 흐림, 15, 10, 1.2";
	}


	public Weather[] getWeathers() {


		String [] ar= info.split(", ");
		Weather [] weathers = new Weather[ar.length/4];
		int index=0;

		for(int i=0; i<weathers.length; i++) {	
			Weather w = new Weather();
			w.setCity(ar[i]);
			w.setState(ar[++i]);
			w.setTem(ar[++i]);
			w.setHum(ar[++i]);
			w.setMise(ar[++i]);
			weathers[index]=w;
			index++;
		} return weathers;
		
		
	}
/*
		index=0;
		for(int i=0; i<weathers.length; i+=5) {	
			Weather w = new Weather();
			w.setCity(ar[i]);
			w.setState(ar[i+1]);
			w.setTem(ar[i+2]);
			w.setHum(ar[i+3]);
			w.setMise(ar[i+4]);
			weathers[index]=w;
			index++;

		} 

		return weathers;

	} 
*/
	

}
