public class task7 {
        public static void main(String[] args) throws NumberFormatException {
                int n;
                n = Integer.parseInt(args[0]);
                        if (n > 0) {
                                double max = Math.sqrt(n);
                                int trueMax = (int) max;
                                if (max == (double) trueMax) {
                                        trueMax--;
                                }
                                for (int i = 1; i < trueMax; i++) {
                                        System.out.print(i + ",");
                                }
                                System.out.print(trueMax);
                        } else {
                                System.out.println("Please, check parameter");
                        }
                }
        }
