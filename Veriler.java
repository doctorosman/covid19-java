import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Veri {
	
	private static String world_url = "https://www.worldometers.info/coronavirus/";
	private String turkey_url = "https://www.worldometers.info/coronavirus/country/turkey";
	private Document world = Jsoup.connect(world_url).get();
	private Elements wes = world.select("div.maincounter-number");
	private Document turkey = Jsoup.connect(turkey_url).get();
	private Elements tes = turkey.select("div.maincounter-number");
	
	String worldtotalcases = wes.get(0).select("span").text();
	String worldtotaldeaths = wes.get(1).select("span").text();
	String worldtotalrecovered = wes.get(2).select("span").text();
	
	String turkeytotalcases = tes.get(0).select("span").text();
	String turkeytotaldeaths = tes.get(1).select("span").text();
	String turkeytotalrecovered = tes.get(2).select("span").text();
	
	public Veri() throws IOException{
		
	}

	public String toplamVaka() {
		return worldtotalcases;
	}
	
	public String toplamOlum() {
		return worldtotaldeaths;
	}
	
	public String toplamIyilesen() {
		return worldtotalrecovered);
	}
	
	public String Vaka() {
		return turkeytotalcases;
	}
	
	public String Olum() {
		return turkeytotaldeaths;
	}
	
	public String Iyilesen() {
		return turkeytotalrecovered;
	}
	
}
