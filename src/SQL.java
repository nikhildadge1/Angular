public  class SQL implements MyDatabase
{
	public void Commit() 
	{
		System.out.println("SQL Commit");
		
	}

	public void Rollback() 
	{
		System.out.println("SQL Rollback");
	}
	
	
	public static void main(String[] args)
	{
		SQL sql=new SQL();
		
		sql.Rollback();
		sql.Commit();
		
	}
}
