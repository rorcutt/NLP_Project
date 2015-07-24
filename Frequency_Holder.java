import java.awt.List;
import java.util.ArrayList;

public class Frequency_Holder {
	public static ArrayList<String> freqList = new ArrayList<String>();
	
	public Frequency_Holder(){};
	
	public ArrayList getFreqList(){
		return freqList;
	}
	
	public static void insertFreqList(String insert){
		freqList.add(insert);
	}
}
