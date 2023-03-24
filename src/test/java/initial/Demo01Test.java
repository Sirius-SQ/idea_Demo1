package initial;

import org.junit.Assert;
import org.junit.Test;

public class Demo01Test {
    @Test
    public void testSay(){
        Demo01 demo01=new Demo01();
        String ret =demo01.say("倾");
        Assert.assertEquals("hello 倾",ret);
    }

}
