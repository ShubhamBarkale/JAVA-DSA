import java.util.*;

class MNTEntry {
    String name;
    int mdtIndex;

    MNTEntry(String n, int i) {
        name = n;
        mdtIndex = i;
    }
}

class spprac2 {

    ArrayList<MNTEntry> mnt = new ArrayList<>();
    ArrayList<String> mdt = new ArrayList<>();

    boolean isMacro = false;

    void process(String line) {

        if (line.equals("MACRO")) {
            isMacro = true;
            return;
        }

        // Store macro name
        if (isMacro && mnt.size() == 0) {
            mnt.add(new MNTEntry(line, mdt.size()));
            return;
        }

        if (isMacro) {
            mdt.add(line);

            if (line.equals("MEND")) {
                isMacro = false;
            }
        }
    }

    void display() {

        System.out.println("MNT:");
        for (MNTEntry e : mnt)
            System.out.println(e.name + " -> " + e.mdtIndex);

        System.out.println("\nMDT:");
        for (int i = 0; i < mdt.size(); i++)
            System.out.println(i + " -> " + mdt.get(i));
    }

    public static void main(String[] args) {

         spprac2 mp = new  spprac2();

        String prog[] = {
            "MACRO",
            "INCR",
            "ADD AREG, ONE",
            "MEND",
            "START",
            "INCR",
            "END"
        };

        for (String line : prog)
            mp.process(line);

        mp.display();
    }
}