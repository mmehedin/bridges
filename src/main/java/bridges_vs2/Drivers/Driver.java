package bridges_vs2.Drivers;

import bridges_vs2.Network.DataFormatter;
import bridges_vs2.Sources.Tweet;
import bridges_vs2.Structure.ADTVisualizer;
import bridges_vs2.Structure.SLelement;

public class Driver{

	public static void main(String[] args){
		SLelement<Tweet> test = new SLelement<>("test", new Tweet("test"));
		SLelement<Tweet> test2 = new SLelement<>("test2", new Tweet("test2"));
		test.setNext(test2);
		ADTVisualizer vis = new ADTVisualizer();
		vis.setGraph("graph");
		
		DataFormatter.init(13,"300587042698",test, vis, "mmehedin@uncc.edu");
		System.out.println(DataFormatter.getJSON());
		DataFormatter.complete();
	}
}