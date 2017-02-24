package com.aprz.classloader;

import javax.tools.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/**
 * Created by aprz on 17-2-24.
 * ---
 */
public class Arithmetic {

    private static final String CLASS_NAME = "Calculator";
    private static final String CLASS_METHOD = "calculate";

    static class MyClassLoader extends ClassLoader {

        private String myClassPath;

        public MyClassLoader() {
            myClassPath = System.getProperty("user.dir");
        }

        @Override
        protected Class<?> findClass(String name) {
            try {
                File clazz = new File(myClassPath + File.separator + name + ".class");
                FileInputStream fin = new FileInputStream(clazz);

                FileChannel channel = fin.getChannel();
                ByteBuffer bb = ByteBuffer.allocate(fin.available());
                channel.read(bb);
                bb.flip();

                return defineClass(name, bb.array(), 0, bb.array().length);

            } catch (FileNotFoundException e) {
                e.printStackTrace();

                return null;
            } catch (IOException e) {
                e.printStackTrace();

                return null;
            }
        }

    }


    static class StringSourceJavaObject extends SimpleJavaFileObject {
        private String content = null;

        protected StringSourceJavaObject(String name, String content) {
            super(URI.create("string:///" + name.replace('.', '/') + Kind.SOURCE.extension), Kind.SOURCE);
            this.content = content;
        }

        public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
            return content;
        }

    }

    public double getResult(String expr) throws Exception {

        String source = getCalculateSourceCode(expr);

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager =
                compiler.getStandardFileManager(null, null, null);
        StringSourceJavaObject sourceObject = new
                StringSourceJavaObject(CLASS_NAME, source);
        Iterable<? extends JavaFileObject> fileObjects =
                Arrays.asList(sourceObject);
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null,
                null, null, fileObjects);

        boolean result = task.call();
        if (result) {
            ClassLoader loader = new MyClassLoader();
            try {
                Class<?> clazz = loader.loadClass(CLASS_NAME);
                Method method = clazz.getMethod(CLASS_METHOD);
                Object value = method.invoke(null);
                return (Double) value;
            } catch (Exception e) {
                System.out.print(e.toString());
                return -1;
            }
        } else {
            throw new Exception("错误的表达式。");
        }

    }

    private String getCalculateSourceCode(String expr) {

        return "public class " + CLASS_NAME + " {"
                        + " public static double " + CLASS_METHOD + "() { "
                        + "return " + expr + ";" +
                        " } }";

    }

}
