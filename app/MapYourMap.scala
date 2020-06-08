package com.particeep.test

/**
  * Tell developer names by the department code
  * Expected result:
  * Map(frontend -> List(Remy, Alexandre), analytics -> List(Pierre), api -> List(Noe))
  */
object MapYourMap {

  val devNames = Map("dev1" -> "Pierre", "dev2" -> "Remy", "dev3" -> "Noe", "dev4" -> "Alexandre")
  val devDepartments = Map("dev1" -> "analytics", "dev2" -> "frontend", "dev3" -> "api", "dev4" -> "frontend")

  var map1: mutable.Map[String, List[String]] = scala.collection.mutable.Map[String, List[String]]();
  for((k, v) <- devDepartments)
  {
    for ((k1, v1) <- devNames)
    {
      if(k==k1)
      {
        if(!map1.contains(v))
        {
          map1 = map1 +(v -> List(v1));
        }
        else
        {
          map1 = map1 + (v ->(v1::map1.get(v).toList(0)));
        }
      }
    }

  }
  val namesInDepartments: mutable.Map[String, List[String]] = map1;
  println(namesInDepartments.toMap);
}
