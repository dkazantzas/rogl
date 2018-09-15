import com.rogl.Generator;

import java.lang.reflect.InvocationTargetException;

public class Example {
	public static void main(String[] args){
		Generator<TestClass> testClassGenerator = null;
		try {
			testClassGenerator = new Generator<>(new TestClass());
			System.out.println(testClassGenerator.getObject().toString());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
