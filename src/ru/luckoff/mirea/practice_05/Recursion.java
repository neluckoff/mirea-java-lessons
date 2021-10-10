package ru.luckoff.mirea.practice_05;

import java.util.Scanner;

public class Recursion {
    public static String recursion1(int n) {
        int s = 0;
        int j = 0;
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; s < n; i++) {
                s += i;
                j = i;
            }
            System.out.print(recursion1(--n) + " " + j);
        }
        return "";
    }

    public static String recursion2(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion2(n - 1) + " " + n;
    }

    public static String recursion3(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion3(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion3(a + 1, b);
        }
    }

    public static int recursion4(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursion4(len + 1, sum + i, k, s);
        }
        return res;
    }

    public static int recursion5(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + recursion5(n / 10);
        }
    }

    public static boolean recursion6(int n, int i) {
        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return recursion6(n, i + 1);
        } else {
            return true;
        }
    }

    public static void recursion7(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            recursion7(n / k, k);
        }
        else {
            recursion7(n, ++k);
        }
    }

    public static String recursion8(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return recursion8(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    public static int recursion9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return recursion9(a, b - 1) + recursion9(a - 1, b - 1);
    }

    public static int recursion10(int n, int i) {
        return (n==0) ? i : recursion10( n/10, i*10 + n%10 );
    }

    public static int recursion11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return recursion11() + n + m;
            } else {
                int k = in.nextInt();
                if (k == 1) {
                    return recursion11() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            if (m == 1) {
                return recursion11() + n + m;
            } else {
                return n + m;
            }
        }
    }

    public static void recursion12() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                recursion12();
            } else {
                recursion12();
            }
        }
    }

    public static void recursion13() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) {
                recursion13();
            }
        }
    }

    public static String recursion14(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return recursion14(n / 10) + " " + n % 10;
        }
    }

    public static int recursion15(int n) {
        if (n < 10) {
            return n;
        }
        else {
            System.out.print(n % 10 + " ");
            return recursion15(n / 10);
        }
    }

    public static void recursion16(int max, int count) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                recursion16(n, 1);
            }
            else if (n == max) {
                recursion16(max, ++count);
            }
            else {
                recursion16(max, count);
            }
        } else {
            System.out.println(count);
        }
    }

    public static int recursion17() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            return 0;
        }
        else {
            return Math.max(n, recursion17());
        }
    }


}
