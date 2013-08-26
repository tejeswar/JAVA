import java.util.ArrayList;
import java.util.Scanner;
class WordClassification 
{
		static String modifier[] = {"public","private","protected","static","final","abstract",
			"synchronized","native","strictfp","transient","volatile"};
        static String key [] ={"if","else","switch","case","default","for","do","while","break","continue","return","goto","const",
			"class","package","import","extends","implements","interface","Enum","void","new","instanceof","super","this","true",
			"false","null","try","catch","finally","throw","throws","assert"}; 
	   static String type [] = {"byte","short","int","long","float","double","char","boolean"};
	   static String wrapper [] = {"Byte","Short","Integer","Long","Float","Double","Char","Boolean"};
	   static String optr [] = {"%","/","+","-","*","=","==",">>","<<","<=",">=","<",">","!=","||","&&","^","++","--","+=","-=","*=",
		   "/=","~","!",",","."};
       static String libclass [] = {"Class","System","Scanner","String","StringBuffer","StringBuilder","Thread","Object"};
       static String libconstructor [] = {"Class()","System()","Scanner()","String()","StringBuffer()","StringBuilder()","Thread()",
		   "Object()"};
	
        static ArrayList<String> accessmodifier = null ;
		static ArrayList<String> keyword = null ;
		static ArrayList<String> datatype = null ;
        static ArrayList<String> wrapperclass = null ;
		static ArrayList<String> operator = null ;
		static ArrayList<String> libraryclass = null ;
		static ArrayList<String> libraryconstructor = null ;
        
		static int size = 0;

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		

		System.out.print("Enter a word :");
		String token = s.next();
		WordClassification wc = new WordClassification();
		wc.setArrayList();
		String result = wc.getWordType(token);
        System.out.print("'"+token+"' is a"+result);

	}
	public static void setArrayList()
	{
		accessmodifier = new ArrayList<String>();
		for(int i=0; i < modifier.length ; i++)
            accessmodifier.add(modifier[i]);
		keyword = new ArrayList<String>();
		for(int i=0; i < key.length ; i++)
            keyword.add(key[i]);
		datatype = new ArrayList<String>();
		for(int i=0; i < type.length ; i++)
            datatype.add(type[i]);
        wrapperclass = new ArrayList<String>();
		for(int i=0; i < wrapper.length ; i++)
            wrapperclass.add(wrapper[i]);
		operator = new ArrayList<String>();
		for(int i=0; i < optr.length ; i++)
            operator.add(optr[i]);
		libraryclass = new ArrayList<String>();
		for(int i=0; i < libclass.length ; i++)
            libraryclass.add(libclass[i]);
		libraryconstructor = new ArrayList<String>();
		for(int i=0; i < libconstructor.length ; i++)
            libraryconstructor.add(libconstructor[i]);
	}
	public String getWord(String token)
	{
		//setArrayList();
		if(accessmodifier.contains(token))
	    	return " Access modifier and keyword";
		else if(keyword.contains(token))
			return " key word";
	    else if(datatype.contains(token))
			return " datatype and keyword";
        else if(wrapperclass.contains(token))
			return " java wrapper class";
		else if(operator.contains(token))
			return " java Operator";
		else if(libraryclass.contains(token))
			return " java library class";
		else if(libraryconstructor.contains(token))
			return " Constructor of java library class";
        else if("main".equals(token))
			return " special java method";
        else if("println".equals(token))
			return " method of PrintStream class";
        else if("print".equals(token))
			return " method of PrintStream class";

		else if("length".equals(token))
			return " literal to know size of an array";
        else if("out".equals(token))
			return " PrintWriter instance in System class ";
		 else if("in".equals(token))
			return " PrintReader instance in System class ";
		else
			return null;

	}
	public String getWordType(String token)
	{
		String result = getWord(token);
        if(result != null)
			return result;
		else
		{
			int c=0;
            size = token.length();
			if(size > 1 && '(' == token.charAt(size-2) && ')' == token.charAt(size-1))
			{
				result = checkMethod(token, c);
							
			}
			else if(size > 1 && '[' == token.charAt(size-2) && ']' == token.charAt(size-1))
			{
				result = checkArray(token, c);
			}
            else if(size > 0)
			{
				result = checkVariable(token,c);
			}
		}
		return result;
	}

	public String checkArray(String token,int c)
	{
	  int j =0,uc=0;
	  StringBuffer b = null ;
	  String str = null;
	  uc = (int)token.charAt(0);
	  if((uc>=65 && uc<= 90)||(uc>=97 && uc<=122 ) || uc==36 || uc==95) //97-122  65-90 (A-Z) 36($) 95(_)
	  {	
		b = new StringBuffer();
		b.append((char)uc);
		for(j=1; j < size-2; ){
			c = (int)token.charAt(j);
			b.append((char)c);
			if((c>=65 && c<= 90)||(c>=97 && c<=122 )||(c>=48 && c<= 57) || c==36 || c==95)
				j++;	
			else
				break;
		}
			if(j == size-2)
				{
				str = new String(b);
				String result = getWord(str);
				if(result != null)
					return result;
				return " Identifier of Array type";
				}
			else
				  return " Array of"+str;
	  }
	  else {
              return " invalid java method";
           }

	}
  public String checkMethod(String token,int c)
	{
	  int j =0,uc=0;
	  StringBuffer b = null ;
	  uc = (int)token.charAt(0);
	  if((uc>=65 && uc<= 90)||(uc>=97 && uc<=122 ) || uc==36 || uc==95) //97-122  65-90 (A-Z) 36($) 95(_)
	  {	
		b = new StringBuffer();
		b.append((char)uc);
		for(j=1; j < size-2; )
			{
			c = (int)token.charAt(j);
			b.append((char)c);
			if((c>=65 && c<= 90)||(c>=97 && c<=122 )||(c>=48 && c<= 57) || c==36 || c==95)
				j++;	
			else
				break;
			}
			if(j == size-2)
				{
				String str = new String(b);
				String result = getWord(str);
				if(result != null)
					return result;
				return " valid java method";
				}
				else
				  return " invalid java method";
	  }
	  else
		return " invalid java method";
	}//checkMethod()
  public String checkVariable(String token,int c)
	{
	  int j =0,uc=0;
	  uc = (int)token.charAt(0);
	  if((uc>=65 && uc<= 90)||(uc>=97 && uc<=122 ) || uc==36 || uc==95) //97-122  65-90 (A-Z) 36($) 95(_)
	  {
		for(j=1; j < size; )
			{
			c = (int)token.charAt(j);
			if((c>=65 && c<= 90)||(c>=97 && c<=122 )||(c>=48 && c<= 57) || c==36 || c==95)
				j++;
			else
				break;
			}
			if(j == size)
				return " valid java Identifier";
			return " invalid java Identifier";
	 }
	 else
		{
		 for(j=1; j < size; )
			{
			c = (int)token.charAt(j);
			if(c >= 47 && c <= 58)
				j++;
			else
				break;
			}
			if(j == size)
				return " valid constant";
		 return " invalid constant";
		}
	}

}
