package HomeWork10.tree;

interface Fish  { int getNumberOfScales(); }
interface Piano { int getNumberOfScales(); }
class Tuna implements Fish, Piano {
    public int getNumberOfScales() { return 91; }
}


