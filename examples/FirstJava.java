class FirstJava{ //--> class Name should be always same as file name without extension
    FirstJava(){} //--> This is a constructor method
    String FirstName; //--> This is a member variable, with default scope(protected)
    public static void main(String[] args) { //--> This is a main method, This method will be excuted when you run this class
        System.out.println("Welcome");
        FirstMethod("args","one","two"); //--> calling static method
    }

    static void FirstMethod(String ... args){
        int i=1;
        for (String s : args) {
            //int x=++i;
            System.out.println(String.format("Printing index %s, value %s", i++ , s));
            System.out.println("Printing index " + (--i) + ", value " + s);
            System.out.println("Printing index " + i + ", value " + s);
            ++i;
        }
        System.out.println(args.toString());
    }
}