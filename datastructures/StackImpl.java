package dk.cphbusiness.dat.datastructures;

import dk.cphbusiness.dat.datastructures.SimpleList;
import dk.cphbusiness.dat.datastructures.Stack;

public class StackImpl implements Stack {
    private SimpleList list;

    public StackImpl(SimpleList l)
    {
        list = l);
    }
    public int size()
    { return list.size();
    }

    @Override
    public void push(int value) {

    }

    @Override
    public int pop() {
        return 0;
    }
}