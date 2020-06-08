package com.particeep.test

/**
  * This is basic language questions so don't use external library or build in function
  */
object BasicScala {
  println("Power: "+ power(2, 3));
  println("Email: "+ isEmail("particeep@gmail.com"));
  println("Email: "+ isEmail("feriel_ouabdesselam@gmail.com"));
  var m1 = Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12");
  println("URL 1 :"+encodeParamsInUrl(m1));
  println("URL 2 :"+encodeParamsInUrl(Map()));


  def encodeParamsInUrl(params: Map[String, String]): String = {
    if(params.isEmpty) {
      return "";
    }
    var string:String = "?";
    for ((k,v) <- params)
    {
      var s1:String = k+"="+v+"&";
      string = string.concat(s1);
    }
    return string.substring(0, string.length-1);
  }


  def isEmail(maybeEmail: String): Boolean = ???
  """([\w\.\-\_]+)@(\w+\.\w+)""".r.unapplySeq(email).isDefined

  def power(i:Int, n:Int):Int =
  {
    @tailrec def powerAcc(acc: Int, n: Int): Int =
    {
      if (n == 0)
        acc
      else
        powerAcc(i * acc, n - 1)
    }
    powerAcc(1, n)
  }

}
