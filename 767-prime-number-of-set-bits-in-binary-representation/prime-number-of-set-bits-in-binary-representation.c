int isPrime(int n) {
    if (n <= 1) return 0;

    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0)
            return 0;
    }
    return 1;
}
int countPrimeSetBits(int left, int right) {
    int result = 0;

    for (int i = left; i <= right; i++) {
        int num = i;
        int count = 0;

        while (num > 0) {
            count += num % 2;
            num /= 2;
        }

        if (isPrime(count))
            result++;
    }

    return result;
}
