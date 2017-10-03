public class Pivot
{

// En entrer on a une liste(K,V) qui vient du Imput Reader

  public static class PivotMapper extends Mapper<Object, Text, Text, IntWritable>
  {
    public void map(Int key, Text value, Context context) throws IOException, InterruptedException {
      String[] itr = new value.split(","); // on fait un split afin de séparé la chaine de "mot;" par une suite de "mot"
      for (i=0;i=itr.size;i++) // on parcours charque mot du tableau
      {
       context.write(i+1,itr[i]); // Pour chaque mot du tableau on lui inidique sa position dans la chaine de mot.
      }
    }
  }

// En sorti du Map, on à une liste de l(K,V)
// (1,A) (1,A2)
// (2,B) (2,B2)
// (3,C) (3,C2)
// (4,D) (4,D2)


  public static class PivotReducer extends Reducer<Text,IntWritable,Text,IntWritable>
  {
    public void reduce(Int key, Iterable<String> values, Context context) throws IOException, InterruptedException
    {
      for (Int k : key)
      {
        sum += val.get();
      }
      result.set(sum);
      context.write(key, result);
    }
  }
}
