package avancado;
import java.util.*;

public class CompararPorID implements Comparator<Animal>{
	
	@Override
	public int compare(Animal a1, Animal a2)
	{
		return a1.getId().compareTo(a2.getId());
	}
}
