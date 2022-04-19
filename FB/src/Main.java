

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
	 public static User user=new User();
	 public static User otheruser=new User();
	 public static Interest page=new Interest();
	 public static Connection connection;
	 static Statement statement;
	 static Statement delst;
	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		GetConnection();
		CreateUserTable();
		CreateRequestTable();
		CreateInterestTable();
		//new WelcomeToFaceBook().setVisible(true);
		/*ArrayList<String> fs=SuggestFriend("ahmadi");
		int size=fs.size();
		for (int i=0;i<size;) {
			if(ArraySearch(Getfriends("ahmadi"), fs.get(i))){
				fs.remove(fs.get(i));
				size--;
			}
			else{
				i++;
			}
		}*/
		
		ArrayList<String> fs=Suggest("ahmadi");
		for (String string : fs) {
			System.out.println(string);
		}
		
	}
	

	public static void GetConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
	 
		
		String url = "jdbc:postgresql://localhost:5432/postgres";
    	String userName = "postgres";
    	String password = "zowxtpfx";
    	Class.forName ("org.postgresql.Driver").newInstance ();
        connection = DriverManager.getConnection (url, userName, password);
        System.out.println ("Database connection established");
        delst = connection.createStatement();
        statement = connection.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY, 
                ResultSet.HOLD_CURSORS_OVER_COMMIT);
        
        /*String sql="insert into users(name,age,sex,email,password) values(?,?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setString(1 , "amin");
		ps.setInt(2 , user.getAge());
		ps.setBoolean(3 , user.isSex());
		ps.setString(4 , user.getEmail());
		ps.setString(5 , user.getPassword());
		ps.executeUpdate();*/
	}
	public static void CreateUserTable(){
		try{
		String sql="create table users(id serial, name VARCHAR(20),age INTEGER,sex VARCHAR(10),email VARCHAR(20),password VARCHAR(20),status VARCHAR(100),image varchar(20))";
		statement.executeUpdate (sql);
		}catch (Exception e) {
			System.out.println("users table has been created man");
		}
	}
	public static void CreateInterestTable(){
		try{
		String sql="create table Interest(id serial, name VARCHAR(20),password VARCHAR(20),status VARCHAR(100),image varchar(20))";
		statement.executeUpdate (sql);
		}catch (Exception e) {
			System.out.println("interest table has been created man");
		}
	}
	public static void CreateRequestTable(){
		try{
		String sql="create table Request( sender VARCHAR(20),receiver VARCHAR(20))";
		statement.executeUpdate (sql);
		}catch (Exception e) {
			System.out.println("request table has been created man");
		}
	}
	public static boolean EmailSearch(String email) throws SQLException{//sign up
		String sql="Select * from users";
		//Statement statement=Data.conn.createStatement();
		ResultSet rs=statement.executeQuery(sql);
		for(;rs.next();){
			if(rs.getString("email").equals(email))
				return true;
		}
		return false;
	}
	
	public static boolean Search(String email,String password) throws SQLException{
		String sql="Select * from users";
		//Statement statement=Data.conn.createStatement();
		ResultSet rs=statement.executeQuery(sql);
		for(;rs.next();){
			if(rs.getString("email").equals(email) && rs.getString("password").equals(password))
				return true;
		}
		return false;
	}
	
	public static boolean AddFriend(String name) throws SQLException{
		String sql="Select * from users";
		String email;
		//Statement statement=Data.conn.createStatement();
		ResultSet rs=statement.executeQuery(sql);
		for(;rs.next();){
			if(rs.getString("name").equals(name)){
				email=rs.getString("email");
				String sql1="Insert into Request(sender,receiver) values(?,?)";
				PreparedStatement ps=connection.prepareStatement(sql1);
				ps.setString(1 , user.getEmail());
				ps.setString(2 , email);
				ps.executeUpdate();
				return true;
			}
			
		}
		
		return false;
	}
	
	public static boolean UnFriend(String name) throws SQLException{
		String sql="Select * from users";
		String email;
		//Statement statement=Data.conn.createStatement();
		ResultSet rs=statement.executeQuery(sql);
		for(;rs.next();){
			if(rs.getString("name").equals(name)){
				email=rs.getString("email");
				String sql1="Select * from Request";
				ResultSet rs1=statement.executeQuery(sql1);//ehtemalan inja bayad 1 statement digar estefade shavad
				while(rs1.next()){
					if(rs1.getString("sender").equals(user.getEmail()) && rs1.getString("receiver").equals(email) ) 
						{
						
						String sql2="Delete from Request where sender like '%"+user.getEmail()+"%' and receiver like '%"+email+"%'";
						statement.executeUpdate(sql2);
						return true;
					}	
					else if(rs1.getString("sender").equals(email) && rs1.getString("receiver").equals(user.getEmail()) ){
						String sql2="Delete from Request where sender like '%"+email+"%' and receiver like '%"+user.getEmail()+"%'";
						statement.executeUpdate(sql2);
						return true;
					}
				}
				
			}
		}
		return false;
	}
	
	
	
	public static ArrayList<String> PrintFriend() throws SQLException{//email ra oonja bayad dar user set konad
		ArrayList<String> list=new ArrayList<String>();
		String email;
		String sql="Select * from Request";
		//Statement statement=Data.conn.createStatement();
		ResultSet rs=statement.executeQuery(sql);
		for(;rs.next();){
			if(rs.getString("sender").equals(user.getEmail())){
				email=rs.getString("receiver");
				String sql1="Select * from users where email like '%"+email+"%'";
				ResultSet rs1=statement.executeQuery(sql1);
				list.add(rs1.getString("name"));
				
			}
			else if(rs.getString("receiver").equals(user.getEmail())){
				email=rs.getString("sender");
				String sql1="Select * from users where email like '%"+email+"%'";
				ResultSet rs2=statement.executeQuery(sql1);
				list.add(rs2.getString("name"));
			}
		}
		return list;
	}
	
	public static boolean Find(String name) throws SQLException{
		String sql="Select * from users";
		//Statement statement=Data.conn.createStatement();
		ResultSet rs=statement.executeQuery(sql);
		for(;rs.next();){
			if(rs.getString("name").equals(name)){
				otheruser.setEmail(rs.getString("email"));//image ham set kon
				otheruser.setName(rs.getString("name"));
				otheruser.setStatus(rs.getString("status"));
				otheruser.setImage(rs.getString("image"));
				
				return true;
			}
				
		}
		return false;
	}
	public static boolean FindPage(String name) throws SQLException{
		String sql="Select * from interest";
		//Statement statement=Data.conn.createStatement();
		ResultSet rs=statement.executeQuery(sql);
		for(;rs.next();){
			if(rs.getString("name").equals(name)){
				otheruser.setName(rs.getString("name"));
				otheruser.setStatus(rs.getString("status"));
				otheruser.setImage(rs.getString("image"));
				return true;
			}
				
		}
		return false;
	}
	
	public static int Delete(String email,String password) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		/*if(Search(email,password)){
		String sql="delete from users where email like '"+email+"'";
		statement.executeUpdate(sql);
			return true;
		}
		return false;*/
		String sql="Select * from users";
		//Statement statement=Data.conn.createStatement();
		ResultSet rs=statement.executeQuery(sql);
		for(;rs.next();){
			if(rs.getString("email").equals(email)){
				if(rs.getString("password").equals(password)){
					String sql1="Delete from users where email like '%"+email+"%'";
					statement.executeUpdate(sql1);
					sql1="Delete from request where receiver like '%"+email+"%'";
					statement.executeUpdate(sql1);
					sql1="Delete from request where sender like '%"+email+"%'";
					statement.executeUpdate(sql1);
					return 1;
				}
				return 0;
			}
				/*try {
					String sql1="Delete from users where email like '%"+email+"%'";
					statement.executeUpdate(sql1);
					return true;
				} catch (Exception e) {
					// TODO: handle exception
					return false;
				}*/
		}
		/*return false;*/
		return 2;
	}
	
	
	
	public static void AddUser() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
	//	GetConnection();
		//Statement db_statement = connection.createStatement();
		String sql="insert into users(name,age,sex,email,password,image) values(?,?,?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setString(1 , user.getName());
		ps.setInt(2 , user.getAge());
		ps.setString(3 , user.getSex());
		ps.setString(4 , user.getEmail());
		ps.setString(5 , user.getPassword());
		ps.setString(6 , "c:\\\\images\\\\0.png");
		ps.executeUpdate();
	}
	
	public static void GetDetail() throws SQLException{
		String sql="Select * from users";
		ResultSet rs=statement.executeQuery(sql);
		for(;rs.next();){
			if(rs.getString("email").equals(user.getEmail())){
				user.setName(rs.getString("name"));
				user.setStatus(rs.getString("status"));//image ham set kon
				user.setAge(rs.getInt("age"));
				user.setSex(rs.getString("sex"));
				user.setPassword(rs.getString("password"));
				user.setImage(rs.getString("image"));
			}
		}
	}
	public static void GetOtherDetail() throws SQLException{
		String sql="Select * from users";
		ResultSet rs=statement.executeQuery(sql);
		for(;rs.next();){
			if(rs.getString("email").equals(otheruser.getEmail())){
				otheruser.setName(rs.getString("name"));
				otheruser.setStatus(rs.getString("status"));//image ham set kon
				otheruser.setAge(rs.getInt("age"));
				otheruser.setSex(rs.getString("sex"));
				otheruser.setPassword(rs.getString("password"));
				otheruser.setImage(rs.getString("image"));
			}
		}
	}
	public static void GetPageDetail() throws SQLException{
		String sql="Select * from interest";
		ResultSet rs=statement.executeQuery(sql);
		for(;rs.next();){
			if(rs.getString("name").equals(page.getName())){
				page.setStatus(rs.getString("status"));
				page.setPassword(rs.getString("password"));
				page.setImage(rs.getString("image"));
			}
		}
	}
	public static ArrayList<String> GetInterest(String email) throws SQLException{
		
		String sql="select * from Request where sender like '"+email+"' ";
		
		ResultSet rs=statement.executeQuery(sql);
		ArrayList<String> list= new ArrayList<String>();
		
		for(;rs.next();){
			list.add(rs.getString("receiver"));
			String str=rs.getString("receiver");
			String sql2="select * from users where email like '"+str+"' ";
			Statement st2 = connection.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
			ResultSet rs2=st2.executeQuery(sql2);
			for(;rs2.next();){// yani joze interest ha bud
				list.remove(rs.getString("receiver"));
			}
			st2.close();
		}
		return list;
	}
	
	public static String GetStatus() throws SQLException{
		String sql="select * from users where email like '"+user.getEmail()+"' ";
		ResultSet rs=statement.executeQuery(sql);
		return rs.getString("status");
		
	}
	
	public static ArrayList<String> GetFan(String name) throws SQLException{
		String sql="select * from Request where receiver like '"+name+"' ";
		ArrayList<String> list= new ArrayList<String>();
		ResultSet rs=statement.executeQuery(sql);
	    
		for(;rs.next();){
			list.add(rs.getString("sender"));
		}
		return list;
		
	}
	
	public static ArrayList<String> Getfriends(String email) throws SQLException{
		ArrayList<String> list= new ArrayList<String>();
		String sql="select * from Request where sender like '"+email+"' ";
		ResultSet rs=statement.executeQuery(sql);
		for(;rs.next();){
			list.add(rs.getString("receiver"));
			String sql2="select * from Interest where name like '"+rs.getString("receiver")+"' ";
			//ResultSet rs2=statement.executeQuery(sql2);
			Statement st2 = connection.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
			ResultSet rs2=st2.executeQuery(sql2);
			//if(rs2==){// yani joze interest ha bud
			for(;rs2.next();){// yani joze interest ha nabud(pas joze user ha ast)
				list.remove(rs2.getString("name"));
			}
			st2.close();
		}
		
		String sql3="select * from Request where receiver like '"+email+"' ";
		Statement st3 = connection.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
		ResultSet rs3=st3.executeQuery(sql3);
		for(;rs3.next();){// yani joze interest ha bud
		//ResultSet rs3=statement.executeQuery(sql3);//choon emkan nadarad sender interest bashad
		//for(;rs3.next();){
			list.add(rs3.getString("sender"));
		}
		st3.close();
		return list;
	}
	
	public static boolean ArraySearch(ArrayList<String> arrayList,String email){
		
		for(int i=0;i<arrayList.size();i++){
			if(email.equals(arrayList.get(i)))
				return true;
		}
		return false;
	}
	
	public static int mutualFriend(String email1,String email2) throws SQLException{
		int counter=0;
		ArrayList<String> friends1=Getfriends(email1);
		ArrayList<String> friends2=Getfriends(email2);
		for(int i=0;i<friends1.size();i++){
			
			for(int j=0;j<friends2.size();j++){
				if(friends1.get(i).equals(friends2.get(j))){
					counter++;
					break;
				}
			}
		}
		return counter;
	}
	
	public static ArrayList<String> SuggestFriend(String email) throws SQLException{
		ArrayList<String> list=Getfriends(email);
		//ArrayList<String> friends;//doostaane dust
		ArrayList<String> friendsFriends=new ArrayList<String>();//doostane dustan
		ArrayList<String> suggestFriend=new ArrayList<String>();
		for(int i=0;i<list.size();i++){
			ArrayList<String> friends=Getfriends(list.get(i));
			for(int j=0;j<friends.size();j++){
				if(!ArraySearch(friendsFriends , friends.get(j)))//age to list nabud ezafe kon
					friendsFriends.add(friends.get(j));
			}
		}
		int max=0;
		String emailSaved=new String();
		int size=friendsFriends.size();
		for(int i=0;i<size;i++){
			for(int j=0;j<friendsFriends.size();j++){
				if(max<mutualFriend(email, friendsFriends.get(j))){
					max=mutualFriend(email, friendsFriends.get(j));
					emailSaved=friendsFriends.get(j);
				}
			}
			suggestFriend.add(emailSaved);
			friendsFriends.remove(emailSaved);
			max=0;
		}
		/*ArrayList<String> list2=Getfriends(email);
		for (String string : suggestFriend) {
			if(ArraySearch(list2, string)){
				suggestFriend.remove(string);
			}
		}
		*/
		//ArrayList<String> list2=SuggestFriend("ahmadi");
		suggestFriend.remove(0);
		int size2=suggestFriend.size();
		for (int i=0;i<size2;) {
			if(ArraySearch(Getfriends(email), suggestFriend.get(i))){
				suggestFriend.remove(suggestFriend.get(i));
				size2--;
			}
			else{
				i++;
			}
		}
		//suggestFriend.remove(0);
		return suggestFriend;
		
	}
	
	public static int mutualInterest(String email1,String email2) throws SQLException{
		int counter=0;
		ArrayList<String> interests1=GetInterest(email1);
		ArrayList<String> interests2=GetInterest(email2);
		for(int i=0;i<interests1.size();i++){
			
			for(int j=0;j<interests2.size();j++){
				if(interests1.get(i).equals(interests2.get(j))){
					counter++;
					break;
				}
			}
		}
		return counter;
	}
	
	public static ArrayList<String> Suggest(String email) throws SQLException{
		ArrayList<String> suggestFriend=SuggestFriend(email);
		ArrayList<String> finalSuggest=new ArrayList<String>();
		ArrayList<String> tempList=new ArrayList<String>();
		ArrayList<String> tempList2=new ArrayList<String>();
		
		for(int i=0;i<suggestFriend.size()-1;i++){
			if(mutualFriend(email, suggestFriend.get(i) ) > mutualFriend(email, suggestFriend.get(i+1) )){
				finalSuggest.add(suggestFriend.get(i));
			}
			else if( mutualFriend(email, suggestFriend.get(i) ) == mutualFriend(email, suggestFriend.get(i+1)) ){
				
				for(;mutualFriend(email, suggestFriend.get(i) ) == mutualFriend(email, suggestFriend.get(i+1));i++){
					tempList.add(suggestFriend.get(i));
				}
				int max=-1;
				String emailSaved=new String();
				int size=tempList.size();
				for(int j=0;j<size;j++){
					for(int k=0;k<tempList.size();k++){
						if(max<mutualInterest(email, tempList.get(k))){
							max=mutualInterest(email, tempList.get(k));
							emailSaved=tempList.get(k);
						}
					}
					tempList2.add(emailSaved);
					tempList.remove(emailSaved);
					max=-1;
				}
				
				int size2=tempList2.size();
				for(int j=0;j<size2;j++){
					finalSuggest.add(tempList2.get(0));
					tempList2.remove(0);
				}
				
				
			}
		}
		//akharish ro dar final add kon
		if(suggestFriend.size()>0){
			finalSuggest.add(suggestFriend.get(suggestFriend.size()-1));
		}
		else{
			
		}
		return finalSuggest;
	}
	
	public static boolean AddInterest(String name) throws SQLException{//age ghablan bashad false nemibud true
		String sql="select * from Interest where name like '"+name+"' ";
		ResultSet rs=statement.executeQuery(sql);
		
		String sql2="Insert into Request(sender,receiver) values(?,?)";
		PreparedStatement ps=connection.prepareStatement(sql2);
		ps.setString(1 , user.getEmail());
		ps.setString(2 , name);
		ps.executeUpdate();
		
		if(!rs.next()){//nabud
			String sql3="Insert into Interest(name,password,image) values('"+name+"','"+user.getPassword()+"','c:\\\\images\\\\0.png')";
			statement.executeUpdate(sql3);
			return true;
		}
		else
			return false;
		
	}
	
	
	
	/*public static void ChangeStatus() throws SQLException{
		String sql="Insert into users(status) values(?)";
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setString(1 , user.getStatus());
	}*/
	//changepicture
	public static void ChangeStatus() throws SQLException{
		
		String sql="update users set status='"+user.getStatus()+"' where email='"+user.getEmail()+"'";
		statement.executeUpdate(sql);
	}
	public static void Changeimage() throws SQLException{
		
		String sql="update users set image='"+user.getImage()+"' where email='"+user.getEmail()+"'";
		statement.executeUpdate(sql);
	}
	
}
