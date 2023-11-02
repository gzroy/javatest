package cn.roygao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
    private static final Logger LOG = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        int result = calculate(5);
        LOG.info("Result is {}", String.valueOf(result));
        System.out.println( "Hello World!" );
    }

    public static int calculate(int a) {
        int b = a*a +100;
        return b;
    }
}
