package Lab01;

public interface Measurable 
{
  double getMeasure();

 public static double average(Measurable[] object)
  {
    double suma = 0.0;
    int ilosc = 0;

    for (Measurable n: object)
    {
      ilosc++;
      suma += n.getMeasure();
    }
    
    return (ilosc > 0)? suma / ilosc: 0.0;
  }

  public static Measurable largest(Measurable[] objects) {
    if (objects.length == 0) 
    {
        return null;
    }
    Measurable largest = objects[0];
    for (Measurable m: objects)
    {
        if(m.getMeasure() > largest.getMeasure())
        {
            largest = m;
        }
    }
    return largest;
   
  }
}
