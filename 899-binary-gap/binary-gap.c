int binaryGap(int n) {
    int position=0;
    int previous=-1;
    int max_gap=0;
    while(n>0){
        if(n%2==1){
            if(previous!=-1){
            int gap=position-previous;
            if(gap>max_gap){
                max_gap=gap;
            }
        }
        previous=position;
    }
    n/=2;
    position++;
    }
    return max_gap;
}