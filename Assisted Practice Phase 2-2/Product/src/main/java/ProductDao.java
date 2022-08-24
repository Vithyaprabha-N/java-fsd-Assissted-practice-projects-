import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*CRUD - DAO(data access object)
Call the DBUtil for dB connection
Continue with 
3.Statement of sql
4.execute the statements
5.close the connections  
 */
public class ProductDao {
	
	
	//insert ,update,delete
	public int insert(Product p) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.getCon();
		if(con!=null) {
			System.out.println("connection is established");
		}
		else {
			System.out.println("connection failed");
		}
		
//		Statement st=con.createStatement();
//		String sql="insert into student values("+s.getSid()+","+"'"+s.getSname()+"'"+","+"'"+s.getSemail()+"')";
//		//insert,update,delete->int value -no of rows
//		int row=st.executeUpdate(sql);
		String sql="insert into product values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, p.getPid());
		ps.setString(2, p.getPname());
		ps.setString(3, p.getPprice());
		int row=ps.executeUpdate();
		return row;
	
	}
	
	public ResultSet drop() throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.getCon();
		if(con!=null) {
			System.out.println("connection is established");
		}
		else {
			System.out.println("connection failed");
		}
		Statement st=con.createStatement();
		String sql="select * from product";
		//select
		ResultSet rs=st.executeQuery(sql);
		return rs;
		
	}

}


