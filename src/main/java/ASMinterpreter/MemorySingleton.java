package ASMinterpreter;

import java.util.LinkedList;

public class MemorySingleton {
    //-------------------------------------------Singleton part
    private static final MemorySingleton INSTANCE = new MemorySingleton();
    private MemorySingleton(){

    }
    public static MemorySingleton getInstance(){
        return INSTANCE;
    }
    //-------------------------------------------Memory part
    private LinkedList<Integer> stack = new LinkedList<Integer>();
    public void push(Integer value)
    {
        stack.addLast(value);
    }
    public Integer pop()
    {
        if (stack.size()==0)
            throw new RuntimeException();
        return stack.removeLast();
    }
    private Integer eax = null;
    private Integer ebx = null;
    private Integer ecx = null;
    private Integer edx = null;

    public Integer getEax() {
        return eax;
    }

    public void setEax(Integer eax) {
        this.eax = eax;
    }

    public Integer getEbx() {
        return ebx;
    }

    public void setEbx(Integer ebx) {
        this.ebx = ebx;
    }

    public Integer getEcx() {
        return ecx;
    }

    public void setEcx(Integer ecx) {
        this.ecx = ecx;
    }

    public Integer getEdx() {
        return edx;
    }

    public void setEdx(Integer edx) {
        this.edx = edx;
    }
    
}
