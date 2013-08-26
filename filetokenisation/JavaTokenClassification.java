
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
class JavaTokenClassification 
{
	static BufferedReader br = null;
	static BufferedWriter bw = null;
	static ArrayList<String> al = null;
	static boolean flag = true ;
	String fileName = null ;

	
	public static void main(String[] args)throws IOException 
	{
		JavaTokenClassification jtc = new JavaTokenClassification();
		jtc.controlClassification();
	}
	public void controlClassification()throws IOException
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the java file name with extention :");
		fileName = s.next();
	    FileReader fr = new FileReader(fileName);
	//	FileReader fr = new FileReader("d://PyramidOne.java");//fileName);
		br = new BufferedReader(fr);
        setAl();
		br.close();
		getAl();
	}
	public void setAl()throws IOException
	{
		al = new ArrayList<String> ();
		while(true)
		{
           String line = br.readLine();
		   if(line == null)                                         //loop will break when java file will end 
			   break;
		   line = line.trim();                                       // for eliminating spaces from both side of line
		   int len = line.length();                                   //length of each line
		   if(len > 0)                                              // for eliminating empty lines
			   al.add(line);
		}
	}
	public void getAl()throws IOException
	{
		int size = al.size();
		FileWriter fw = new FileWriter("TokenResult.java");
		bw = new BufferedWriter (fw);
		for (int i = 0 ; i < size ; i ++  )                             //Loop is executed once for each non empty java line
		{
			String line = al.get(i);                                    // taking one line from ArrayList
			bw.write("In this below line ");
			bw.newLine();
		    bw.write(line);
			bw.newLine();
		    bw.write("==================================================="); 
			
			 if("{".equals(line)) // The line having only {
				{
				 bw.newLine();
		         bw.write("{ :- is start of scope ");
				}
             else if("}".equals(line))                                                                // The line having only }
				 {
				 bw.newLine();
		         bw.write("} :- is end of scope ");
				 }
			else
				tokenSeparetor(line,0);                                                           //for separeting token from a line
			bw.newLine();
			bw.newLine();
			bw.newLine();
		}
		bw.close();
	}
	public void tokenClassification(String token)throws IOException
	{
	    String result = null;
        WordClassification wc = new WordClassification();
		wc.setArrayList();
		result = wc.getWordType(token);
		bw.newLine();
        if(result != null)
		bw.write(token+" :- is a"+result);
	}
	public void tokenSeparetor(String line,int l)throws IOException
	{
		int len = line.length();//length of each line
		StringBuffer b = new StringBuffer();
		
		for ( ; l < len ; l ++ )                                  // this will end when one line will end 
		{
			char c = line.charAt(l);
			if(c == ';' || c == '{' || c == ' ' || c == '.' || c == ',' || c == '(' || c == ')' || c == '"' || l == len-1 ) // for findout one token
			{				
               if(c == ';')
				   {
				   bw.newLine(); bw.write("; :- is a java delimiter ");
				   if(l == len-1)
					   break;
				   }
                if(c == '{')
                {
                    bw.newLine(); bw.write("{ :- is a java open curly brace ");
                    if(l == len-1)
                        break;
                }
                 else if(c == '"')                                   // for finding out string const
				{
				  StringBuffer b1 = new StringBuffer();
			      l++ ;                                               //for eliminating left "
				  c = line.charAt(l);
                  while( l < len)                                      // until & unless next " will come
					{
					  if(c == '"')                                    //loop execute for getting " pair means right " 
						{
						   l++ ;
						   c = line.charAt(l);
						  break;
						}
					  b1.append(c);                                                //unless & until we get right "
					  l++ ; 
					  c = line.charAt(l);
					}
					
                   String token1 = new String(b1);
				   bw.newLine();
		           bw.write(token1+" :- is a String class instance ");
				  }
				  if(l == len-1)
						b.append(c);
				 String token = new String(b);
				 if("package".equals(token))
					 {
					 tokenClassification(token);
					 printPackage(line,l+1,len);                              //for eliminating space I write l+1 in case of l 
					 break;
					 }
			    else if("import".equals(token))
				{

				  tokenClassification(token);
				  printImport(line,l+1,len);
			      break;
				}
	
			   else if("class".equals(token) || "extends".equals(token))          //After class & extends keyword ClassName must be found
				{
				  tokenClassification(token);
				  printclass(line,l+1,len);
			      break;
				}
			  else if("interface".equals(token) || "implements".equals(token))
				{
				  tokenClassification(token);
				  printInterface(line,l+1,len);
			      break;
				}
			  
              else if(c != ')' && c != '"')
				 tokenClassification(token);
			  if(c == '.')
				{
				  bw.newLine();
				  bw.write(". :- is a Oparetor ");
				}
			  else if(c == ',')
				{
				  bw.newLine();
				  bw.write(", :- is a Oparetor ");
				}
				b = new StringBuffer();
			 }
			else
				b.append(c);
		}
	}
	public void printclass(String line,int l,int len)throws IOException
	{
		StringBuffer b = new StringBuffer();
		for ( ; l < len ; l ++ )                         //for end of one token
		{
			char c = line.charAt(l);
			if (c == ' '|| l == len-1)                   // space may come or end of line
			{
			  if(l == len-1)                             //if line will end this current word should be tokenize
					b.append(c);
			  String token = new String(b);
			  bw.newLine();
		      bw.write(token+" :- is a class ");
			  break;
			}
           b.append(c);
		}
      if(l < len - 1)
			tokenSeparetor(line , l+1);
	  }
 	public void printInterface(String line,int l,int len)throws IOException
	{
		StringBuffer b = new StringBuffer();
		for ( ; l < len ; l ++ )
		{
			char c = line.charAt(l);
			if (c == ' ' || c == ',' || l == len-1 )
			{
			  if(l == len-1)                            //if line will end this current word should be tokenize
					b.append(c);
			  String token = new String(b);
			  bw.newLine();
		      bw.write(token+" :- is a Interface ");
			  if (c == ' ')
				  break;
			  b = new StringBuffer();
			}
			else
				b.append(c);
		}
		if(l < len - 1)               //After InterfaceName you may found Implements keyword means if line will not end
		{
			tokenSeparetor(line , l+1);
		}
	}
	public void printPackage(String line,int l,int len)throws IOException
	{
		StringBuffer b = new StringBuffer();
		int i = 0 ;
		for ( ; l < len ; l ++ )
		{
			char c = line.charAt(l);
			if (c == '.' || l == len-1)
			{
			  String token = new String(b);
			  if(i == 0)                     // first one is main package others are subpackage
				{
				  bw.newLine();
				  bw.write(token+" :- is a package ");
				}
			  else
				{
				  bw.newLine();
				  bw.write(token+" :- is a sub package ");
				}
				if (c == '.')
				{
				  bw.newLine();
				  bw.write(". :- is a java operator ");

				}
			   else if (c == ';')
				{
				  bw.newLine();
				  bw.write("; :- is a java delimiter ");
				}
			  b = new StringBuffer("");
			  i++; // for find out first one or others
			}
			else
				b.append(c);
		}
	}//printPackage()
	public void printImport(String line,int l,int len)throws IOException
	{
		StringBuffer b = new StringBuffer();
		int i = 0 ;
		for ( ; l < len ; l ++ )
		{
			char c = line.charAt(l);
			if (c == '.' || l == len-1)
			{
			  String token = new String(b);
			  if(i == 0)
				  {
				  bw.newLine();
				  bw.write(token+" :- is a package ");
				  }
			  else if("*".equals(token) || l == len-1)     // same as package with this extra
				 tokenClassification(token);
			  else
				{
				  bw.newLine();
		          bw.write(token+" :- is a sub package ");
				}
				if (c == '.')
				{
				  bw.newLine();
				  bw.write(". :- is a java operator ");
				}
			    else if (c == ';')
				{
				  bw.newLine();
		          bw.write("; :- is a java delimiter ");
				}
			  b = new StringBuffer("");
			  i++;
			}
			else
				b.append(c);
		}
	}//printImport()
}
