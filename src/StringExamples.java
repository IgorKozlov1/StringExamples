import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExamples {

    public static void main(String[] args) {
     //   m1();
     //   m2();
     //   m3();
      //  m4();
      //  m5();
       // m6Sb();
      //  m7Sb();
        //m8Sb();
       // regularExpressions();
        m9();
    }

    public static void m1(){
        String s1="s1";
        String s2=new String("s2");
        String s3="s1";
        String s4=new String("s1");
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        String s5=new String(new char[]{'h','e','l','l','o'});
        System.out.println(s5);
        System.out.println(s4.length());
        System.out.println(Arrays.toString(s4.toCharArray()));
        System.out.println(String.format("User %s opened page %s", "Ivan","stormnet.by"));
    }

    public static void m2(){

        String s1="s1";
        String s2="s2";
        String s3=s1+s2+"s5";
        String s5=s3.concat("s6");
        System.out.println(s5);
        System.out.println(null+s5);
        //System.out.println(s5.concat(null));
        System.out.println("s"+66+false);
    }


    public static void m3(){

        List<String> strings=new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        System.out.println(String.join(" ", strings));
        System.out.println(String.join("+","one","two","three"));
        System.out.println("java".charAt(1));
        String s="string";
        String s2="String";
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));  //игнор регистра
        String alfred="Alfred";
        String ben="Ben";
        System.out.println(alfred.compareTo(ben));
        System.out.println(alfred.compareTo("alfred"));
        System.out.println(alfred.compareToIgnoreCase("alfred"));
    }
    public static void m4(){

        System.out.println("Java".indexOf('a'));
        String javaRules="JavaRules";
        System.out.println(javaRules.indexOf("aR"));
        System.out.println(javaRules.indexOf("a"));
        System.out.println(javaRules.lastIndexOf("a"));
        System.out.println(javaRules.startsWith("Java"));
        System.out.println(javaRules.startsWith("x"));
        System.out.println(javaRules.endsWith("s"));
        System.out.println(javaRules.endsWith("x"));

    }

    public static void m5(){

        String helloWorld="Hello World";
        System.out.println(helloWorld.replace("o", "Hey,new"));
        System.out.println("   word   ".trim());
        System.out.println(helloWorld.substring(0,7));
        System.out.println(helloWorld.substring(0, helloWorld.indexOf(" ")));
        System.out.println(helloWorld.toLowerCase());
        System.out.println(helloWorld.toUpperCase());
        System.out.println(helloWorld.substring(helloWorld.indexOf("o")));
        System.out.println(helloWorld.substring(helloWorld.indexOf("r")));
    }
    public static void m6Sb(){

        StringBuilder sb=new StringBuilder("Hello ");
        sb.append("Java");
        System.out.println(sb);
        sb.append(". You ");
        System.out.println(sb);
        sb.append("are ").append("So").append(" cool ").append("!!!");
        System.out.println(sb);
    }
    public static void m7Sb(){

        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb.insert(0,"Ivan, "));
        System.out.println(sb.delete(1,3));
        System.out.println(sb.reverse());
    }
    public static void m8Sb(){
        StringBuffer sBuffer=new StringBuffer("Ivan");
        System.out.println("memory "+ sBuffer.capacity());
        sBuffer.ensureCapacity(50);
        sBuffer.append(" Petrov");
        System.out.println("new memory "+sBuffer.capacity());
        System.out.println("string length "+ sBuffer.length() );
    }
    public static void regularExpressions(){

        String hello="hello";
        boolean found= Pattern.matches("Hello", hello);
        System.out.println(found);
        Pattern smallLettersPattern=Pattern.compile("[a-zA-Z ]+");
        Matcher m1=smallLettersPattern.matcher(hello);
        System.out.println(m1.matches());
        Matcher m2=smallLettersPattern.matcher("a lot of small latters");
        System.out.println(m2.matches());
        Matcher m3=smallLettersPattern.matcher("One big letter");
        System.out.println(m3.matches());
        System.out.println();

        System.out.println(checkLogin("_@Best"));
        System.out.println(checkLogin("ab"));
        System.out.println(checkLogin("vovan"));
        System.out.println(checkLogin("vlad"));
        System.out.println(checkLogin("LOL"));
        System.out.println(checkLogin("vovanvovanvovan"));
        System.out.println(checkLogin("vovanvivanvovan1"));
        System.out.println(checkLogin("vovanvovanvova*"));
    }

    public static boolean checkLogin(String stringToCheck){

        Pattern p=Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m=p.matcher(stringToCheck);
        return m.matches();

    }
    public static void m9(){

        String welcome=new String("welcome-to-net");
        System.out.println(Arrays.toString(welcome.split("-")));
        String words=new String("Split this string to words");
        System.out.println(Arrays.toString(words.split(" ")));

        String s1 = "string";
        String s2 = "string";
        String s3 = new String("string");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}

