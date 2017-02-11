import scala.reflect.runtime.{universe => ru}

def getTypeTag [T: ru.TypeTag] (obj: T) = ru.typeTag[T]

def getClass (className: String) : Any = {
	val c = className
	println (Class.forName(c))

}

def main (s: String) = {
	val m = getClass(s)
	println(getTypeTag(m))

}


//class Person (name: String)

main ("java.lang.Int")