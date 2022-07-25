public fib(int n){
    if(n==0){
        return 0
    }
    else if(n==1){
        return 1
    }
    
    return fib(n-1)+fib(n-2)
}

public power1(int num, int power){
    if (power ==0) {
        return 1
    }
    else{
        return num*power1(num, power-1)
    }
}

