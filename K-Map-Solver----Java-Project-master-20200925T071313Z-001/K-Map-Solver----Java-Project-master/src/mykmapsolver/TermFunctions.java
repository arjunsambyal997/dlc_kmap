package mykmapsolver;

class TermFunctions
{
	public static Term [] append(Term [] array, Term elem)
	{
		Term[] temp = new Term [array.length+1];

		for (int i = 0; i < array.length; i++)
			temp[i] = array[i];

		temp[array.length] = elem;

		return temp;
	}

	public static boolean exists(Term [] array, Term elem)
	{
		for(int i = 0; i < array.length; i++)
			if(array[i].get_sop().equals(elem.get_sop()))
				return true;
		return false;
	}

	public static Term [] minimized(Term [] array)
	{
		Term[] temp = new Term [0];

		for(int i = 0; i < array.length; i++)
			if(!array[i].isChecked())
				temp = append(temp, array[i]);

		return temp;
	}

	public static Term [] removeDuplicate(Term [] array)
	{
		Term [] temp = new Term [0];

		for(int i = 0; i < array.length; i++)
			if(!exists(temp, array[i]))
				temp = append(temp, array[i]);

		return temp;
	}
}