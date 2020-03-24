
public class RemoveAmain {
	public String delete(String string) {

		int len=string.length();

		String output="";

		

		if(len>=2)

		{

		

			char firstpositionchar=string.charAt(0);

			char secoundpositionchar=string.charAt(1);

			if(firstpositionchar=='A' && secoundpositionchar=='A' && len==2)

			{

				output+="NULL";

			}

			else if(firstpositionchar=='A' && secoundpositionchar=='A')

			{

				output+=string.substring(2, len);

			}

			else if(firstpositionchar=='A')

			{

				output+=string.substring(1, len);

			}

			else if(secoundpositionchar=='A')

			{

				output+=firstpositionchar+string.substring(2, len);

				

			}

			

			else

			{

				output+=string;

			}

		}

		return output;

	}



}

