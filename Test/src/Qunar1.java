import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by zyt on 15/9/21 09:27.
 */
public class Qunar1 {

    static class Version implements Comparable<Version> {
        int major;
        int minor;
        int patchlevel;

        public Version(int major, int minor) {
            this.major = major;
            this.minor = minor;
        }

        public Version(int major, int minor, int patchlevel) {
            this(major, minor);
            this.patchlevel = patchlevel;
        }

        @Override
        public String toString() {
            if (patchlevel != 0)
                return this.major + "." + this.minor + "." + this.patchlevel;
            else
                return this.major + "." + this.minor;
        }

        public boolean isStable() {
            return this.minor % 2 == 0;
        }

        public int getMajor() {
            return major;
        }

        @Override
        public int compareTo(Version o) {
            if (this.major < o.major) {
                return -1;
            } else if (this.major > o.major) {
                return 1;
            } else {
                if (this.minor < o.minor) {
                    return -1;
                } else if (this.minor > o.minor) {
                    return 1;
                } else {
                    if (this.patchlevel < o.patchlevel) {
                        return -1;
                    } else if (this.patchlevel > o.patchlevel) {
                        return 1;
                    }
                }
            }
            return 0;
        }
    }

    public static Version findLinuxVersion(Version[] versions) {
        ArrayList<Version> stable = new ArrayList<>();
        for (int i = 0; i < versions.length; i++) {
            if (versions[i].isStable()) {
                stable.add(versions[i]);
            }
        }
        if (stable.size() == 0) {
            return null;
        }
        Collections.sort(stable);
        return stable.get(stable.size() - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            Version[] versions = new Version[n];
            for (int i = 0; i < n; i++) {
                String line = scan.next();
                String[] parts = line.split("\\.");
                if (parts.length == 2) {
                    versions[i] = new Version(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
                } else {
                    versions[i] = new Version(Integer.parseInt(parts[0]),
                            Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                }
            }
            Version version = findLinuxVersion(versions);
            if (version == null) {
                System.out.println("no stable available");
            } else {
                System.out.println(version.toString());
            }
        }
    }
}
