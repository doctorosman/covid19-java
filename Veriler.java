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

	public int toplamVaka() {
		return Integer.parseInt(worldtotalcases);
	}
	
	public int toplamOlum() {
		return Integer.parseInt(worldtotaldeaths);
	}
	
	public int toplamIyilesen() {
		return Integer.parseInt(worldtotalrecovered);
	}
	
	public int Vaka() {
		return Integer.parseInt(turkeytotalcases);
	}
	
	public int Olum() {
		return Integer.parseInt(turkeytotaldeaths);
	}
	
	public int Iyilesen() {
		return Integer.parseInt(turkeytotalrecovered);
	}
	
}
