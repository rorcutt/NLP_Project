import java.sql.SQLException;
import java.sql.ResultSet;

public class Freq_Creator {
	static String currentDatabase = "Livemdb.dbo.";
	static Database_Connector database = new Database_Connector(currentDatabase,"jdbc:sqlserver://MIT-DR01;integratedSecurity=true");
	public static void main(String[] args) {
		Frequency_Holder freqList = new Frequency_Holder();
		//Get Data
		try {
			
			ResultSet results = database.runSql("SELECT TOP 5 * FROM " + currentDatabase +"NurNoteText");
			while(results.next()){
			freqList.insertFreqList(results.getString("TextLine"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String out : freqList.freqList ){
			System.out.println(out);
			
		}
	}


}