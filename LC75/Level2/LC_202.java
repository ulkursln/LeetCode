// Implementation/Simulation
// Happy Number

//SC = O(logn?)
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

//SC = O(1)

public boolean isHappy(int n) {
        
        int slow = n, fast = n;
        while( slow !=1 && fast != 1){
            slow = helper(slow);
            fast = helper(helper(fast));
            if(fast == slow  && fast !=1) return false;
        }
        return true;
    }

    int helper(int n){
        int total = 0;
        while(n > 0){
                total += (n % 10) * (n % 10);
                n /= 10;
        }
        return total;
    }
