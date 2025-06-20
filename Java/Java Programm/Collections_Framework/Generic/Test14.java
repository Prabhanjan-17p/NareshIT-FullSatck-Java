package Collections_Framework.Generic;

class MyClass<T>
{
	T obj;
	public MyClass(T obj)       //Student obj = new Student(1, "A");
	{
		this.obj=obj;
	}

	T getObj()
	{
		return this.obj;
	}
}
public class Test14
{
	public static void main(String[] args) 
	{
		Integer i=12;
		MyClass<Integer> mi = new MyClass<>(i);
		System.out.println("Integer object stored :"+mi.getObj());

		Float f=12.34f;
		MyClass<Float> mf = new MyClass<>(f);
		System.out.println("Float object stored :"+mf.getObj());

		MyClass<String> ms = new MyClass<>("Rahul");
		System.out.println("String object stored :"+ms.getObj());

		MyClass<Boolean> mb = new MyClass<>(false);
		System.out.println("Boolean object stored :"+mb.getObj());

		Double d=99.34;
		MyClass<Double> md = new MyClass<>(d);
		System.out.println("Double object stored :"+md.getObj());

		MyClass<Student> std = new MyClass<>(new Student(1,"A"));
		System.out.println("Student object stored :"+std.getObj());
	}
}

record Student(int id, String name)
{

}