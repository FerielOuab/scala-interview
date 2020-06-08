# Interview for scala developer at Particeep

Answer to WhatsWrong1:

Supporter.city prints "Paris".
Supporter.support prints "Ici c'est null !".
To fix it, we can change "val support: String = s"Ici c'est $city !" by overriding toString method with our String:
"override def toString = s"Ici c'est $city !""

Answer to WhatsWrong3:

Once the "Future[String]" object is given a value( case of Success) or an exception ( case of Failure), the object becomes immutable.
We can fix it by using "Future.apply" which is a method that returns a future holding the result.