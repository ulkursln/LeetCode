// Implementation/Simulation
// Happy Number

  public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int total = 0;
        while( n != 1){
            if(set.contains(n)) return false;
            set.add(n);
            total = 0;
            while(n > 0){
                total += (n % 10) * (n % 10);
                n /= 10;
            }
            n = total;
        }
        return true;
    }
