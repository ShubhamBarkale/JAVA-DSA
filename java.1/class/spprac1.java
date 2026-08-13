import java.util.*;

class Symbol {
    String name;
    int address;

    Symbol(String n, int a) {
        name = n;
        address = a;
    }
}

class Literal {
    String value;
    int address;

    Literal(String v) {
        value = v;
        address = -1;
    }
}

class spprac1 {

    int LC = 0;

    ArrayList<Symbol> symtab = new ArrayList<>();
    ArrayList<Literal> littab = new ArrayList<>();

    void process(String line) {

        String[] parts = line.split(" ");

        if (parts[0].equals("START")) {
            LC = Integer.parseInt(parts[1]);
            return;
        }

        // Handle label
        if (parts.length == 3) {
            addSymbol(parts[0], LC);
            parts = Arrays.copyOfRange(parts, 1, parts.length);
        }

        // Handle literal
        if (line.contains("=")) {
            addLiteral(parts[1]);
        }

        LC++;
    }

    void addSymbol(String name, int addr) {
        for (Symbol s : symtab)
            if (s.name.equals(name))
                return;

        symtab.add(new Symbol(name, addr));
    }

    void addLiteral(String val) {
        for (Literal l : littab)
            if (l.value.equals(val))
                return;

        littab.add(new Literal(val));
    }

    void assignLiteralAddress() {
        for (Literal l : littab) {
            l.address = LC++;
        }
    }

    void display() {
        System.out.println("SYMBOL TABLE:");
        for (Symbol s : symtab)
            System.out.println(s.name + " -> " + s.address);

        System.out.println("\nLITERAL TABLE:");
        for (Literal l : littab)
            System.out.println(l.value + " -> " + l.address);
    }

    public static void main(String[] args) {

        spprac1 a = new spprac1();

        String prog[] = {
            "START 100",
            "MOVER AREG, ='5'",
            "ADD BREG, ONE",
            "ONE DC 1",
            "END"
        };

        for (String line : prog)
            a.process(line);

        a.assignLiteralAddress();
        a.display();
    }
}